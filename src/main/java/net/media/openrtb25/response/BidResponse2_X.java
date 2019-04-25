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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BidResponse2_X that = (BidResponse2_X) o;
    return Objects.equals(getId(), that.getId()) &&
      Objects.equals(getSeatbid(), that.getSeatbid()) &&
      Objects.equals(getBidid(), that.getBidid()) &&
      Objects.equals(getCur(), that.getCur()) &&
      Objects.equals(getCustomdata(), that.getCustomdata()) &&
      Objects.equals(getNbr(), that.getNbr()) &&
      Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getSeatbid(), getBidid(), getCur(), getCustomdata(), getNbr(), getExt());
  }
}
