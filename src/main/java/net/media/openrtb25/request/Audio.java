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

/** Created by rajat.go on 19/12/18. */
public class Audio {

  @NotEmpty private Collection<String> mimes;

  private Integer minduration;

  private Integer maxduration;

  private Collection<Integer> protocols;

  private Integer startdelay;

  private Integer sequence;

  private Collection<Integer> battr;

  private Integer maxextended;

  private Integer minbitrate;

  private Integer maxbitrate;

  private Collection<Integer> delivery;

  private Collection<Banner> companionad;

  private Collection<Integer> api;

  private Collection<Integer> companiontype;

  private Integer maxseq;

  private Integer feed;

  private Integer stitched;

  private Integer nvol;

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

  public Integer getStartdelay() {
    return this.startdelay;
  }

  public void setStartdelay(Integer startdelay) {
    this.startdelay = startdelay;
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

  public Collection<Integer> getDelivery() {
    return this.delivery;
  }

  public void setDelivery(Collection<Integer> delivery) {
    this.delivery = delivery;
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

  public Integer getMaxseq() {
    return this.maxseq;
  }

  public void setMaxseq(Integer maxseq) {
    this.maxseq = maxseq;
  }

  public Integer getFeed() {
    return this.feed;
  }

  public void setFeed(Integer feed) {
    this.feed = feed;
  }

  public Integer getStitched() {
    return this.stitched;
  }

  public void setStitched(Integer stitched) {
    this.stitched = stitched;
  }

  public Integer getNvol() {
    return this.nvol;
  }

  public void setNvol(Integer nvol) {
    this.nvol = nvol;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
