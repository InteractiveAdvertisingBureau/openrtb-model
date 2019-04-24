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

/** Created by shiva.b on 14/12/18. */
public class Deal {
  private String id;
  private Double flr;
  private String flrcur;
  private Integer at;
  private Collection<String> wseat;
  private Collection<String> wadomain;
  private Map<String, Object> ext;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getFlr() {
    return this.flr;
  }

  public void setFlr(Double flr) {
    this.flr = flr;
  }

  public String getFlrcur() {
    return this.flrcur;
  }

  public void setFlrcur(String flrcur) {
    this.flrcur = flrcur;
  }

  public Integer getAt() {
    return this.at;
  }

  public void setAt(Integer at) {
    this.at = at;
  }

  public Collection<String> getWseat() {
    return this.wseat;
  }

  public void setWseat(Collection<String> wseat) {
    this.wseat = wseat;
  }

  public Collection<String> getWadomain() {
    return this.wadomain;
  }

  public void setWadomain(Collection<String> wadomain) {
    this.wadomain = wadomain;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
