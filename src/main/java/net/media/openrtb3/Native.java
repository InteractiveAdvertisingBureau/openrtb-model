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

public class Native {

  @Valid private LinkAsset link;
  @Valid private Collection<Asset> asset = null;
  private Map<String, Object> ext;

  public Native() {}

  public @Valid LinkAsset getLink() {
    return this.link;
  }

  public void setLink(@Valid LinkAsset link) {
    this.link = link;
  }

  public @Valid Collection<Asset> getAsset() {
    return this.asset;
  }

  public void setAsset(@Valid Collection<Asset> asset) {
    this.asset = asset;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Native;
  }

  @Override
  public String toString() {
    return "Native{" +
        "link=" + link +
        ", asset=" + asset +
        ", ext=" + ext +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Native aNative = (Native) o;
    return Objects.equals(getLink(), aNative.getLink()) &&
        Objects.equals(getAsset(), aNative.getAsset()) &&
        Objects.equals(getExt(), aNative.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLink(), getAsset(), getExt());
  }
}
