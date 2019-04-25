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

import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;

public class Video {

  @NotEmpty private Collection<String> mimes;

  private Integer minduration;

  private Integer maxduration;

  private Collection<Integer> protocols;

  private Integer w;

  private Integer h;

  private Integer startdelay;

  private Integer linearity;

  private Integer skip;

  private Integer placement;

  private Integer skipmin;

  private Integer skipafter;

  private Integer sequence;

  private Collection<Integer> battr;

  private Integer maxextended;

  private Integer minbitrate;

  private Integer maxbitrate;

  private Integer boxingallowed;

  private Collection<Integer> playbackmethod;

  private Integer playbackend;

  private Collection<Integer> delivery;

  private Integer pos;

  private Collection<Banner> companionad;

  private Collection<Integer> api;

  private Collection<Integer> companiontype;

  private Map<String, Object> ext;

  public @NotEmpty Collection<String> getMimes() {
    return this.mimes;
  }

  public void setMimes(@NotEmpty Collection<String> mimes) {
    this.mimes = mimes;
  }

  public Integer getMinduration() {
    return this.minduration;
  }

  public void setMinduration(Integer minduration) {
    this.minduration = minduration;
  }

  public Integer getMaxduration() {
    return this.maxduration;
  }

  public void setMaxduration(Integer maxduration) {
    this.maxduration = maxduration;
  }

  public Collection<Integer> getProtocols() {
    return this.protocols;
  }

  public void setProtocols(Collection<Integer> protocols) {
    this.protocols = protocols;
  }

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

  public Integer getStartdelay() {
    return this.startdelay;
  }

  public void setStartdelay(Integer startdelay) {
    this.startdelay = startdelay;
  }

  public Integer getLinearity() {
    return this.linearity;
  }

  public void setLinearity(Integer linearity) {
    this.linearity = linearity;
  }

  public Integer getSkip() {
    return this.skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public Integer getPlacement() {
    return this.placement;
  }

  public void setPlacement(Integer placement) {
    this.placement = placement;
  }

  public Integer getSkipmin() {
    return this.skipmin;
  }

  public void setSkipmin(Integer skipmin) {
    this.skipmin = skipmin;
  }

  public Integer getSkipafter() {
    return this.skipafter;
  }

  public void setSkipafter(Integer skipafter) {
    this.skipafter = skipafter;
  }

  public Integer getSequence() {
    return this.sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public Collection<Integer> getBattr() {
    return this.battr;
  }

  public void setBattr(Collection<Integer> battr) {
    this.battr = battr;
  }

  public Integer getMaxextended() {
    return this.maxextended;
  }

  public void setMaxextended(Integer maxextended) {
    this.maxextended = maxextended;
  }

  public Integer getMinbitrate() {
    return this.minbitrate;
  }

  public void setMinbitrate(Integer minbitrate) {
    this.minbitrate = minbitrate;
  }

  public Integer getMaxbitrate() {
    return this.maxbitrate;
  }

  public void setMaxbitrate(Integer maxbitrate) {
    this.maxbitrate = maxbitrate;
  }

  public Integer getBoxingallowed() {
    return this.boxingallowed;
  }

  public void setBoxingallowed(Integer boxingallowed) {
    this.boxingallowed = boxingallowed;
  }

  public Collection<Integer> getPlaybackmethod() {
    return this.playbackmethod;
  }

  public void setPlaybackmethod(Collection<Integer> playbackmethod) {
    this.playbackmethod = playbackmethod;
  }

  public Integer getPlaybackend() {
    return this.playbackend;
  }

  public void setPlaybackend(Integer playbackend) {
    this.playbackend = playbackend;
  }

  public Collection<Integer> getDelivery() {
    return this.delivery;
  }

  public void setDelivery(Collection<Integer> delivery) {
    this.delivery = delivery;
  }

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Collection<Banner> getCompanionad() {
    return this.companionad;
  }

  public void setCompanionad(Collection<Banner> companionad) {
    this.companionad = companionad;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public Collection<Integer> getCompaniontype() {
    return this.companiontype;
  }

  public void setCompaniontype(Collection<Integer> companiontype) {
    this.companiontype = companiontype;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
