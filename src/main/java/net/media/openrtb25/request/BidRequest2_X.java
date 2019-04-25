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

import net.media.utils.validator.CheckAtMostOneNotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

// @CheckAtLeastOneNotNull(fieldNames = {"site", "app"})
@CheckAtMostOneNotNull(fieldNames = {"wseat", "bseat"})
public class BidRequest2_X {

  // BidRequest2_X parameters
  public static final Integer DEFAULT_ALL_IMPS = 0;

  @NotEmpty public String id;

  @NotEmpty @Valid public Collection<Imp> imp;

  @Valid public Site site;

  @Valid public App app;

  public Device device;

  @Valid public User user;

  public Collection<String> badv;

  public Integer at;

  public Integer test;

  public Collection<String> wseat;

  public Collection<String> bseat;

  public Integer tmax;

  @Valid public Source source;

  public Collection<String> bcat;

  public Integer allimps = DEFAULT_ALL_IMPS;

  public Collection<String> cur;

  public Collection<String> wlang;

  public Collection<String> bapp;

  public Regs regs;

  private Map<String, Object> ext;

  private transient Integer gdpr;

  private transient Integer gdprconsent;

  private transient String gdprstring;

  private transient String googleConsents;

  public BidRequest2_X(BidRequest2_X bidRequest) {
    this.id = bidRequest.id;
    this.imp = null;
    this.site = bidRequest.site;
    this.app = bidRequest.app;
    this.device = bidRequest.device;
    this.user = bidRequest.user;
    this.badv = bidRequest.badv;
    this.at = bidRequest.at;
    this.test = bidRequest.test;
    this.wseat = bidRequest.wseat;
    this.tmax = bidRequest.tmax;
    this.bcat = bidRequest.bcat;
    this.allimps = bidRequest.allimps;
    this.cur = bidRequest.cur;
    this.bapp = bidRequest.bapp;
    this.regs = bidRequest.regs;
    this.ext = bidRequest.ext;
  }

  public BidRequest2_X() {}

  public @NotEmpty String getId() {
    return this.id;
  }

  public void setId(@NotEmpty String id) {
    this.id = id;
  }

  public @NotEmpty @Valid Collection<Imp> getImp() {
    return this.imp;
  }

  public void setImp(@NotEmpty @Valid Collection<Imp> imp) {
    this.imp = imp;
  }

  public @Valid
  Site getSite() {
    return this.site;
  }

  public void setSite(@Valid Site site) {
    this.site = site;
  }

  public @Valid App getApp() {
    return this.app;
  }

  public void setApp(@Valid App app) {
    this.app = app;
  }

  public Device getDevice() {
    return this.device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public @Valid User getUser() {
    return this.user;
  }

  public void setUser(@Valid User user) {
    this.user = user;
  }

  public Collection<String> getBadv() {
    return this.badv;
  }

  public void setBadv(Collection<String> badv) {
    this.badv = badv;
  }

  public Integer getAt() {
    return this.at;
  }

  public void setAt(Integer at) {
    this.at = at;
  }

  public Integer getTest() {
    return this.test;
  }

  public void setTest(Integer test) {
    this.test = test;
  }

  public Collection<String> getWseat() {
    return this.wseat;
  }

  public void setWseat(Collection<String> wseat) {
    this.wseat = wseat;
  }

  public Collection<String> getBseat() {
    return this.bseat;
  }

  public void setBseat(Collection<String> bseat) {
    this.bseat = bseat;
  }

  public Integer getTmax() {
    return this.tmax;
  }

  public void setTmax(Integer tmax) {
    this.tmax = tmax;
  }

  public @Valid
  Source getSource() {
    return this.source;
  }

  public void setSource(@Valid Source source) {
    this.source = source;
  }

  public Collection<String> getBcat() {
    return this.bcat;
  }

  public void setBcat(Collection<String> bcat) {
    this.bcat = bcat;
  }

  public Integer getAllimps() {
    return this.allimps;
  }

  public void setAllimps(Integer allimps) {
    this.allimps = allimps;
  }

  public Collection<String> getCur() {
    return this.cur;
  }

  public void setCur(Collection<String> cur) {
    this.cur = cur;
  }

  public Collection<String> getWlang() {
    return this.wlang;
  }

  public void setWlang(Collection<String> wlang) {
    this.wlang = wlang;
  }

  public Collection<String> getBapp() {
    return this.bapp;
  }

  public void setBapp(Collection<String> bapp) {
    this.bapp = bapp;
  }

  public Regs getRegs() {
    return this.regs;
  }

  public void setRegs(Regs regs) {
    this.regs = regs;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public Integer getGdpr() {
    return this.gdpr;
  }

  public void setGdpr(Integer gdpr) {
    this.gdpr = gdpr;
  }

  public Integer getGdprconsent() {
    return this.gdprconsent;
  }

  public void setGdprconsent(Integer gdprconsent) {
    this.gdprconsent = gdprconsent;
  }

  public String getGdprstring() {
    return this.gdprstring;
  }

  public void setGdprstring(String gdprstring) {
    this.gdprstring = gdprstring;
  }

  public String getGoogleConsents() {
    return this.googleConsents;
  }

  public void setGoogleConsents(String googleConsents) {
    this.googleConsents = googleConsents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BidRequest2_X that = (BidRequest2_X) o;
    return Objects.equals(getId(), that.getId()) &&
      Objects.equals(getImp(), that.getImp()) &&
      Objects.equals(getSite(), that.getSite()) &&
      Objects.equals(getApp(), that.getApp()) &&
      Objects.equals(getDevice(), that.getDevice()) &&
      Objects.equals(getUser(), that.getUser()) &&
      Objects.equals(getBadv(), that.getBadv()) &&
      Objects.equals(getAt(), that.getAt()) &&
      Objects.equals(getTest(), that.getTest()) &&
      Objects.equals(getWseat(), that.getWseat()) &&
      Objects.equals(getBseat(), that.getBseat()) &&
      Objects.equals(getTmax(), that.getTmax()) &&
      Objects.equals(getSource(), that.getSource()) &&
      Objects.equals(getBcat(), that.getBcat()) &&
      Objects.equals(getAllimps(), that.getAllimps()) &&
      Objects.equals(getCur(), that.getCur()) &&
      Objects.equals(getWlang(), that.getWlang()) &&
      Objects.equals(getBapp(), that.getBapp()) &&
      Objects.equals(getRegs(), that.getRegs()) &&
      Objects.equals(getExt(), that.getExt()) &&
      Objects.equals(getGdpr(), that.getGdpr()) &&
      Objects.equals(getGdprconsent(), that.getGdprconsent()) &&
      Objects.equals(getGdprstring(), that.getGdprstring()) &&
      Objects.equals(getGoogleConsents(), that.getGoogleConsents());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getImp(), getSite(), getApp(), getDevice(), getUser(), getBadv(), getAt(), getTest(), getWseat(), getBseat(), getTmax(), getSource(), getBcat(), getAllimps(), getCur(), getWlang(), getBapp(), getRegs(), getExt(), getGdpr(), getGdprconsent(), getGdprstring(), getGoogleConsents());
  }
}
