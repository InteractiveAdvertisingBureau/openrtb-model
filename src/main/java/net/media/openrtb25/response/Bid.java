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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Created by vishnu on 30/5/16. */
public class Bid {

  @NotBlank private String id;
  @NotBlank private String impid;
  @NotNull private Double price;
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

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getImpid() {
    return this.impid;
  }

  public void setImpid(String impid) {
    this.impid = impid;
  }

  public @NotNull Double getPrice() {
    return this.price;
  }

  public void setPrice(@NotNull Double price) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bid bid = (Bid) o;
    return Double.compare(bid.getPrice(), getPrice()) == 0
        && Objects.equals(getId(), bid.getId())
        && Objects.equals(getImpid(), bid.getImpid())
        && Objects.equals(getAdid(), bid.getAdid())
        && Objects.equals(getNurl(), bid.getNurl())
        && Objects.equals(getAdm(), bid.getAdm())
        && Objects.equals(getAdomain(), bid.getAdomain())
        && Objects.equals(getIurl(), bid.getIurl())
        && Objects.equals(getCid(), bid.getCid())
        && Objects.equals(getCrid(), bid.getCrid())
        && Objects.equals(getCat(), bid.getCat())
        && Objects.equals(getAttr(), bid.getAttr())
        && Objects.equals(getBundle(), bid.getBundle())
        && Objects.equals(getApi(), bid.getApi())
        && Objects.equals(getProtocol(), bid.getProtocol())
        && Objects.equals(getQagmediarating(), bid.getQagmediarating())
        && Objects.equals(getDealid(), bid.getDealid())
        && Objects.equals(getH(), bid.getH())
        && Objects.equals(getLanguage(), bid.getLanguage())
        && Objects.equals(getW(), bid.getW())
        && Objects.equals(getWratio(), bid.getWratio())
        && Objects.equals(getHratio(), bid.getHratio())
        && Objects.equals(getExp(), bid.getExp())
        && Objects.equals(getBurl(), bid.getBurl())
        && Objects.equals(getLurl(), bid.getLurl())
        && Objects.equals(getTactic(), bid.getTactic())
        && Objects.equals(getExt(), bid.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getImpid(),
        getPrice(),
        getAdid(),
        getNurl(),
        getAdm(),
        getAdomain(),
        getIurl(),
        getCid(),
        getCrid(),
        getCat(),
        getAttr(),
        getBundle(),
        getApi(),
        getProtocol(),
        getQagmediarating(),
        getDealid(),
        getH(),
        getLanguage(),
        getW(),
        getWratio(),
        getHratio(),
        getExp(),
        getBurl(),
        getLurl(),
        getTactic(),
        getExt());
  }
}
