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

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Map;
import java.util.Objects;

public class Banner {

  @NotBlank private String img;
  @Valid private LinkAsset link;
  private Map<String, Object> ext;

  public Banner() {}

  public @NotBlank String getImg() {
    return this.img;
  }

  public void setImg(@NotBlank String img) {
    this.img = img;
  }

  public @Valid LinkAsset getLink() {
    return this.link;
  }

  public void setLink(@Valid LinkAsset link) {
    this.link = link;
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
    Banner banner = (Banner) o;
    return Objects.equals(getImg(), banner.getImg())
        && Objects.equals(getLink(), banner.getLink())
        && Objects.equals(getExt(), banner.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getImg(), getLink(), getExt());
  }
}
