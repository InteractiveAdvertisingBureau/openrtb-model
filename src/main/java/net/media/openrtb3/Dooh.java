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

package net.media.openrtb3;

import java.util.Map;
import java.util.Objects;

public class Dooh extends DistributionChannel {

  private Integer venue;
  private Integer fixed;
  private Integer etime;
  private Integer dpi;
  private Map<String, Object> ext;

  public Integer getVenue() {
    return this.venue;
  }

  public void setVenue(Integer venue) {
    this.venue = venue;
  }

  public Integer getFixed() {
    return this.fixed;
  }

  public void setFixed(Integer fixed) {
    this.fixed = fixed;
  }

  public Integer getEtime() {
    return this.etime;
  }

  public void setEtime(Integer etime) {
    this.etime = etime;
  }

  public Integer getDpi() {
    return this.dpi;
  }

  public void setDpi(Integer dpi) {
    this.dpi = dpi;
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
    Dooh dooh = (Dooh) o;
    return Objects.equals(getVenue(), dooh.getVenue())
        && Objects.equals(getFixed(), dooh.getFixed())
        && Objects.equals(getEtime(), dooh.getEtime())
        && Objects.equals(getDpi(), dooh.getDpi())
        && Objects.equals(getExt(), dooh.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getVenue(), getFixed(), getEtime(), getDpi(), getExt());
  }
}
