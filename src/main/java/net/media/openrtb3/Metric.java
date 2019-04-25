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

import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Objects;

/** Created by shiva.b on 14/12/18. */
public class Metric {
  private String type;
  @NotNull private Double value;
  private String vendor;
  private Map<String, Object> ext;

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public @NotNull Double getValue() {
    return this.value;
  }

  public void setValue(@NotNull Double value) {
    this.value = value;
  }

  public String getVendor() {
    return this.vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
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
    Metric metric = (Metric) o;
    return Objects.equals(getType(), metric.getType())
        && Objects.equals(getValue(), metric.getValue())
        && Objects.equals(getVendor(), metric.getVendor())
        && Objects.equals(getExt(), metric.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getType(), getValue(), getVendor(), getExt());
  }
}
