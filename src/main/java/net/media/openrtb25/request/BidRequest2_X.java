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

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;

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

  public @Valid Site getSite() {
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

  public @Valid Source getSource() {
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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof BidRequest2_X)) return false;
    final BidRequest2_X other = (BidRequest2_X) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$imp = this.getImp();
    final Object other$imp = other.getImp();
    if (this$imp == null ? other$imp != null : !this$imp.equals(other$imp)) return false;
    final Object this$site = this.getSite();
    final Object other$site = other.getSite();
    if (this$site == null ? other$site != null : !this$site.equals(other$site)) return false;
    final Object this$app = this.getApp();
    final Object other$app = other.getApp();
    if (this$app == null ? other$app != null : !this$app.equals(other$app)) return false;
    final Object this$device = this.getDevice();
    final Object other$device = other.getDevice();
    if (this$device == null ? other$device != null : !this$device.equals(other$device))
      return false;
    final Object this$user = this.getUser();
    final Object other$user = other.getUser();
    if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
    final Object this$badv = this.getBadv();
    final Object other$badv = other.getBadv();
    if (this$badv == null ? other$badv != null : !this$badv.equals(other$badv)) return false;
    final Object this$at = this.getAt();
    final Object other$at = other.getAt();
    if (this$at == null ? other$at != null : !this$at.equals(other$at)) return false;
    final Object this$test = this.getTest();
    final Object other$test = other.getTest();
    if (this$test == null ? other$test != null : !this$test.equals(other$test)) return false;
    final Object this$wseat = this.getWseat();
    final Object other$wseat = other.getWseat();
    if (this$wseat == null ? other$wseat != null : !this$wseat.equals(other$wseat)) return false;
    final Object this$bseat = this.getBseat();
    final Object other$bseat = other.getBseat();
    if (this$bseat == null ? other$bseat != null : !this$bseat.equals(other$bseat)) return false;
    final Object this$tmax = this.getTmax();
    final Object other$tmax = other.getTmax();
    if (this$tmax == null ? other$tmax != null : !this$tmax.equals(other$tmax)) return false;
    final Object this$source = this.getSource();
    final Object other$source = other.getSource();
    if (this$source == null ? other$source != null : !this$source.equals(other$source))
      return false;
    final Object this$bcat = this.getBcat();
    final Object other$bcat = other.getBcat();
    if (this$bcat == null ? other$bcat != null : !this$bcat.equals(other$bcat)) return false;
    final Object this$allimps = this.getAllimps();
    final Object other$allimps = other.getAllimps();
    if (this$allimps == null ? other$allimps != null : !this$allimps.equals(other$allimps))
      return false;
    final Object this$cur = this.getCur();
    final Object other$cur = other.getCur();
    if (this$cur == null ? other$cur != null : !this$cur.equals(other$cur)) return false;
    final Object this$wlang = this.getWlang();
    final Object other$wlang = other.getWlang();
    if (this$wlang == null ? other$wlang != null : !this$wlang.equals(other$wlang)) return false;
    final Object this$bapp = this.getBapp();
    final Object other$bapp = other.getBapp();
    if (this$bapp == null ? other$bapp != null : !this$bapp.equals(other$bapp)) return false;
    final Object this$regs = this.getRegs();
    final Object other$regs = other.getRegs();
    if (this$regs == null ? other$regs != null : !this$regs.equals(other$regs)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $imp = this.getImp();
    result = result * PRIME + ($imp == null ? 43 : $imp.hashCode());
    final Object $site = this.getSite();
    result = result * PRIME + ($site == null ? 43 : $site.hashCode());
    final Object $app = this.getApp();
    result = result * PRIME + ($app == null ? 43 : $app.hashCode());
    final Object $device = this.getDevice();
    result = result * PRIME + ($device == null ? 43 : $device.hashCode());
    final Object $user = this.getUser();
    result = result * PRIME + ($user == null ? 43 : $user.hashCode());
    final Object $badv = this.getBadv();
    result = result * PRIME + ($badv == null ? 43 : $badv.hashCode());
    final Object $at = this.getAt();
    result = result * PRIME + ($at == null ? 43 : $at.hashCode());
    final Object $test = this.getTest();
    result = result * PRIME + ($test == null ? 43 : $test.hashCode());
    final Object $wseat = this.getWseat();
    result = result * PRIME + ($wseat == null ? 43 : $wseat.hashCode());
    final Object $bseat = this.getBseat();
    result = result * PRIME + ($bseat == null ? 43 : $bseat.hashCode());
    final Object $tmax = this.getTmax();
    result = result * PRIME + ($tmax == null ? 43 : $tmax.hashCode());
    final Object $source = this.getSource();
    result = result * PRIME + ($source == null ? 43 : $source.hashCode());
    final Object $bcat = this.getBcat();
    result = result * PRIME + ($bcat == null ? 43 : $bcat.hashCode());
    final Object $allimps = this.getAllimps();
    result = result * PRIME + ($allimps == null ? 43 : $allimps.hashCode());
    final Object $cur = this.getCur();
    result = result * PRIME + ($cur == null ? 43 : $cur.hashCode());
    final Object $wlang = this.getWlang();
    result = result * PRIME + ($wlang == null ? 43 : $wlang.hashCode());
    final Object $bapp = this.getBapp();
    result = result * PRIME + ($bapp == null ? 43 : $bapp.hashCode());
    final Object $regs = this.getRegs();
    result = result * PRIME + ($regs == null ? 43 : $regs.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof BidRequest2_X;
  }

  public String toString() {
    return "net.media.openrtb25.request.BidRequest2_X(id="
        + this.getId()
        + ", imp="
        + this.getImp()
        + ", site="
        + this.getSite()
        + ", app="
        + this.getApp()
        + ", device="
        + this.getDevice()
        + ", user="
        + this.getUser()
        + ", badv="
        + this.getBadv()
        + ", at="
        + this.getAt()
        + ", test="
        + this.getTest()
        + ", wseat="
        + this.getWseat()
        + ", bseat="
        + this.getBseat()
        + ", tmax="
        + this.getTmax()
        + ", source="
        + this.getSource()
        + ", bcat="
        + this.getBcat()
        + ", allimps="
        + this.getAllimps()
        + ", cur="
        + this.getCur()
        + ", wlang="
        + this.getWlang()
        + ", bapp="
        + this.getBapp()
        + ", regs="
        + this.getRegs()
        + ", ext="
        + this.getExt()
        + ", gdpr="
        + this.getGdpr()
        + ", gdprconsent="
        + this.getGdprconsent()
        + ", gdprstring="
        + this.getGdprstring()
        + ", googleConsents="
        + this.getGoogleConsents()
        + ")";
  }
}
