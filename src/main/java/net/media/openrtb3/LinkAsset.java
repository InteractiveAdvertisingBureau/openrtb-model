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

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

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

  protected boolean canEqual(Object other) {
    return other instanceof LinkAsset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkAsset linkAsset = (LinkAsset) o;
    return Objects.equals(getUrl(), linkAsset.getUrl())
        && Objects.equals(getUrlfb(), linkAsset.getUrlfb())
        && Objects.equals(getTrkr(), linkAsset.getTrkr())
        && Objects.equals(getExt(), linkAsset.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getUrl(), getUrlfb(), getTrkr(), getExt());
  }
}
