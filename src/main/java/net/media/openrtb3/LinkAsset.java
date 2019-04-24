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

import javax.validation.constraints.NotNull;

public class LinkAsset {

  @NotNull private String url;
  private String urlfb;
  private Collection<String> trkr = null;
  private Map<String, Object> ext;

  public LinkAsset() {}

  public @NotNull String getUrl() {
    return this.url;
  }

  public void setUrl(@NotNull String url) {
    this.url = url;
  }

  public String getUrlfb() {
    return this.urlfb;
  }

  public void setUrlfb(String urlfb) {
    this.urlfb = urlfb;
  }

  public Collection<String> getTrkr() {
    return this.trkr;
  }

  public void setTrkr(Collection<String> trkr) {
    this.trkr = trkr;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof LinkAsset)) return false;
    final LinkAsset other = (LinkAsset) o;
    if (!other.canEqual(this)) return false;
    final Object this$url = this.getUrl();
    final Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    final Object this$urlfb = this.getUrlfb();
    final Object other$urlfb = other.getUrlfb();
    if (this$urlfb == null ? other$urlfb != null : !this$urlfb.equals(other$urlfb)) return false;
    final Object this$trkr = this.getTrkr();
    final Object other$trkr = other.getTrkr();
    if (this$trkr == null ? other$trkr != null : !this$trkr.equals(other$trkr)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $url = this.getUrl();
    result = result * PRIME + ($url == null ? 43 : $url.hashCode());
    final Object $urlfb = this.getUrlfb();
    result = result * PRIME + ($urlfb == null ? 43 : $urlfb.hashCode());
    final Object $trkr = this.getTrkr();
    result = result * PRIME + ($trkr == null ? 43 : $trkr.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof LinkAsset;
  }

  public String toString() {
    return "net.media.openrtb3.LinkAsset(url="
        + this.getUrl()
        + ", urlfb="
        + this.getUrlfb()
        + ", trkr="
        + this.getTrkr()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
