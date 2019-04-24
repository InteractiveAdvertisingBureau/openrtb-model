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

package net.media.openrtb3;

import net.media.utils.validator.CheckExactlyOneNotNull;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

/** Created by shiva.b on 17/12/18. */
@CheckExactlyOneNotNull(fieldNames = {"video", "audio", "display"})
public class Ad {

  @NotNull private String id;
  private Collection<String> adomain = null;
  private Collection<String> bundle = null;
  private String iurl;
  private Collection<String> cat = null;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private String lang;
  private Collection<Integer> attr = null;
  private Integer secure;
  private Integer mrating;
  private Integer init;
  private Integer lastmod;
  @Valid private Display display;
  @Valid private Video video;
  @Valid private Audio audio;
  @Valid private Audit audit;
  private Map<String, Object> ext;

  public Ad() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public Collection<String> getAdomain() {
    return this.adomain;
  }

  public void setAdomain(Collection<String> adomain) {
    this.adomain = adomain;
  }

  public Collection<String> getBundle() {
    return this.bundle;
  }

  public void setBundle(Collection<String> bundle) {
    this.bundle = bundle;
  }

  public String getIurl() {
    return this.iurl;
  }

  public void setIurl(String iurl) {
    this.iurl = iurl;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public Integer getCattax() {
    return this.cattax;
  }

  public void setCattax(Integer cattax) {
    this.cattax = cattax;
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Collection<Integer> getAttr() {
    return this.attr;
  }

  public void setAttr(Collection<Integer> attr) {
    this.attr = attr;
  }

  public Integer getSecure() {
    return this.secure;
  }

  public void setSecure(Integer secure) {
    this.secure = secure;
  }

  public Integer getMrating() {
    return this.mrating;
  }

  public void setMrating(Integer mrating) {
    this.mrating = mrating;
  }

  public Integer getInit() {
    return this.init;
  }

  public void setInit(Integer init) {
    this.init = init;
  }

  public Integer getLastmod() {
    return this.lastmod;
  }

  public void setLastmod(Integer lastmod) {
    this.lastmod = lastmod;
  }

  public @Valid
  Display getDisplay() {
    return this.display;
  }

  public void setDisplay(@Valid Display display) {
    this.display = display;
  }

  public @Valid
  Video getVideo() {
    return this.video;
  }

  public void setVideo(@Valid Video video) {
    this.video = video;
  }

  public @Valid Audio getAudio() {
    return this.audio;
  }

  public void setAudio(@Valid Audio audio) {
    this.audio = audio;
  }

  public @Valid
  Audit getAudit() {
    return this.audit;
  }

  public void setAudit(@Valid Audit audit) {
    this.audit = audit;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Ad)) return false;
    final Ad other = (Ad) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$adomain = this.getAdomain();
    final Object other$adomain = other.getAdomain();
    if (this$adomain == null ? other$adomain != null : !this$adomain.equals(other$adomain))
      return false;
    final Object this$bundle = this.getBundle();
    final Object other$bundle = other.getBundle();
    if (this$bundle == null ? other$bundle != null : !this$bundle.equals(other$bundle))
      return false;
    final Object this$iurl = this.getIurl();
    final Object other$iurl = other.getIurl();
    if (this$iurl == null ? other$iurl != null : !this$iurl.equals(other$iurl)) return false;
    final Object this$cat = this.getCat();
    final Object other$cat = other.getCat();
    if (this$cat == null ? other$cat != null : !this$cat.equals(other$cat)) return false;
    final Object this$cattax = this.getCattax();
    final Object other$cattax = other.getCattax();
    if (this$cattax == null ? other$cattax != null : !this$cattax.equals(other$cattax))
      return false;
    final Object this$lang = this.getLang();
    final Object other$lang = other.getLang();
    if (this$lang == null ? other$lang != null : !this$lang.equals(other$lang)) return false;
    final Object this$attr = this.getAttr();
    final Object other$attr = other.getAttr();
    if (this$attr == null ? other$attr != null : !this$attr.equals(other$attr)) return false;
    final Object this$secure = this.getSecure();
    final Object other$secure = other.getSecure();
    if (this$secure == null ? other$secure != null : !this$secure.equals(other$secure))
      return false;
    final Object this$mrating = this.getMrating();
    final Object other$mrating = other.getMrating();
    if (this$mrating == null ? other$mrating != null : !this$mrating.equals(other$mrating))
      return false;
    final Object this$init = this.getInit();
    final Object other$init = other.getInit();
    if (this$init == null ? other$init != null : !this$init.equals(other$init)) return false;
    final Object this$lastmod = this.getLastmod();
    final Object other$lastmod = other.getLastmod();
    if (this$lastmod == null ? other$lastmod != null : !this$lastmod.equals(other$lastmod))
      return false;
    final Object this$display = this.getDisplay();
    final Object other$display = other.getDisplay();
    if (this$display == null ? other$display != null : !this$display.equals(other$display))
      return false;
    final Object this$video = this.getVideo();
    final Object other$video = other.getVideo();
    if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
    final Object this$audio = this.getAudio();
    final Object other$audio = other.getAudio();
    if (this$audio == null ? other$audio != null : !this$audio.equals(other$audio)) return false;
    final Object this$audit = this.getAudit();
    final Object other$audit = other.getAudit();
    if (this$audit == null ? other$audit != null : !this$audit.equals(other$audit)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $adomain = this.getAdomain();
    result = result * PRIME + ($adomain == null ? 43 : $adomain.hashCode());
    final Object $bundle = this.getBundle();
    result = result * PRIME + ($bundle == null ? 43 : $bundle.hashCode());
    final Object $iurl = this.getIurl();
    result = result * PRIME + ($iurl == null ? 43 : $iurl.hashCode());
    final Object $cat = this.getCat();
    result = result * PRIME + ($cat == null ? 43 : $cat.hashCode());
    final Object $cattax = this.getCattax();
    result = result * PRIME + ($cattax == null ? 43 : $cattax.hashCode());
    final Object $lang = this.getLang();
    result = result * PRIME + ($lang == null ? 43 : $lang.hashCode());
    final Object $attr = this.getAttr();
    result = result * PRIME + ($attr == null ? 43 : $attr.hashCode());
    final Object $secure = this.getSecure();
    result = result * PRIME + ($secure == null ? 43 : $secure.hashCode());
    final Object $mrating = this.getMrating();
    result = result * PRIME + ($mrating == null ? 43 : $mrating.hashCode());
    final Object $init = this.getInit();
    result = result * PRIME + ($init == null ? 43 : $init.hashCode());
    final Object $lastmod = this.getLastmod();
    result = result * PRIME + ($lastmod == null ? 43 : $lastmod.hashCode());
    final Object $display = this.getDisplay();
    result = result * PRIME + ($display == null ? 43 : $display.hashCode());
    final Object $video = this.getVideo();
    result = result * PRIME + ($video == null ? 43 : $video.hashCode());
    final Object $audio = this.getAudio();
    result = result * PRIME + ($audio == null ? 43 : $audio.hashCode());
    final Object $audit = this.getAudit();
    result = result * PRIME + ($audit == null ? 43 : $audit.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Ad;
  }

  public String toString() {
    return "net.media.openrtb3.Ad(id="
        + this.getId()
        + ", adomain="
        + this.getAdomain()
        + ", bundle="
        + this.getBundle()
        + ", iurl="
        + this.getIurl()
        + ", cat="
        + this.getCat()
        + ", cattax="
        + this.getCattax()
        + ", lang="
        + this.getLang()
        + ", attr="
        + this.getAttr()
        + ", secure="
        + this.getSecure()
        + ", mrating="
        + this.getMrating()
        + ", init="
        + this.getInit()
        + ", lastmod="
        + this.getLastmod()
        + ", display="
        + this.getDisplay()
        + ", video="
        + this.getVideo()
        + ", audio="
        + this.getAudio()
        + ", audit="
        + this.getAudit()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
