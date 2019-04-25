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

import java.util.Map;
import java.util.Objects;

public class AssetResponse {

  private static final Integer DEFAULT_REQUIRED = 0;

  private Integer id;

  private Integer required = DEFAULT_REQUIRED;

  private NativeTitle title;

  private NativeImage img;

  private NativeVideo video;

  private NativeData data;

  private Link link;

  private Map<String, Object> ext;

  public AssetResponse() {}

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRequired() {
    return this.required;
  }

  public void setRequired(Integer required) {
    this.required = required;
  }

  public NativeTitle getTitle() {
    return this.title;
  }

  public void setTitle(NativeTitle title) {
    this.title = title;
  }

  public NativeImage getImg() {
    return this.img;
  }

  public void setImg(NativeImage img) {
    this.img = img;
  }

  public NativeVideo getVideo() {
    return this.video;
  }

  public void setVideo(NativeVideo video) {
    this.video = video;
  }

  public NativeData getData() {
    return this.data;
  }

  public void setData(NativeData data) {
    this.data = data;
  }

  public Link getLink() {
    return this.link;
  }

  public void setLink(Link link) {
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
    AssetResponse that = (AssetResponse) o;
    return Objects.equals(getId(), that.getId())
        && Objects.equals(getRequired(), that.getRequired())
        && Objects.equals(getTitle(), that.getTitle())
        && Objects.equals(getImg(), that.getImg())
        && Objects.equals(getVideo(), that.getVideo())
        && Objects.equals(getData(), that.getData())
        && Objects.equals(getLink(), that.getLink())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(), getRequired(), getTitle(), getImg(), getVideo(), getData(), getLink(), getExt());
  }
}
