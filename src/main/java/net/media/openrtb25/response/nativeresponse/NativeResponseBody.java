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

package net.media.openrtb25.response.nativeresponse;

import java.util.Collection;
import java.util.Map;

/** Created by rajat.go on 06/12/17. */
public class NativeResponseBody {

  private static final String DEFAULT_NATIVE_VER = "1.1";

  private String ver;

  private Collection<AssetResponse> asset;

  private Link link;

  private Collection<String> imptrackers;

  private String jstracker;

  private Map<String, Object> ext;

  public NativeResponseBody() {}

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public Collection<AssetResponse> getAsset() {
    return this.asset;
  }

  public void setAsset(Collection<AssetResponse> asset) {
    this.asset = asset;
  }

  public Link getLink() {
    return this.link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public Collection<String> getImptrackers() {
    return this.imptrackers;
  }

  public void setImptrackers(Collection<String> imptrackers) {
    this.imptrackers = imptrackers;
  }

  public String getJstracker() {
    return this.jstracker;
  }

  public void setJstracker(String jstracker) {
    this.jstracker = jstracker;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeResponseBody)) return false;
    final NativeResponseBody other = (NativeResponseBody) o;
    if (!other.canEqual(this)) return false;
    final Object this$ver = this.getVer();
    final Object other$ver = other.getVer();
    if (this$ver == null ? other$ver != null : !this$ver.equals(other$ver)) return false;
    final Object this$assets = this.getAsset();
    final Object other$assets = other.getAsset();
    if (this$assets == null ? other$assets != null : !this$assets.equals(other$assets))
      return false;
    final Object this$link = this.getLink();
    final Object other$link = other.getLink();
    if (this$link == null ? other$link != null : !this$link.equals(other$link)) return false;
    final Object this$imptrackers = this.getImptrackers();
    final Object other$imptrackers = other.getImptrackers();
    if (this$imptrackers == null
        ? other$imptrackers != null
        : !this$imptrackers.equals(other$imptrackers)) return false;
    final Object this$jstracker = this.getJstracker();
    final Object other$jstracker = other.getJstracker();
    if (this$jstracker == null ? other$jstracker != null : !this$jstracker.equals(other$jstracker))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $ver = this.getVer();
    result = result * PRIME + ($ver == null ? 43 : $ver.hashCode());
    final Object $assets = this.getAsset();
    result = result * PRIME + ($assets == null ? 43 : $assets.hashCode());
    final Object $link = this.getLink();
    result = result * PRIME + ($link == null ? 43 : $link.hashCode());
    final Object $imptrackers = this.getImptrackers();
    result = result * PRIME + ($imptrackers == null ? 43 : $imptrackers.hashCode());
    final Object $jstracker = this.getJstracker();
    result = result * PRIME + ($jstracker == null ? 43 : $jstracker.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeResponseBody;
  }

  public String toString() {
    return "net.media.openrtb25.response.nativeresponse.NativeResponseBody(ver="
        + this.getVer()
        + ", asset="
        + this.getAsset()
        + ", link="
        + this.getLink()
        + ", imptrackers="
        + this.getImptrackers()
        + ", jstracker="
        + this.getJstracker()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
