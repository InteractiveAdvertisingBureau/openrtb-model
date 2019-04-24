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

/** Created by rajat.go on 14/10/16. */
public class Regs {

  private Integer coppa;

  private Map<String, Object> ext;

  public Regs() {}

  public Integer getCoppa() {
    return this.coppa;
  }

  public void setCoppa(Integer coppa) {
    this.coppa = coppa;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Regs)) return false;
    final Regs other = (Regs) o;
    if (!other.canEqual(this)) return false;
    final Object this$coppa = this.getCoppa();
    final Object other$coppa = other.getCoppa();
    if (this$coppa == null ? other$coppa != null : !this$coppa.equals(other$coppa)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $coppa = this.getCoppa();
    result = result * PRIME + ($coppa == null ? 43 : $coppa.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Regs;
  }

  public String toString() {
    return "net.media.openrtb25.request.Regs(coppa="
        + this.getCoppa()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
