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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Format)) return false;
    final Format other = (Format) o;
    if (!other.canEqual(this)) return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$wratio = this.getWratio();
    final Object other$wratio = other.getWratio();
    if (this$wratio == null ? other$wratio != null : !this$wratio.equals(other$wratio))
      return false;
    final Object this$hratio = this.getHratio();
    final Object other$hratio = other.getHratio();
    if (this$hratio == null ? other$hratio != null : !this$hratio.equals(other$hratio))
      return false;
    final Object this$wmin = this.getWmin();
    final Object other$wmin = other.getWmin();
    if (this$wmin == null ? other$wmin != null : !this$wmin.equals(other$wmin)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $w = this.getW();
    result = result * PRIME + ($w == null ? 43 : $w.hashCode());
    final Object $h = this.getH();
    result = result * PRIME + ($h == null ? 43 : $h.hashCode());
    final Object $wratio = this.getWratio();
    result = result * PRIME + ($wratio == null ? 43 : $wratio.hashCode());
    final Object $hratio = this.getHratio();
    result = result * PRIME + ($hratio == null ? 43 : $hratio.hashCode());
    final Object $wmin = this.getWmin();
    result = result * PRIME + ($wmin == null ? 43 : $wmin.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Format;
  }

  public String toString() {
    return "net.media.openrtb25.request.Format(w="
        + this.getW()
        + ", h="
        + this.getH()
        + ", wratio="
        + this.getWratio()
        + ", hratio="
        + this.getHratio()
        + ", wmin="
        + this.getWmin()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
