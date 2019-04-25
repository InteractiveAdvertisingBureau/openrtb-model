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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Response)) return false;
    final Response other = (Response) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$bidid = this.getBidid();
    final Object other$bidid = other.getBidid();
    if (this$bidid == null ? other$bidid != null : !this$bidid.equals(other$bidid)) return false;
    final Object this$nbr = this.getNbr();
    final Object other$nbr = other.getNbr();
    if (this$nbr == null ? other$nbr != null : !this$nbr.equals(other$nbr)) return false;
    final Object this$cur = this.getCur();
    final Object other$cur = other.getCur();
    if (this$cur == null ? other$cur != null : !this$cur.equals(other$cur)) return false;
    final Object this$cdata = this.getCdata();
    final Object other$cdata = other.getCdata();
    if (this$cdata == null ? other$cdata != null : !this$cdata.equals(other$cdata)) return false;
    final Object this$seatbid = this.getSeatbid();
    final Object other$seatbid = other.getSeatbid();
    if (this$seatbid == null ? other$seatbid != null : !this$seatbid.equals(other$seatbid))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $bidid = this.getBidid();
    result = result * PRIME + ($bidid == null ? 43 : $bidid.hashCode());
    final Object $nbr = this.getNbr();
    result = result * PRIME + ($nbr == null ? 43 : $nbr.hashCode());
    final Object $cur = this.getCur();
    result = result * PRIME + ($cur == null ? 43 : $cur.hashCode());
    final Object $cdata = this.getCdata();
    result = result * PRIME + ($cdata == null ? 43 : $cdata.hashCode());
    final Object $seatbid = this.getSeatbid();
    result = result * PRIME + ($seatbid == null ? 43 : $seatbid.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Response;
  }

  public String toString() {
    return "net.media.openrtb3.Response(id="
        + this.getId()
        + ", bidid="
        + this.getBidid()
        + ", nbr="
        + this.getNbr()
        + ", cur="
        + this.getCur()
        + ", cdata="
        + this.getCdata()
        + ", seatbid="
        + this.getSeatbid()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
