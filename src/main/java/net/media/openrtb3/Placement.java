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

import javax.validation.Valid;
import java.util.Collection;

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

  public @Valid VideoPlacement getVideo() {
    return this.video;
  }

  public void setVideo(@Valid VideoPlacement video) {
    this.video = video;
  }

  public @Valid AudioPlacement getAudio() {
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
