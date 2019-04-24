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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeImage)) return false;
    final NativeImage other = (NativeImage) o;
    if (!other.canEqual(this)) return false;
    final Object this$type = this.getType();
    final Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$wmin = this.getWmin();
    final Object other$wmin = other.getWmin();
    if (this$wmin == null ? other$wmin != null : !this$wmin.equals(other$wmin)) return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$hmin = this.getHmin();
    final Object other$hmin = other.getHmin();
    if (this$hmin == null ? other$hmin != null : !this$hmin.equals(other$hmin)) return false;
    final Object this$mimes = this.getMimes();
    final Object other$mimes = other.getMimes();
    if (this$mimes == null ? other$mimes != null : !this$mimes.equals(other$mimes)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final Object $w = this.getW();
    result = result * PRIME + ($w == null ? 43 : $w.hashCode());
    final Object $wmin = this.getWmin();
    result = result * PRIME + ($wmin == null ? 43 : $wmin.hashCode());
    final Object $h = this.getH();
    result = result * PRIME + ($h == null ? 43 : $h.hashCode());
    final Object $hmin = this.getHmin();
    result = result * PRIME + ($hmin == null ? 43 : $hmin.hashCode());
    final Object $mimes = this.getMimes();
    result = result * PRIME + ($mimes == null ? 43 : $mimes.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeImage;
  }

  public String toString() {
    return "net.media.openrtb25.request.NativeImage(type="
        + this.getType()
        + ", w="
        + this.getW()
        + ", wmin="
        + this.getWmin()
        + ", h="
        + this.getH()
        + ", hmin="
        + this.getHmin()
        + ", mimes="
        + this.getMimes()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
