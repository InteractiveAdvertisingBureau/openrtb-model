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

import javax.validation.constraints.NotNull;
import java.util.Map;

public class NativeTitle {

  @NotNull private Integer len;

  private Map<String, Object> ext;

  public NativeTitle() {}

  public @NotNull Integer getLen() {
    return this.len;
  }

  public void setLen(@NotNull Integer len) {
    this.len = len;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeTitle)) return false;
    final NativeTitle other = (NativeTitle) o;
    if (!other.canEqual(this)) return false;
    final Object this$len = this.getLen();
    final Object other$len = other.getLen();
    if (this$len == null ? other$len != null : !this$len.equals(other$len)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $len = this.getLen();
    result = result * PRIME + ($len == null ? 43 : $len.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeTitle;
  }

  public String toString() {
    return "net.media.openrtb25.request.NativeTitle(len="
        + this.getLen()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
