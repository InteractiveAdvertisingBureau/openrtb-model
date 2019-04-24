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

/** Created by vishnu on 6/5/16. */
public class Banner {

  private Integer w;

  private Integer h;

  private Collection<Format> format;

  private String id;

  private Collection<Integer> btype;

  private Collection<Integer> battr;

  private Integer pos;

  private Collection<String> mimes;

  private Integer topframe;

  private Integer wmax;

  private Integer wmin;

  private Integer hmax;

  private Integer hmin;

  private Collection<Integer> expdir;

  private Collection<Integer> api;

  private Integer vcm;

  private Map<String, Object> ext;

  public Banner(Banner banner) {
    this.id = banner.id;
    this.w = banner.w;
    this.h = banner.h;
    this.format = banner.format;
    this.btype = banner.btype;
    this.battr = banner.battr;
    this.pos = banner.pos;
    this.mimes = banner.mimes;
    this.topframe = banner.topframe;
    this.expdir = banner.expdir;
    this.api = banner.api;
    this.ext = banner.ext;
  }

  public Banner() {}

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

  public Collection<Format> getFormat() {
    return this.format;
  }

  public void setFormat(Collection<Format> format) {
    this.format = format;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Collection<Integer> getBtype() {
    return this.btype;
  }

  public void setBtype(Collection<Integer> btype) {
    this.btype = btype;
  }

  public Collection<Integer> getBattr() {
    return this.battr;
  }

  public void setBattr(Collection<Integer> battr) {
    this.battr = battr;
  }

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Collection<String> getMimes() {
    return this.mimes;
  }

  public void setMimes(Collection<String> mimes) {
    this.mimes = mimes;
  }

  public Integer getWmax() {
    return wmax;
  }

  public void setWmax(Integer wmax) {
    this.wmax = wmax;
  }

  public Integer getWmin() {
    return wmin;
  }

  public void setWmin(Integer wmin) {
    this.wmin = wmin;
  }

  public Integer getHmax() {
    return hmax;
  }

  public void setHmax(Integer hmax) {
    this.hmax = hmax;
  }

  public Integer getHmin() {
    return hmin;
  }

  public void setHmin(Integer hmin) {
    this.hmin = hmin;
  }

  public Integer getTopframe() {
    return this.topframe;
  }

  public void setTopframe(Integer topframe) {
    this.topframe = topframe;
  }

  public Collection<Integer> getExpdir() {
    return this.expdir;
  }

  public void setExpdir(Collection<Integer> expdir) {
    this.expdir = expdir;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public Integer getVcm() {
    return this.vcm;
  }

  public void setVcm(Integer vcm) {
    this.vcm = vcm;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Banner)) return false;
    final Banner other = (Banner) o;
    if (!other.canEqual(this)) return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$format = this.getFormat();
    final Object other$format = other.getFormat();
    if (this$format == null ? other$format != null : !this$format.equals(other$format))
      return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$btype = this.getBtype();
    final Object other$btype = other.getBtype();
    if (this$btype == null ? other$btype != null : !this$btype.equals(other$btype)) return false;
    final Object this$battr = this.getBattr();
    final Object other$battr = other.getBattr();
    if (this$battr == null ? other$battr != null : !this$battr.equals(other$battr)) return false;
    final Object this$pos = this.getPos();
    final Object other$pos = other.getPos();
    if (this$pos == null ? other$pos != null : !this$pos.equals(other$pos)) return false;
    final Object this$mimes = this.getMimes();
    final Object other$mimes = other.getMimes();
    if (this$mimes == null ? other$mimes != null : !this$mimes.equals(other$mimes)) return false;
    final Object this$topframe = this.getTopframe();
    final Object other$topframe = other.getTopframe();
    if (this$topframe == null ? other$topframe != null : !this$topframe.equals(other$topframe))
      return false;
    final Object this$hmax = this.getHmax();
    final Object other$hmax = other.getHmax();
    if (this$hmax == null ? other$hmax != null : !this$hmax.equals(other$hmax)) return false;
    final Object this$hmin = this.getHmin();
    final Object other$hmin = other.getHmin();
    if (this$hmin == null ? other$hmin != null : !this$hmin.equals(other$hmin)) return false;
    final Object this$wmax = this.getWmax();
    final Object other$wmax = other.getWmax();
    if (this$wmax == null ? other$wmax != null : !this$wmax.equals(other$wmax)) return false;
    final Object this$wmin = this.getWmin();
    final Object other$wmin = other.getWmin();
    if (this$wmin == null ? other$wmin != null : !this$wmin.equals(other$wmin)) return false;
    final Object this$expdir = this.getExpdir();
    final Object other$expdir = other.getExpdir();
    if (this$expdir == null ? other$expdir != null : !this$expdir.equals(other$expdir))
      return false;
    final Object this$api = this.getApi();
    final Object other$api = other.getApi();
    if (this$api == null ? other$api != null : !this$api.equals(other$api)) return false;
    final Object this$vcm = this.getVcm();
    final Object other$vcm = other.getVcm();
    if (this$vcm == null ? other$vcm != null : !this$vcm.equals(other$vcm)) return false;
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
    final Object $format = this.getFormat();
    result = result * PRIME + ($format == null ? 43 : $format.hashCode());
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $btype = this.getBtype();
    result = result * PRIME + ($btype == null ? 43 : $btype.hashCode());
    final Object $battr = this.getBattr();
    result = result * PRIME + ($battr == null ? 43 : $battr.hashCode());
    final Object $pos = this.getPos();
    result = result * PRIME + ($pos == null ? 43 : $pos.hashCode());
    final Object $mimes = this.getMimes();
    result = result * PRIME + ($mimes == null ? 43 : $mimes.hashCode());
    final Object $hmax = this.getHmax();
    result = result * PRIME + ($hmax == null ? 43 : $hmax.hashCode());
    final Object $hmin = this.getHmin();
    result = result * PRIME + ($hmin == null ? 43 : $hmin.hashCode());
    final Object $wmax = this.getWmax();
    result = result * PRIME + ($wmax == null ? 43 : $wmax.hashCode());
    final Object $wmin = this.getWmin();
    result = result * PRIME + ($wmin == null ? 43 : $wmin.hashCode());
    final Object $topframe = this.getTopframe();
    result = result * PRIME + ($topframe == null ? 43 : $topframe.hashCode());
    final Object $expdir = this.getExpdir();
    result = result * PRIME + ($expdir == null ? 43 : $expdir.hashCode());
    final Object $api = this.getApi();
    result = result * PRIME + ($api == null ? 43 : $api.hashCode());
    final Object $vcm = this.getVcm();
    result = result * PRIME + ($vcm == null ? 43 : $vcm.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Banner;
  }

  public String toString() {
    return "net.media.openrtb25.request.Banner(w="
        + this.getW()
        + ", h="
        + this.getH()
        + ", format="
        + this.getFormat()
        + ", id="
        + this.getId()
        + ", btype="
        + this.getBtype()
        + ", battr="
        + this.getBattr()
        + ", pos="
        + this.getPos()
        + ", mimes="
        + this.getMimes()
        + ", topframe="
        + this.getTopframe()
        + ", expdir="
        + this.getExpdir()
        + ", api="
        + this.getApi()
        + ", vcm="
        + this.getVcm()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
