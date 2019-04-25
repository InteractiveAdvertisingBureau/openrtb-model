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

import com.fasterxml.jackson.annotation.JsonProperty;
import net.media.utils.validator.CheckAtLeastOneNotNull;

import java.util.Collection;
import java.util.Map;

@CheckAtLeastOneNotNull(fieldNames = {"video", "banner", "nat", "audio"})
public class Imp {

  private static final double DEFAULT_BIDFLOOR = 0.0;

  private String id;

  private Video video;

  private Banner banner;

  private Audio audio;

  @JsonProperty("native")
  private Native nat;

  @JsonProperty("tagid")
  private String tagId;

  private String displaymanager;

  private String displaymanagerver;

  private Integer instl;

  private double bidfloor = DEFAULT_BIDFLOOR;

  private String bidfloorcur;

  private Integer secure;

  private Collection<String> iframebuster;

  private Pmp pmp;

  private Integer clickbrowser;

  private Integer exp;

  private Collection<Metric> metric;

  private Map<String, Object> ext;

  public Imp() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Video getVideo() {
    return this.video;
  }

  public void setVideo(Video video) {
    this.video = video;
  }

  public Banner getBanner() {
    return this.banner;
  }

  public void setBanner(Banner banner) {
    this.banner = banner;
  }

  public Audio getAudio() {
    return this.audio;
  }

  public void setAudio(Audio audio) {
    this.audio = audio;
  }

  public Native getNat() {
    return this.nat;
  }

  public void setNat(Native nat) {
    this.nat = nat;
  }

  public String getTagId() {
    return this.tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public String getDisplaymanager() {
    return this.displaymanager;
  }

  public void setDisplaymanager(String displaymanager) {
    this.displaymanager = displaymanager;
  }

  public String getDisplaymanagerver() {
    return this.displaymanagerver;
  }

  public void setDisplaymanagerver(String displaymanagerver) {
    this.displaymanagerver = displaymanagerver;
  }

  public Integer getInstl() {
    return this.instl;
  }

  public void setInstl(Integer instl) {
    this.instl = instl;
  }

  public double getBidfloor() {
    return this.bidfloor;
  }

  public void setBidfloor(double bidfloor) {
    this.bidfloor = bidfloor;
  }

  public String getBidfloorcur() {
    return this.bidfloorcur;
  }

  public void setBidfloorcur(String bidfloorcur) {
    this.bidfloorcur = bidfloorcur;
  }

  public Integer getSecure() {
    return this.secure;
  }

  public void setSecure(Integer secure) {
    this.secure = secure;
  }

  public Collection<String> getIframebuster() {
    return this.iframebuster;
  }

  public void setIframebuster(Collection<String> iframebuster) {
    this.iframebuster = iframebuster;
  }

  public Pmp getPmp() {
    return this.pmp;
  }

  public void setPmp(Pmp pmp) {
    this.pmp = pmp;
  }

  public Integer getClickbrowser() {
    return this.clickbrowser;
  }

  public void setClickbrowser(Integer clickbrowser) {
    this.clickbrowser = clickbrowser;
  }

  public Integer getExp() {
    return this.exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public Collection<Metric> getMetric() {
    return this.metric;
  }

  public void setMetric(Collection<Metric> metric) {
    this.metric = metric;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Imp)) return false;
    final Imp other = (Imp) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$video = this.getVideo();
    final Object other$video = other.getVideo();
    if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
    final Object this$banner = this.getBanner();
    final Object other$banner = other.getBanner();
    if (this$banner == null ? other$banner != null : !this$banner.equals(other$banner))
      return false;
    final Object this$audio = this.getAudio();
    final Object other$audio = other.getAudio();
    if (this$audio == null ? other$audio != null : !this$audio.equals(other$audio)) return false;
    final Object this$nat = this.getNat();
    final Object other$nat = other.getNat();
    if (this$nat == null ? other$nat != null : !this$nat.equals(other$nat)) return false;
    final Object this$tagId = this.getTagId();
    final Object other$tagId = other.getTagId();
    if (this$tagId == null ? other$tagId != null : !this$tagId.equals(other$tagId)) return false;
    final Object this$displaymanager = this.getDisplaymanager();
    final Object other$displaymanager = other.getDisplaymanager();
    if (this$displaymanager == null
        ? other$displaymanager != null
        : !this$displaymanager.equals(other$displaymanager)) return false;
    final Object this$displaymanagerver = this.getDisplaymanagerver();
    final Object other$displaymanagerver = other.getDisplaymanagerver();
    if (this$displaymanagerver == null
        ? other$displaymanagerver != null
        : !this$displaymanagerver.equals(other$displaymanagerver)) return false;
    final Object this$instl = this.getInstl();
    final Object other$instl = other.getInstl();
    if (this$instl == null ? other$instl != null : !this$instl.equals(other$instl)) return false;
    if (Double.compare(this.getBidfloor(), other.getBidfloor()) != 0) return false;
    final Object this$bidfloorcur = this.getBidfloorcur();
    final Object other$bidfloorcur = other.getBidfloorcur();
    if (this$bidfloorcur == null
        ? other$bidfloorcur != null
        : !this$bidfloorcur.equals(other$bidfloorcur)) return false;
    final Object this$secure = this.getSecure();
    final Object other$secure = other.getSecure();
    if (this$secure == null ? other$secure != null : !this$secure.equals(other$secure))
      return false;
    final Object this$iframebuster = this.getIframebuster();
    final Object other$iframebuster = other.getIframebuster();
    if (this$iframebuster == null
        ? other$iframebuster != null
        : !this$iframebuster.equals(other$iframebuster)) return false;
    final Object this$pmp = this.getPmp();
    final Object other$pmp = other.getPmp();
    if (this$pmp == null ? other$pmp != null : !this$pmp.equals(other$pmp)) return false;
    final Object this$clickbrowser = this.getClickbrowser();
    final Object other$clickbrowser = other.getClickbrowser();
    if (this$clickbrowser == null
        ? other$clickbrowser != null
        : !this$clickbrowser.equals(other$clickbrowser)) return false;
    final Object this$exp = this.getExp();
    final Object other$exp = other.getExp();
    if (this$exp == null ? other$exp != null : !this$exp.equals(other$exp)) return false;
    final Object this$metric = this.getMetric();
    final Object other$metric = other.getMetric();
    if (this$metric == null ? other$metric != null : !this$metric.equals(other$metric))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $video = this.getVideo();
    result = result * PRIME + ($video == null ? 43 : $video.hashCode());
    final Object $banner = this.getBanner();
    result = result * PRIME + ($banner == null ? 43 : $banner.hashCode());
    final Object $audio = this.getAudio();
    result = result * PRIME + ($audio == null ? 43 : $audio.hashCode());
    final Object $nat = this.getNat();
    result = result * PRIME + ($nat == null ? 43 : $nat.hashCode());
    final Object $tagId = this.getTagId();
    result = result * PRIME + ($tagId == null ? 43 : $tagId.hashCode());
    final Object $displaymanager = this.getDisplaymanager();
    result = result * PRIME + ($displaymanager == null ? 43 : $displaymanager.hashCode());
    final Object $displaymanagerver = this.getDisplaymanagerver();
    result = result * PRIME + ($displaymanagerver == null ? 43 : $displaymanagerver.hashCode());
    final Object $instl = this.getInstl();
    result = result * PRIME + ($instl == null ? 43 : $instl.hashCode());
    final long $bidfloor = Double.doubleToLongBits(this.getBidfloor());
    result = result * PRIME + (int) ($bidfloor >>> 32 ^ $bidfloor);
    final Object $bidfloorcur = this.getBidfloorcur();
    result = result * PRIME + ($bidfloorcur == null ? 43 : $bidfloorcur.hashCode());
    final Object $secure = this.getSecure();
    result = result * PRIME + ($secure == null ? 43 : $secure.hashCode());
    final Object $iframebuster = this.getIframebuster();
    result = result * PRIME + ($iframebuster == null ? 43 : $iframebuster.hashCode());
    final Object $pmp = this.getPmp();
    result = result * PRIME + ($pmp == null ? 43 : $pmp.hashCode());
    final Object $clickbrowser = this.getClickbrowser();
    result = result * PRIME + ($clickbrowser == null ? 43 : $clickbrowser.hashCode());
    final Object $exp = this.getExp();
    result = result * PRIME + ($exp == null ? 43 : $exp.hashCode());
    final Object $metric = this.getMetric();
    result = result * PRIME + ($metric == null ? 43 : $metric.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Imp;
  }

  public String toString() {
    return "net.media.openrtb25.request.Imp(id="
        + this.getId()
        + ", video="
        + this.getVideo()
        + ", banner="
        + this.getBanner()
        + ", audio="
        + this.getAudio()
        + ", nat="
        + this.getNat()
        + ", tagId="
        + this.getTagId()
        + ", displaymanager="
        + this.getDisplaymanager()
        + ", displaymanagerver="
        + this.getDisplaymanagerver()
        + ", instl="
        + this.getInstl()
        + ", bidfloor="
        + this.getBidfloor()
        + ", bidfloorcur="
        + this.getBidfloorcur()
        + ", secure="
        + this.getSecure()
        + ", iframebuster="
        + this.getIframebuster()
        + ", pmp="
        + this.getPmp()
        + ", clickbrowser="
        + this.getClickbrowser()
        + ", exp="
        + this.getExp()
        + ", metric="
        + this.getMetric()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
