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

import net.media.openrtb3.Event;
import org.apache.commons.lang3.StringUtils;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/** Created by rohit.ji on 23/04/19. */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = Ortb3EventObjectValidator.Validator.class)
@Documented
public @interface Ortb3EventObjectValidator {
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class Validator implements ConstraintValidator<Ortb3EventObjectValidator, Event> {
        @Override
        public boolean isValid(Event event, ConstraintValidatorContext context) {
            if (event == null || event.getMethod() == null) {
                return true;
            }
            int method = event.getMethod();
            if (1 <= method && method <= 2) {
                if (StringUtils.isNotBlank(event.getUrl())) {
                    return true;
                } else {
                    ValidatorErrorHandler.setErrorMessage(
                            context, "Event.url is required for given Event.method(" + method + ").");
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}
