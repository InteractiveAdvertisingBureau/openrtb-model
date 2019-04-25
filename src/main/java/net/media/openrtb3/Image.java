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

import java.util.Objects;

public class Image {

  private String url;
  private Integer w;
  private Integer h;
  private Integer type;
  private String ext;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getW() {
    return w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getH() {
    return h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Image image = (Image) o;
    return Objects.equals(getUrl(), image.getUrl())
        && Objects.equals(getW(), image.getW())
        && Objects.equals(getH(), image.getH())
        && Objects.equals(getType(), image.getType())
        && Objects.equals(getExt(), image.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getUrl(), getW(), getH(), getType(), getExt());
  }
}
