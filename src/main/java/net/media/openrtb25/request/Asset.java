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

package net.media.openrtb25.request;

import net.media.utils.validator.CheckAtLeastOneNotNull;

import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@CheckAtLeastOneNotNull(fieldNames = {"title", "img", "video", "data"})
public class Asset {

  @NotNull private Integer id;

  private Integer required;

  @Valid private NativeTitle title;

  @Valid private NativeImage img;

  @Valid private NativeVideo video;

  @Valid private NativeData data;

  private Map<String, Object> ext;

  public Asset() {}

  public @NotNull Integer getId() {
    return this.id;
  }

  public void setId(@NotNull Integer id) {
    this.id = id;
  }

  public Integer getRequired() {
    return this.required;
  }

  public void setRequired(Integer required) {
    this.required = required;
  }

  public @Valid
  NativeTitle getTitle() {
    return this.title;
  }

  public void setTitle(@Valid NativeTitle title) {
    this.title = title;
  }

  public @Valid NativeImage getImg() {
    return this.img;
  }

  public void setImg(@Valid NativeImage img) {
    this.img = img;
  }

  public @Valid NativeVideo getVideo() {
    return this.video;
  }

  public void setVideo(@Valid NativeVideo video) {
    this.video = video;
  }

  public @Valid NativeData getData() {
    return this.data;
  }

  public void setData(@Valid NativeData data) {
    this.data = data;
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
    Asset asset = (Asset) o;
    return Objects.equals(getId(), asset.getId()) &&
      Objects.equals(getRequired(), asset.getRequired()) &&
      Objects.equals(getTitle(), asset.getTitle()) &&
      Objects.equals(getImg(), asset.getImg()) &&
      Objects.equals(getVideo(), asset.getVideo()) &&
      Objects.equals(getData(), asset.getData()) &&
      Objects.equals(getExt(), asset.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getRequired(), getTitle(), getImg(), getVideo(), getData(), getExt());
  }
}
