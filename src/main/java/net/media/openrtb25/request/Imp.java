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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@CheckAtLeastOneNotNull(fieldNames = {"video", "banner", "nat", "audio"})
public class Imp {

  private static final double DEFAULT_BIDFLOOR = 0.0;

  @NotBlank
  private String id;

  @Valid
  private Video video;

  @Valid
  private Banner banner;

  @Valid
  private Audio audio;

  @Valid
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

  @Valid private Pmp pmp;

  private Integer clickbrowser;

  private Integer exp;

  @Valid
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Imp imp = (Imp) o;
    return Double.compare(imp.getBidfloor(), getBidfloor()) == 0
        && Objects.equals(getId(), imp.getId())
        && Objects.equals(getVideo(), imp.getVideo())
        && Objects.equals(getBanner(), imp.getBanner())
        && Objects.equals(getAudio(), imp.getAudio())
        && Objects.equals(getNat(), imp.getNat())
        && Objects.equals(getTagId(), imp.getTagId())
        && Objects.equals(getDisplaymanager(), imp.getDisplaymanager())
        && Objects.equals(getDisplaymanagerver(), imp.getDisplaymanagerver())
        && Objects.equals(getInstl(), imp.getInstl())
        && Objects.equals(getBidfloorcur(), imp.getBidfloorcur())
        && Objects.equals(getSecure(), imp.getSecure())
        && Objects.equals(getIframebuster(), imp.getIframebuster())
        && Objects.equals(getPmp(), imp.getPmp())
        && Objects.equals(getClickbrowser(), imp.getClickbrowser())
        && Objects.equals(getExp(), imp.getExp())
        && Objects.equals(getMetric(), imp.getMetric())
        && Objects.equals(getExt(), imp.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getVideo(),
        getBanner(),
        getAudio(),
        getNat(),
        getTagId(),
        getDisplaymanager(),
        getDisplaymanagerver(),
        getInstl(),
        getBidfloor(),
        getBidfloorcur(),
        getSecure(),
        getIframebuster(),
        getPmp(),
        getClickbrowser(),
        getExp(),
        getMetric(),
        getExt());
  }
}
