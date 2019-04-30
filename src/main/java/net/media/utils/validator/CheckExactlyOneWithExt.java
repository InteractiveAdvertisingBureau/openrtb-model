/*
 * Copyright  2019 - present. MEDIA.NET ADVERTISING FZ-LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.media.utils.validator;

import net.media.utils.CommonConstants;
import org.apache.commons.beanutils.PropertyUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = CheckExactlyOneWithExt.CheckExactlyOneNotNullValidator.class)
@Documented
public @interface CheckExactlyOneWithExt {
  String message() default "";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String[] fieldNames();
  String[] extFieldNames();

  class CheckExactlyOneNotNullValidator
    implements ConstraintValidator<CheckExactlyOneWithExt, Object> {
    private String[] fieldNames;
    private String[] extFieldNames;

    public void initialize(CheckExactlyOneWithExt constraint) {

      this.fieldNames = constraint.fieldNames();
      this.extFieldNames = constraint.extFieldNames();
    }

    public boolean isValid(Object object, ConstraintValidatorContext context) {
      if (object == null) {
        return true;
      }
      boolean firstField = false;
      try {
        for (String fieldName : fieldNames) {
          Object property = PropertyUtils.getProperty(object, fieldName);
          if (property != null) {
            if (firstField) {
              return returnFailedValidation(context);
            }
            firstField = true;
          }
        }

        Object extObject = PropertyUtils.getProperty(object,  CommonConstants.EXT);
        if(extObject != null) {
          for (String fieldName : extFieldNames) {
            Object property = PropertyUtils.getProperty(extObject, fieldName);
            if (property != null) {
              if (firstField) {
                return returnFailedValidation(context);
              }
              firstField = true;
            }
          }

        }

        if (firstField) {
          return true;
        }
        return returnFailedValidation(context);
      } catch (Exception e) {
        return returnFailedValidation(context);
      }
    }

    boolean returnFailedValidation(ConstraintValidatorContext context) {
      ValidatorErrorHandler.setErrorMessage(
        context, "Exactly one of the following should be present: " + Arrays.toString(fieldNames) + "in object or" + Arrays.toString(extFieldNames) +" in object.ext" );
      return false;
    }

  }
}
