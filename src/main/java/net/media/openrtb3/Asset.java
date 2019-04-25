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

import net.media.utils.validator.CheckExactlyOneNotNull;

import javax.validation.Valid;
import java.util.Map;
import java.util.Objects;

@CheckExactlyOneNotNull(fieldNames = {"title", "image", "video", "data", "link"})
public class Asset {

  private Integer id;
  private Integer req;
  @Valid private TitleAsset title;
  @Valid private ImageAsset image;
  @Valid private VideoAsset video;
  @Valid private DataAsset data;
  @Valid private LinkAsset link;
  private Map<String, Object> ext;

  public Asset() {}

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getReq() {
    return this.req;
  }

  public void setReq(Integer req) {
    this.req = req;
  }

  public @Valid TitleAsset getTitle() {
    return this.title;
  }

  public void setTitle(@Valid TitleAsset title) {
    this.title = title;
  }

  public @Valid ImageAsset getImage() {
    return this.image;
  }

  public void setImage(@Valid ImageAsset image) {
    this.image = image;
  }

  public @Valid VideoAsset getVideo() {
    return this.video;
  }

  public void setVideo(@Valid VideoAsset video) {
    this.video = video;
  }

  public @Valid DataAsset getData() {
    return this.data;
  }

  public void setData(@Valid DataAsset data) {
    this.data = data;
  }

  public @Valid LinkAsset getLink() {
    return this.link;
  }

  public void setLink(@Valid LinkAsset link) {
    this.link = link;
  }

  public Map<String, Object> getExt() {
    return ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Asset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Asset asset = (Asset) o;
    return Objects.equals(getId(), asset.getId())
        && Objects.equals(getReq(), asset.getReq())
        && Objects.equals(getTitle(), asset.getTitle())
        && Objects.equals(getImage(), asset.getImage())
        && Objects.equals(getVideo(), asset.getVideo())
        && Objects.equals(getData(), asset.getData())
        && Objects.equals(getLink(), asset.getLink())
        && Objects.equals(getExt(), asset.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getId(), getReq(), getTitle(), getImage(), getVideo(), getData(), getLink(), getExt());
  }
}
