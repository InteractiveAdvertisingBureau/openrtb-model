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

import net.media.utils.validator.CheckAtLeastOneNotNull;

import java.util.Collection;
import java.util.Objects;

import javax.validation.Valid;

/** Created by shiva.b on 14/12/18. */
@CheckAtLeastOneNotNull(fieldNames = {"display", "video", "audio"})
public class Placement {

  private static final Integer DEFAULT_SERVER_SIDE_AD_INSERTION = 0;
  private static final Integer DEFAULT_REWARDED_PLACEMENT = 0;

  private String tagid;
  private Integer ssai = DEFAULT_SERVER_SIDE_AD_INSERTION;
  private String sdk;
  private String sdkver;
  private Integer reward = DEFAULT_REWARDED_PLACEMENT;
  private Collection<String> wlang;
  private Integer secure;
  private Integer admx;

  @Override
  public String toString() {
    return "Placement{" +
        "tagid='" + tagid + '\'' +
        ", ssai=" + ssai +
        ", sdk='" + sdk + '\'' +
        ", sdkver='" + sdkver + '\'' +
        ", reward=" + reward +
        ", wlang=" + wlang +
        ", secure=" + secure +
        ", admx=" + admx +
        ", curlx=" + curlx +
        ", display=" + display +
        ", video=" + video +
        ", audio=" + audio +
        ", ext=" + ext +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Placement placement = (Placement) o;
    return Objects.equals(getTagid(), placement.getTagid()) &&
        Objects.equals(getSsai(), placement.getSsai()) &&
        Objects.equals(getSdk(), placement.getSdk()) &&
        Objects.equals(getSdkver(), placement.getSdkver()) &&
        Objects.equals(getReward(), placement.getReward()) &&
        Objects.equals(getWlang(), placement.getWlang()) &&
        Objects.equals(getSecure(), placement.getSecure()) &&
        Objects.equals(getAdmx(), placement.getAdmx()) &&
        Objects.equals(getCurlx(), placement.getCurlx()) &&
        Objects.equals(getDisplay(), placement.getDisplay()) &&
        Objects.equals(getVideo(), placement.getVideo()) &&
        Objects.equals(getAudio(), placement.getAudio()) &&
        Objects.equals(getExt(), placement.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTagid(), getSsai(), getSdk(), getSdkver(), getReward(), getWlang(), getSecure(), getAdmx(), getCurlx(), getDisplay(), getVideo(), getAudio(), getExt());
  }

  private Integer curlx;
  @Valid private DisplayPlacement display;
  @Valid private VideoPlacement video;
  @Valid private AudioPlacement audio;
  private Object ext;

  public String getTagid() {
    return this.tagid;
  }

  public void setTagid(String tagid) {
    this.tagid = tagid;
  }

  public Integer getSsai() {
    return this.ssai;
  }

  public void setSsai(Integer ssai) {
    this.ssai = ssai;
  }

  public String getSdk() {
    return this.sdk;
  }

  public void setSdk(String sdk) {
    this.sdk = sdk;
  }

  public String getSdkver() {
    return this.sdkver;
  }

  public void setSdkver(String sdkver) {
    this.sdkver = sdkver;
  }

  public Integer getReward() {
    return this.reward;
  }

  public void setReward(Integer reward) {
    this.reward = reward;
  }

  public Collection<String> getWlang() {
    return this.wlang;
  }

  public void setWlang(Collection<String> wlang) {
    this.wlang = wlang;
  }

  public Integer getSecure() {
    return this.secure;
  }

  public void setSecure(Integer secure) {
    this.secure = secure;
  }

  public Integer getAdmx() {
    return this.admx;
  }

  public void setAdmx(Integer admx) {
    this.admx = admx;
  }

  public Integer getCurlx() {
    return this.curlx;
  }

  public void setCurlx(Integer curlx) {
    this.curlx = curlx;
  }

  public @Valid DisplayPlacement getDisplay() {
    return this.display;
  }

  public void setDisplay(@Valid DisplayPlacement display) {
    this.display = display;
  }

  public @Valid
  VideoPlacement getVideo() {
    return this.video;
  }

  public void setVideo(@Valid VideoPlacement video) {
    this.video = video;
  }

  public @Valid
  AudioPlacement getAudio() {
    return this.audio;
  }

  public void setAudio(@Valid AudioPlacement audio) {
    this.audio = audio;
  }

  public Object getExt() {
    return this.ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }
}
