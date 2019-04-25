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
import java.util.Map;
import java.util.Objects;

/** Created by shiva.b on 17/12/18. */
public class ImageAsset {

  @NotNull private String url;
  private Integer w;
  private Integer h;
  private Integer type;
  private Map<String, Object> ext;

  public ImageAsset() {}

  public @NotNull String getUrl() {
    return this.url;
  }

  public void setUrl(@NotNull String url) {
    this.url = url;
  }

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof ImageAsset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageAsset that = (ImageAsset) o;
    return Objects.equals(getUrl(), that.getUrl())
        && Objects.equals(getW(), that.getW())
        && Objects.equals(getH(), that.getH())
        && Objects.equals(getType(), that.getType())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getUrl(), getW(), getH(), getType(), getExt());
  }
}
