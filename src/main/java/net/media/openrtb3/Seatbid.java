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

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Seatbid {

  private String seat; //

  @JsonProperty("package")
  private Integer _package;

  @NotEmpty @Valid private Collection<Bid> bid = null;
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

  public @NotEmpty Collection<Bid> getBid() {
    return this.bid;
  }

  public void setBid(@NotEmpty Collection<Bid> bid) {
    this.bid = bid;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Seatbid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Seatbid seatbid = (Seatbid) o;
    return Objects.equals(getSeat(), seatbid.getSeat())
        && Objects.equals(get_package(), seatbid.get_package())
        && Objects.equals(getBid(), seatbid.getBid())
        && Objects.equals(getExt(), seatbid.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSeat(), get_package(), getBid(), getExt());
  }
}
