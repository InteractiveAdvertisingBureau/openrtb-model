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

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Bid {

  @NotNull private String id;
  @NotNull private String item;
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
  @NotNull @Valid private Media media;
  private Map<String, Object> ext;

  public Bid() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public @NotNull String getItem() {
    return this.item;
  }

  public void setItem(@NotNull String item) {
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

  public @NotNull @Valid Media getMedia() {
    return this.media;
  }

  public void setMedia(@NotNull @Valid Media media) {
    this.media = media;
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
    final Object this$item = this.getItem();
    final Object other$item = other.getItem();
    if (this$item == null ? other$item != null : !this$item.equals(other$item)) return false;
    final Object this$deal = this.getDeal();
    final Object other$deal = other.getDeal();
    if (this$deal == null ? other$deal != null : !this$deal.equals(other$deal)) return false;
    final Object this$price = this.getPrice();
    final Object other$price = other.getPrice();
    if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
    final Object this$cid = this.getCid();
    final Object other$cid = other.getCid();
    if (this$cid == null ? other$cid != null : !this$cid.equals(other$cid)) return false;
    final Object this$tactic = this.getTactic();
    final Object other$tactic = other.getTactic();
    if (this$tactic == null ? other$tactic != null : !this$tactic.equals(other$tactic))
      return false;
    final Object this$purl = this.getPurl();
    final Object other$purl = other.getPurl();
    if (this$purl == null ? other$purl != null : !this$purl.equals(other$purl)) return false;
    final Object this$burl = this.getBurl();
    final Object other$burl = other.getBurl();
    if (this$burl == null ? other$burl != null : !this$burl.equals(other$burl)) return false;
    final Object this$lurl = this.getLurl();
    final Object other$lurl = other.getLurl();
    if (this$lurl == null ? other$lurl != null : !this$lurl.equals(other$lurl)) return false;
    final Object this$exp = this.getExp();
    final Object other$exp = other.getExp();
    if (this$exp == null ? other$exp != null : !this$exp.equals(other$exp)) return false;
    final Object this$mid = this.getMid();
    final Object other$mid = other.getMid();
    if (this$mid == null ? other$mid != null : !this$mid.equals(other$mid)) return false;
    final Object this$macro = this.getMacro();
    final Object other$macro = other.getMacro();
    if (this$macro == null ? other$macro != null : !this$macro.equals(other$macro)) return false;
    final Object this$media = this.getMedia();
    final Object other$media = other.getMedia();
    if (this$media == null ? other$media != null : !this$media.equals(other$media)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $item = this.getItem();
    result = result * PRIME + ($item == null ? 43 : $item.hashCode());
    final Object $deal = this.getDeal();
    result = result * PRIME + ($deal == null ? 43 : $deal.hashCode());
    final Object $price = this.getPrice();
    result = result * PRIME + ($price == null ? 43 : $price.hashCode());
    final Object $cid = this.getCid();
    result = result * PRIME + ($cid == null ? 43 : $cid.hashCode());
    final Object $tactic = this.getTactic();
    result = result * PRIME + ($tactic == null ? 43 : $tactic.hashCode());
    final Object $purl = this.getPurl();
    result = result * PRIME + ($purl == null ? 43 : $purl.hashCode());
    final Object $burl = this.getBurl();
    result = result * PRIME + ($burl == null ? 43 : $burl.hashCode());
    final Object $lurl = this.getLurl();
    result = result * PRIME + ($lurl == null ? 43 : $lurl.hashCode());
    final Object $exp = this.getExp();
    result = result * PRIME + ($exp == null ? 43 : $exp.hashCode());
    final Object $mid = this.getMid();
    result = result * PRIME + ($mid == null ? 43 : $mid.hashCode());
    final Object $macro = this.getMacro();
    result = result * PRIME + ($macro == null ? 43 : $macro.hashCode());
    final Object $media = this.getMedia();
    result = result * PRIME + ($media == null ? 43 : $media.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Bid;
  }

  public String toString() {
    return "net.media.openrtb3.Bid(id="
        + this.getId()
        + ", item="
        + this.getItem()
        + ", deal="
        + this.getDeal()
        + ", price="
        + this.getPrice()
        + ", cid="
        + this.getCid()
        + ", tactic="
        + this.getTactic()
        + ", purl="
        + this.getPurl()
        + ", burl="
        + this.getBurl()
        + ", lurl="
        + this.getLurl()
        + ", exp="
        + this.getExp()
        + ", mid="
        + this.getMid()
        + ", macro="
        + this.getMacro()
        + ", media="
        + this.getMedia()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
