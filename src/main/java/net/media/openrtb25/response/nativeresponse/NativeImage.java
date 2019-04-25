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

public class NativeImage {
  private String url;

  private Integer w;

  private Integer h;

  private Map<String, Object> ext;

  public NativeImage() {}

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
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
    NativeImage that = (NativeImage) o;
    return Objects.equals(getUrl(), that.getUrl())
        && Objects.equals(getW(), that.getW())
        && Objects.equals(getH(), that.getH())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUrl(), getW(), getH(), getExt());
  }
}
