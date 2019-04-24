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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof VideoAsset)) return false;
    final VideoAsset other = (VideoAsset) o;
    if (!other.canEqual(this)) return false;
    final Object this$adm = this.getAdm();
    final Object other$adm = other.getAdm();
    if (this$adm == null ? other$adm != null : !this$adm.equals(other$adm)) return false;
    final Object this$curl = this.getCurl();
    final Object other$curl = other.getCurl();
    if (this$curl == null ? other$curl != null : !this$curl.equals(other$curl)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $adm = this.getAdm();
    result = result * PRIME + ($adm == null ? 43 : $adm.hashCode());
    final Object $curl = this.getCurl();
    result = result * PRIME + ($curl == null ? 43 : $curl.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof VideoAsset;
  }

  public String toString() {
    return "net.media.openrtb3.VideoAsset(adm="
        + this.getAdm()
        + ", curl="
        + this.getCurl()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
