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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

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

  protected boolean canEqual(Object other) {
    return other instanceof Video;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Video video = (Video) o;
    return Objects.equals(getMime(), video.getMime())
        && Objects.equals(getApi(), video.getApi())
        && Objects.equals(getCtype(), video.getCtype())
        && Objects.equals(getDur(), video.getDur())
        && Objects.equals(getAdm(), video.getAdm())
        && Objects.equals(getCurl(), video.getCurl())
        && Objects.equals(getExt(), video.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMime(), getApi(), getCtype(), getDur(), getAdm(), getCurl(), getExt());
  }
}
