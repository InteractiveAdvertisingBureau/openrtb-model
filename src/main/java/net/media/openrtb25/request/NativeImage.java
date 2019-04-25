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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class NativeImage {

  private Integer type;

  private Integer w;

  private Integer wmin;

  private Integer h;

  private Integer hmin;

  private Collection<String> mimes;

  private Map<String, Object> ext;

  public NativeImage() {}

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getWmin() {
    return this.wmin;
  }

  public void setWmin(Integer wmin) {
    this.wmin = wmin;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getHmin() {
    return this.hmin;
  }

  public void setHmin(Integer hmin) {
    this.hmin = hmin;
  }

  public Collection<String> getMimes() {
    return this.mimes;
  }

  public void setMimes(Collection<String> mimes) {
    this.mimes = mimes;
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
    NativeImage that = (NativeImage) o;
    return Objects.equals(getType(), that.getType())
        && Objects.equals(getW(), that.getW())
        && Objects.equals(getWmin(), that.getWmin())
        && Objects.equals(getH(), that.getH())
        && Objects.equals(getHmin(), that.getHmin())
        && Objects.equals(getMimes(), that.getMimes())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getType(), getW(), getWmin(), getH(), getHmin(), getMimes(), getExt());
  }
}
