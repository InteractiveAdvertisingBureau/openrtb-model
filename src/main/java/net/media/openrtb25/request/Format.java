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

/** Created by rajat.go on 13/10/16. */
public class Format {

  private Integer w;

  private Integer h;

  private Integer wratio;

  private Integer hratio;

  private Integer wmin;

  private Map<String, Object> ext;

  public Format() {}

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getWratio() {
    return this.wratio;
  }

  public void setWratio(Integer wratio) {
    this.wratio = wratio;
  }

  public Integer getHratio() {
    return this.hratio;
  }

  public void setHratio(Integer hratio) {
    this.hratio = hratio;
  }

  public Integer getWmin() {
    return this.wmin;
  }

  public void setWmin(Integer wmin) {
    this.wmin = wmin;
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
    Format format = (Format) o;
    return Objects.equals(getW(), format.getW())
        && Objects.equals(getH(), format.getH())
        && Objects.equals(getWratio(), format.getWratio())
        && Objects.equals(getHratio(), format.getHratio())
        && Objects.equals(getWmin(), format.getWmin())
        && Objects.equals(getExt(), format.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getW(), getH(), getWratio(), getHratio(), getWmin(), getExt());
  }
}
