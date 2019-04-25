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
import java.util.Objects;

@CheckExactlyOneNotNull(fieldNames = {"adm", "curl"})
public class VideoAsset {

  private String adm;
  private String curl;
  private Map<String, Object> ext;

  public VideoAsset() {}

  public String getAdm() {
    return this.adm;
  }

  public void setAdm(String adm) {
    this.adm = adm;
  }

  public String getCurl() {
    return this.curl;
  }

  public void setCurl(String curl) {
    this.curl = curl;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof VideoAsset;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VideoAsset that = (VideoAsset) o;
    return Objects.equals(getAdm(), that.getAdm())
        && Objects.equals(getCurl(), that.getCurl())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAdm(), getCurl(), getExt());
  }
}
