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
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Created by vishnu on 30/5/16. */
public class SeatBid {

  @NotEmpty @Valid private Collection<Bid> bid;

  private String seat;

  private Integer group;

  private Map<String, Object> ext;

  public SeatBid() {}

  public @NotEmpty Collection<Bid> getBid() {
    return this.bid;
  }

  public void setBid(@NotEmpty Collection<Bid> bid) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SeatBid seatBid = (SeatBid) o;
    return Objects.equals(getBid(), seatBid.getBid())
        && Objects.equals(getSeat(), seatBid.getSeat())
        && Objects.equals(getGroup(), seatBid.getGroup())
        && Objects.equals(getExt(), seatBid.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBid(), getSeat(), getGroup(), getExt());
  }
}
