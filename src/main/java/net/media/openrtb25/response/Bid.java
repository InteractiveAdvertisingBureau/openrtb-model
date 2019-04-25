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

package net.media.openrtb25.response;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

/** Created by vishnu on 30/5/16. */
public class Bid {

  @NotNull private String id;
  @NotNull private String impid;
  @NotNull private double price;
  private String adid;
  private String nurl;
  private Object adm;
  private Collection<String> adomain;
  private String iurl;
  private String cid;
  private String crid;
  private Collection<String> cat;
  private Collection<Integer> attr;
  private String bundle;
  private Integer api;
  private Integer protocol;
  private Integer qagmediarating;
  private String dealid;
  private Integer h;
  private String language;
  private Integer w;
  private Integer wratio;
  private Integer hratio;
  private Integer exp;
  private String burl;
  private String lurl;
  private String tactic;
  private Map<String, Object> ext;

  public Bid() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public @NotNull String getImpid() {
    return this.impid;
  }

  public void setImpid(@NotNull String impid) {
    this.impid = impid;
  }

  public @NotNull double getPrice() {
    return this.price;
  }

  public void setPrice(@NotNull double price) {
    this.price = price;
  }

  public String getAdid() {
    return this.adid;
  }

  public void setAdid(String adid) {
    this.adid = adid;
  }

  public String getNurl() {
    return this.nurl;
  }

  public void setNurl(String nurl) {
    this.nurl = nurl;
  }

  public Object getAdm() {
    return this.adm;
  }

  public void setAdm(Object adm) {
    this.adm = adm;
  }

  public Collection<String> getAdomain() {
    return this.adomain;
  }

  public void setAdomain(Collection<String> adomain) {
    this.adomain = adomain;
  }

  public String getIurl() {
    return this.iurl;
  }

  public void setIurl(String iurl) {
    this.iurl = iurl;
  }

  public String getCid() {
    return this.cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public String getCrid() {
    return this.crid;
  }

  public void setCrid(String crid) {
    this.crid = crid;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public Collection<Integer> getAttr() {
    return this.attr;
  }

  public void setAttr(Collection<Integer> attr) {
    this.attr = attr;
  }

  public String getBundle() {
    return this.bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public Integer getApi() {
    return this.api;
  }

  public void setApi(Integer api) {
    this.api = api;
  }

  public Integer getProtocol() {
    return this.protocol;
  }

  public void setProtocol(Integer protocol) {
    this.protocol = protocol;
  }

  public Integer getQagmediarating() {
    return this.qagmediarating;
  }

  public void setQagmediarating(Integer qagmediarating) {
    this.qagmediarating = qagmediarating;
  }

  public String getDealid() {
    return this.dealid;
  }

  public void setDealid(String dealid) {
    this.dealid = dealid;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getWratio() {
    return this.wratio;
  }

  public void setWratio(Integer wratio) {
    this.wratio = wratio;
  }

  public Integer getHratio() {
    return this.hratio;
  }

  public void setHratio(Integer hratio) {
    this.hratio = hratio;
  }

  public Integer getExp() {
    return this.exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public String getBurl() {
    return this.burl;
  }

  public void setBurl(String burl) {
    this.burl = burl;
  }

  public String getLurl() {
    return this.lurl;
  }

  public void setLurl(String lurl) {
    this.lurl = lurl;
  }

  public String getTactic() {
    return this.tactic;
  }

  public void setTactic(String tactic) {
    this.tactic = tactic;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Bid)) return false;
    final Bid other = (Bid) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$impid = this.getImpid();
    final Object other$impid = other.getImpid();
    if (this$impid == null ? other$impid != null : !this$impid.equals(other$impid)) return false;
    if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
    final Object this$adid = this.getAdid();
    final Object other$adid = other.getAdid();
    if (this$adid == null ? other$adid != null : !this$adid.equals(other$adid)) return false;
    final Object this$nurl = this.getNurl();
    final Object other$nurl = other.getNurl();
    if (this$nurl == null ? other$nurl != null : !this$nurl.equals(other$nurl)) return false;
    final Object this$adm = this.getAdm();
    final Object other$adm = other.getAdm();
    if (this$adm == null ? other$adm != null : !this$adm.equals(other$adm)) return false;
    final Object this$adomain = this.getAdomain();
    final Object other$adomain = other.getAdomain();
    if (this$adomain == null ? other$adomain != null : !this$adomain.equals(other$adomain))
      return false;
    final Object this$iurl = this.getIurl();
    final Object other$iurl = other.getIurl();
    if (this$iurl == null ? other$iurl != null : !this$iurl.equals(other$iurl)) return false;
    final Object this$cid = this.getCid();
    final Object other$cid = other.getCid();
    if (this$cid == null ? other$cid != null : !this$cid.equals(other$cid)) return false;
    final Object this$crid = this.getCrid();
    final Object other$crid = other.getCrid();
    if (this$crid == null ? other$crid != null : !this$crid.equals(other$crid)) return false;
    final Object this$cat = this.getCat();
    final Object other$cat = other.getCat();
    if (this$cat == null ? other$cat != null : !this$cat.equals(other$cat)) return false;
    final Object this$attr = this.getAttr();
    final Object other$attr = other.getAttr();
    if (this$attr == null ? other$attr != null : !this$attr.equals(other$attr)) return false;
    final Object this$bundle = this.getBundle();
    final Object other$bundle = other.getBundle();
    if (this$bundle == null ? other$bundle != null : !this$bundle.equals(other$bundle))
      return false;
    final Object this$api = this.getApi();
    final Object other$api = other.getApi();
    if (this$api == null ? other$api != null : !this$api.equals(other$api)) return false;
    final Object this$protocol = this.getProtocol();
    final Object other$protocol = other.getProtocol();
    if (this$protocol == null ? other$protocol != null : !this$protocol.equals(other$protocol))
      return false;
    final Object this$qagmediarating = this.getQagmediarating();
    final Object other$qagmediarating = other.getQagmediarating();
    if (this$qagmediarating == null
        ? other$qagmediarating != null
        : !this$qagmediarating.equals(other$qagmediarating)) return false;
    final Object this$dealid = this.getDealid();
    final Object other$dealid = other.getDealid();
    if (this$dealid == null ? other$dealid != null : !this$dealid.equals(other$dealid))
      return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$language = this.getLanguage();
    final Object other$language = other.getLanguage();
    if (this$language == null ? other$language != null : !this$language.equals(other$language))
      return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$wratio = this.getWratio();
    final Object other$wratio = other.getWratio();
    if (this$wratio == null ? other$wratio != null : !this$wratio.equals(other$wratio))
      return false;
    final Object this$hratio = this.getHratio();
    final Object other$hratio = other.getHratio();
    if (this$hratio == null ? other$hratio != null : !this$hratio.equals(other$hratio))
      return false;
    final Object this$exp = this.getExp();
    final Object other$exp = other.getExp();
    if (this$exp == null ? other$exp != null : !this$exp.equals(other$exp)) return false;
    final Object this$burl = this.getBurl();
    final Object other$burl = other.getBurl();
    if (this$burl == null ? other$burl != null : !this$burl.equals(other$burl)) return false;
    final Object this$lurl = this.getLurl();
    final Object other$lurl = other.getLurl();
    if (this$lurl == null ? other$lurl != null : !this$lurl.equals(other$lurl)) return false;
    final Object this$tactic = this.getTactic();
    final Object other$tactic = other.getTactic();
    if (this$tactic == null ? other$tactic != null : !this$tactic.equals(other$tactic))
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
    final Object $impid = this.getImpid();
    result = result * PRIME + ($impid == null ? 43 : $impid.hashCode());
    final long $price = Double.doubleToLongBits(this.getPrice());
    result = result * PRIME + (int) ($price >>> 32 ^ $price);
    final Object $adid = this.getAdid();
    result = result * PRIME + ($adid == null ? 43 : $adid.hashCode());
    final Object $nurl = this.getNurl();
    result = result * PRIME + ($nurl == null ? 43 : $nurl.hashCode());
    final Object $adm = this.getAdm();
    result = result * PRIME + ($adm == null ? 43 : $adm.hashCode());
    final Object $adomain = this.getAdomain();
    result = result * PRIME + ($adomain == null ? 43 : $adomain.hashCode());
    final Object $iurl = this.getIurl();
    result = result * PRIME + ($iurl == null ? 43 : $iurl.hashCode());
    final Object $cid = this.getCid();
    result = result * PRIME + ($cid == null ? 43 : $cid.hashCode());
    final Object $crid = this.getCrid();
    result = result * PRIME + ($crid == null ? 43 : $crid.hashCode());
    final Object $cat = this.getCat();
    result = result * PRIME + ($cat == null ? 43 : $cat.hashCode());
    final Object $attr = this.getAttr();
    result = result * PRIME + ($attr == null ? 43 : $attr.hashCode());
    final Object $bundle = this.getBundle();
    result = result * PRIME + ($bundle == null ? 43 : $bundle.hashCode());
    final Object $api = this.getApi();
    result = result * PRIME + ($api == null ? 43 : $api.hashCode());
    final Object $protocol = this.getProtocol();
    result = result * PRIME + ($protocol == null ? 43 : $protocol.hashCode());
    final Object $qagmediarating = this.getQagmediarating();
    result = result * PRIME + ($qagmediarating == null ? 43 : $qagmediarating.hashCode());
    final Object $dealid = this.getDealid();
    result = result * PRIME + ($dealid == null ? 43 : $dealid.hashCode());
    final Object $h = this.getH();
    result = result * PRIME + ($h == null ? 43 : $h.hashCode());
    final Object $language = this.getLanguage();
    result = result * PRIME + ($language == null ? 43 : $language.hashCode());
    final Object $w = this.getW();
    result = result * PRIME + ($w == null ? 43 : $w.hashCode());
    final Object $wratio = this.getWratio();
    result = result * PRIME + ($wratio == null ? 43 : $wratio.hashCode());
    final Object $hratio = this.getHratio();
    result = result * PRIME + ($hratio == null ? 43 : $hratio.hashCode());
    final Object $exp = this.getExp();
    result = result * PRIME + ($exp == null ? 43 : $exp.hashCode());
    final Object $burl = this.getBurl();
    result = result * PRIME + ($burl == null ? 43 : $burl.hashCode());
    final Object $lurl = this.getLurl();
    result = result * PRIME + ($lurl == null ? 43 : $lurl.hashCode());
    final Object $tactic = this.getTactic();
    result = result * PRIME + ($tactic == null ? 43 : $tactic.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Bid;
  }

  public String toString() {
    return "net.media.openrtb25.response.Bid(id="
        + this.getId()
        + ", impid="
        + this.getImpid()
        + ", price="
        + this.getPrice()
        + ", adid="
        + this.getAdid()
        + ", nurl="
        + this.getNurl()
        + ", adm="
        + this.getAdm()
        + ", adomain="
        + this.getAdomain()
        + ", iurl="
        + this.getIurl()
        + ", cid="
        + this.getCid()
        + ", crid="
        + this.getCrid()
        + ", cat="
        + this.getCat()
        + ", attr="
        + this.getAttr()
        + ", bundle="
        + this.getBundle()
        + ", api="
        + this.getApi()
        + ", protocol="
        + this.getProtocol()
        + ", qagmediarating="
        + this.getQagmediarating()
        + ", dealid="
        + this.getDealid()
        + ", h="
        + this.getH()
        + ", language="
        + this.getLanguage()
        + ", w="
        + this.getW()
        + ", wratio="
        + this.getWratio()
        + ", hratio="
        + this.getHratio()
        + ", exp="
        + this.getExp()
        + ", burl="
        + this.getBurl()
        + ", lurl="
        + this.getLurl()
        + ", tactic="
        + this.getTactic()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
