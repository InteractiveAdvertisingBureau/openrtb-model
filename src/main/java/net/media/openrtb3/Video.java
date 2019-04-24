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

import java.util.Collection;
import java.util.Map;

public class Video {

  private Collection<String> mime = null;
  private Collection<Integer> api = null;
  private Integer ctype;
  private Integer dur;
  private Object adm;
  private String curl;
  private Map<String, Object> ext;

  public Video() {}

  public Collection<String> getMime() {
    return this.mime;
  }

  public void setMime(Collection<String> mime) {
    this.mime = mime;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public Integer getCtype() {
    return this.ctype;
  }

  public void setCtype(Integer ctype) {
    this.ctype = ctype;
  }

  public Integer getDur() {
    return this.dur;
  }

  public void setDur(Integer dur) {
    this.dur = dur;
  }

  public Object getAdm() {
    return this.adm;
  }

  public void setAdm(Object adm) {
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
    if (!(o instanceof Video)) return false;
    final Video other = (Video) o;
    if (!other.canEqual(this)) return false;
    final Object this$mime = this.getMime();
    final Object other$mime = other.getMime();
    if (this$mime == null ? other$mime != null : !this$mime.equals(other$mime)) return false;
    final Object this$api = this.getApi();
    final Object other$api = other.getApi();
    if (this$api == null ? other$api != null : !this$api.equals(other$api)) return false;
    final Object this$ctype = this.getCtype();
    final Object other$ctype = other.getCtype();
    if (this$ctype == null ? other$ctype != null : !this$ctype.equals(other$ctype)) return false;
    final Object this$dur = this.getDur();
    final Object other$dur = other.getDur();
    if (this$dur == null ? other$dur != null : !this$dur.equals(other$dur)) return false;
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
    final Object $mime = this.getMime();
    result = result * PRIME + ($mime == null ? 43 : $mime.hashCode());
    final Object $api = this.getApi();
    result = result * PRIME + ($api == null ? 43 : $api.hashCode());
    final Object $ctype = this.getCtype();
    result = result * PRIME + ($ctype == null ? 43 : $ctype.hashCode());
    final Object $dur = this.getDur();
    result = result * PRIME + ($dur == null ? 43 : $dur.hashCode());
    final Object $adm = this.getAdm();
    result = result * PRIME + ($adm == null ? 43 : $adm.hashCode());
    final Object $curl = this.getCurl();
    result = result * PRIME + ($curl == null ? 43 : $curl.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Video;
  }

  public String toString() {
    return "net.media.openrtb3.Video(mime="
        + this.getMime()
        + ", api="
        + this.getApi()
        + ", ctype="
        + this.getCtype()
        + ", dur="
        + this.getDur()
        + ", adm="
        + this.getAdm()
        + ", curl="
        + this.getCurl()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
