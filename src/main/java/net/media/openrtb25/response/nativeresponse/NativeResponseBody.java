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
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NativeResponseBody that = (NativeResponseBody) o;
    return Objects.equals(getVer(), that.getVer()) &&
      Objects.equals(getAsset(), that.getAsset()) &&
      Objects.equals(getLink(), that.getLink()) &&
      Objects.equals(getImptrackers(), that.getImptrackers()) &&
      Objects.equals(getJstracker(), that.getJstracker()) &&
      Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getVer(), getAsset(), getLink(), getImptrackers(), getJstracker(), getExt());
  }
}
