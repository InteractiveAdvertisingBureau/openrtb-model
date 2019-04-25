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
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Response {

  @NotNull private String id;
  private String bidid;
  private Integer nbr;
  private String cur;
  private String cdata;
  @Valid private Collection<Seatbid> seatbid = null;
  private Map<String, Object> ext;

  public Response() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public String getBidid() {
    return this.bidid;
  }

  @Override
  public String toString() {
    return "Response{" +
        "id='" + id + '\'' +
        ", bidid='" + bidid + '\'' +
        ", nbr=" + nbr +
        ", cur='" + cur + '\'' +
        ", cdata='" + cdata + '\'' +
        ", seatbid=" + seatbid +
        ", ext=" + ext +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Response response = (Response) o;
    return Objects.equals(getId(), response.getId()) &&
        Objects.equals(getBidid(), response.getBidid()) &&
        Objects.equals(getNbr(), response.getNbr()) &&
        Objects.equals(getCur(), response.getCur()) &&
        Objects.equals(getCdata(), response.getCdata()) &&
        Objects.equals(getSeatbid(), response.getSeatbid()) &&
        Objects.equals(getExt(), response.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getBidid(), getNbr(), getCur(), getCdata(), getSeatbid(), getExt());
  }

  public void setBidid(String bidid) {
    this.bidid = bidid;
  }

  public Integer getNbr() {
    return this.nbr;
  }

  public void setNbr(Integer nbr) {
    this.nbr = nbr;
  }

  public String getCur() {
    return this.cur;
  }

  public void setCur(String cur) {
    this.cur = cur;
  }

  public String getCdata() {
    return this.cdata;
  }

  public void setCdata(String cdata) {
    this.cdata = cdata;
  }

  public @Valid Collection<Seatbid> getSeatbid() {
    return this.seatbid;
  }

  public void setSeatbid(@Valid Collection<Seatbid> seatbid) {
    this.seatbid = seatbid;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Response;
  }

}
