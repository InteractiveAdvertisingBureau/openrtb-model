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

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

public class Seatbid {

  private String seat; //

  @JsonProperty("package")
  private Integer _package;

  @NotNull @Valid private Collection<Bid> bid = null;
  private Map<String, Object> ext;

  public Seatbid() {}

  public String getSeat() {
    return this.seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  public Integer get_package() {
    return this._package;
  }

  public void set_package(Integer _package) {
    this._package = _package;
  }

  public @NotNull @Valid Collection<Bid> getBid() {
    return this.bid;
  }

  public void setBid(@NotNull @Valid Collection<Bid> bid) {
    this.bid = bid;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Seatbid)) return false;
    final Seatbid other = (Seatbid) o;
    if (!other.canEqual(this)) return false;
    final Object this$seat = this.getSeat();
    final Object other$seat = other.getSeat();
    if (this$seat == null ? other$seat != null : !this$seat.equals(other$seat)) return false;
    final Object this$_package = this.get_package();
    final Object other$_package = other.get_package();
    if (this$_package == null ? other$_package != null : !this$_package.equals(other$_package))
      return false;
    final Object this$bid = this.getBid();
    final Object other$bid = other.getBid();
    if (this$bid == null ? other$bid != null : !this$bid.equals(other$bid)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $seat = this.getSeat();
    result = result * PRIME + ($seat == null ? 43 : $seat.hashCode());
    final Object $_package = this.get_package();
    result = result * PRIME + ($_package == null ? 43 : $_package.hashCode());
    final Object $bid = this.getBid();
    result = result * PRIME + ($bid == null ? 43 : $bid.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Seatbid;
  }

  public String toString() {
    return "net.media.openrtb3.Seatbid(seat="
        + this.getSeat()
        + ", _package="
        + this.get_package()
        + ", bid="
        + this.getBid()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
