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

import java.util.Map;

import javax.validation.Valid;

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

  public @Valid
  TitleAsset getTitle() {
    return this.title;
  }

  public void setTitle(@Valid TitleAsset title) {
    this.title = title;
  }

  public @Valid
  ImageAsset getImage() {
    return this.image;
  }

  public void setImage(@Valid ImageAsset image) {
    this.image = image;
  }

  public @Valid
  VideoAsset getVideo() {
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

  public @Valid
  LinkAsset getLink() {
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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Asset)) return false;
    final Asset other = (Asset) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$req = this.getReq();
    final Object other$req = other.getReq();
    if (this$req == null ? other$req != null : !this$req.equals(other$req)) return false;
    final Object this$title = this.getTitle();
    final Object other$title = other.getTitle();
    if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
    final Object this$image = this.getImage();
    final Object other$image = other.getImage();
    if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
    final Object this$video = this.getVideo();
    final Object other$video = other.getVideo();
    if (this$video == null ? other$video != null : !this$video.equals(other$video)) return false;
    final Object this$data = this.getData();
    final Object other$data = other.getData();
    if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
    final Object this$link = this.getLink();
    final Object other$link = other.getLink();
    return this$link == null ? other$link == null : this$link.equals(other$link);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $req = this.getReq();
    result = result * PRIME + ($req == null ? 43 : $req.hashCode());
    final Object $title = this.getTitle();
    result = result * PRIME + ($title == null ? 43 : $title.hashCode());
    final Object $image = this.getImage();
    result = result * PRIME + ($image == null ? 43 : $image.hashCode());
    final Object $video = this.getVideo();
    result = result * PRIME + ($video == null ? 43 : $video.hashCode());
    final Object $data = this.getData();
    result = result * PRIME + ($data == null ? 43 : $data.hashCode());
    final Object $link = this.getLink();
    result = result * PRIME + ($link == null ? 43 : $link.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Asset;
  }

  public String toString() {
    return "net.media.openrtb3.Asset(id="
        + this.getId()
        + ", req="
        + this.getReq()
        + ", title="
        + this.getTitle()
        + ", image="
        + this.getImage()
        + ", video="
        + this.getVideo()
        + ", data="
        + this.getData()
        + ", link="
        + this.getLink()
        + ")";
  }
}
