/*
 * Copyright  2019 - present. IAB Tech Lab
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Regs regs = (Regs) o;
    return Objects.equals(getCoppa(), regs.getCoppa()) && Objects.equals(getExt(), regs.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCoppa(), getExt());
  }
}
