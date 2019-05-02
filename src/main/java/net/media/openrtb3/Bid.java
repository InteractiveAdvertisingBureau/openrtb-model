/*
 * Copyright  2019 - present. IAB Tech Lab
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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Bid {

  private String id;
  @NotBlank private String item;
  private String deal;
  @NotNull private Double price;
  private String cid;
  private String tactic;
  private String purl;
  private String burl;
  private String lurl;
  private Integer exp;
  private String mid;
  // Todo code change  for  this  field
  @Valid private Collection<Macro> macro = null;
  @Valid private Media media;
  private Map<String, Object> ext;

  public Bid() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getItem() {
    return this.item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public String getDeal() {
    return this.deal;
  }

  public void setDeal(String deal) {
    this.deal = deal;
  }

  public @NotNull Double getPrice() {
    return this.price;
  }

  public void setPrice(@NotNull Double price) {
    this.price = price;
  }

  public String getCid() {
    return this.cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public String getTactic() {
    return this.tactic;
  }

  public void setTactic(String tactic) {
    this.tactic = tactic;
  }

  public String getPurl() {
    return this.purl;
  }

  public void setPurl(String purl) {
    this.purl = purl;
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

  public Integer getExp() {
    return this.exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public String getMid() {
    return this.mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public @Valid Collection<Macro> getMacro() {
    return this.macro;
  }

  public void setMacro(@Valid Collection<Macro> macro) {
    this.macro = macro;
  }

  public Media getMedia() {
    return this.media;
  }

  public void setMedia(@Valid Media media) {
    this.media = media;
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
    return Objects.equals(getId(), bid.getId())
        && Objects.equals(getItem(), bid.getItem())
        && Objects.equals(getDeal(), bid.getDeal())
        && Objects.equals(getPrice(), bid.getPrice())
        && Objects.equals(getCid(), bid.getCid())
        && Objects.equals(getTactic(), bid.getTactic())
        && Objects.equals(getPurl(), bid.getPurl())
        && Objects.equals(getBurl(), bid.getBurl())
        && Objects.equals(getLurl(), bid.getLurl())
        && Objects.equals(getExp(), bid.getExp())
        && Objects.equals(getMid(), bid.getMid())
        && Objects.equals(getMacro(), bid.getMacro())
        && Objects.equals(getMedia(), bid.getMedia())
        && Objects.equals(getExt(), bid.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getId(),
        getItem(),
        getDeal(),
        getPrice(),
        getCid(),
        getTactic(),
        getPurl(),
        getBurl(),
        getLurl(),
        getExp(),
        getMid(),
        getMacro(),
        getMedia(),
        getExt());
  }
}
