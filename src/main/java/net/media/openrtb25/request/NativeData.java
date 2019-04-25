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

package net.media.openrtb25.request;

import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class NativeData {

  @NotNull private Integer type;

  private Integer len;

  private Map<String, Object> ext;

  public NativeData() {}

  public @NotNull Integer getType() {
    return this.type;
  }

  public void setType(@NotNull Integer type) {
    this.type = type;
  }

  public Integer getLen() {
    return this.len;
  }

  public void setLen(Integer len) {
    this.len = len;
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
    NativeData that = (NativeData) o;
    return Objects.equals(getType(), that.getType()) &&
      Objects.equals(getLen(), that.getLen()) &&
      Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getType(), getLen(), getExt());
  }
}
