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
public class SeatBid {

  @NotNull @Valid private Collection<Bid> bid;

  private String seat;

  private Integer group;

  private Map<String, Object> ext;

  public SeatBid() {}

  public @NotNull @Valid Collection<Bid> getBid() {
    return this.bid;
  }

  public void setBid(@NotNull @Valid Collection<Bid> bid) {
    this.bid = bid;
  }

  public String getSeat() {
    return this.seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public Integer getGroup() {
    return this.group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof SeatBid)) return false;
    final SeatBid other = (SeatBid) o;
    if (!other.canEqual(this)) return false;
    final Object this$bid = this.getBid();
    final Object other$bid = other.getBid();
    if (this$bid == null ? other$bid != null : !this$bid.equals(other$bid)) return false;
    final Object this$seat = this.getSeat();
    final Object other$seat = other.getSeat();
    if (this$seat == null ? other$seat != null : !this$seat.equals(other$seat)) return false;
    final Object this$group = this.getGroup();
    final Object other$group = other.getGroup();
    if (this$group == null ? other$group != null : !this$group.equals(other$group)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $bid = this.getBid();
    result = result * PRIME + ($bid == null ? 43 : $bid.hashCode());
    final Object $seat = this.getSeat();
    result = result * PRIME + ($seat == null ? 43 : $seat.hashCode());
    final Object $group = this.getGroup();
    result = result * PRIME + ($group == null ? 43 : $group.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof SeatBid;
  }

  public String toString() {
    return "net.media.openrtb25.response.SeatBid(bid="
        + this.getBid()
        + ", seat="
        + this.getSeat()
        + ", group="
        + this.getGroup()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
