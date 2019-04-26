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

package net.media.openrtb3;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Created by rajat.go on 14/12/18. */
public class DataAsset {
  @NotBlank private String value;
  private Integer len;
  private Integer type;
  private Map<String, Object> ext;

  public DataAsset() {}

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Integer getLen() {
    return this.len;
  }

  public void setLen(Integer len) {
    this.len = len;
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataAsset dataAsset = (DataAsset) o;
    return Objects.equals(getValue(), dataAsset.getValue())
        && Objects.equals(getLen(), dataAsset.getLen())
        && Objects.equals(getType(), dataAsset.getType())
        && Objects.equals(getExt(), dataAsset.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getValue(), getLen(), getType(), getExt());
  }
}
