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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

/** Created by vishnu on 30/5/16. */
public class BidResponse2_X {

  @NotNull private String id;
  @Valid private Collection<SeatBid> seatbid;
  private String bidid;
  private String cur;
  private String customdata;
  private Integer nbr;
  private Map<String, Object> ext;

  public BidResponse2_X() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public @Valid Collection<SeatBid> getSeatbid() {
    return this.seatbid;
  }

  public void setSeatbid(@Valid Collection<SeatBid> seatbid) {
    this.seatbid = seatbid;
  }

  public String getBidid() {
    return this.bidid;
  }

  public void setBidid(String bidid) {
    this.bidid = bidid;
  }

  public String getCur() {
    return this.cur;
  }

  public void setCur(String cur) {
    this.cur = cur;
  }

  public String getCustomdata() {
    return this.customdata;
  }

  public void setCustomdata(String customdata) {
    this.customdata = customdata;
  }

  public Integer getNbr() {
    return this.nbr;
  }

  public void setNbr(Integer nbr) {
    this.nbr = nbr;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof BidResponse2_X)) return false;
    final BidResponse2_X other = (BidResponse2_X) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$seatbid = this.getSeatbid();
    final Object other$seatbid = other.getSeatbid();
    if (this$seatbid == null ? other$seatbid != null : !this$seatbid.equals(other$seatbid))
      return false;
    final Object this$bidid = this.getBidid();
    final Object other$bidid = other.getBidid();
    if (this$bidid == null ? other$bidid != null : !this$bidid.equals(other$bidid)) return false;
    final Object this$cur = this.getCur();
    final Object other$cur = other.getCur();
    if (this$cur == null ? other$cur != null : !this$cur.equals(other$cur)) return false;
    final Object this$customdata = this.getCustomdata();
    final Object other$customdata = other.getCustomdata();
    if (this$customdata == null
        ? other$customdata != null
        : !this$customdata.equals(other$customdata)) return false;
    final Object this$nbr = this.getNbr();
    final Object other$nbr = other.getNbr();
    if (this$nbr == null ? other$nbr != null : !this$nbr.equals(other$nbr)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $seatbid = this.getSeatbid();
    result = result * PRIME + ($seatbid == null ? 43 : $seatbid.hashCode());
    final Object $bidid = this.getBidid();
    result = result * PRIME + ($bidid == null ? 43 : $bidid.hashCode());
    final Object $cur = this.getCur();
    result = result * PRIME + ($cur == null ? 43 : $cur.hashCode());
    final Object $customdata = this.getCustomdata();
    result = result * PRIME + ($customdata == null ? 43 : $customdata.hashCode());
    final Object $nbr = this.getNbr();
    result = result * PRIME + ($nbr == null ? 43 : $nbr.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof BidResponse2_X;
  }

  public String toString() {
    return "net.media.openrtb25.response.BidResponse2_X(id="
        + this.getId()
        + ", seatbid="
        + this.getSeatbid()
        + ", bidid="
        + this.getBidid()
        + ", cur="
        + this.getCur()
        + ", customdata="
        + this.getCustomdata()
        + ", nbr="
        + this.getNbr()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
