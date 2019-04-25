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
import java.util.Objects;

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

public class Restrictions {

  private Collection<String> bcat;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private Collection<String> badv;
  private Collection<String> bapp;
  private Collection<Integer> battr;
  private Map<String, Object> ext;

  public Collection<String> getBcat() {
    return this.bcat;
  }

  public void setBcat(Collection<String> bcat) {
    this.bcat = bcat;
  }

  public Integer getCattax() {
    return this.cattax;
  }

  public void setCattax(Integer cattax) {
    this.cattax = cattax;
  }

  public Collection<String> getBadv() {
    return this.badv;
  }

  public void setBadv(Collection<String> badv) {
    this.badv = badv;
  }

  public Collection<String> getBapp() {
    return this.bapp;
  }

  public void setBapp(Collection<String> bapp) {
    this.bapp = bapp;
  }

  public Collection<Integer> getBattr() {
    return this.battr;
  }

  public void setBattr(Collection<Integer> battr) {
    this.battr = battr;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  @Override
  public String toString() {
    return "Restrictions{" +
        "bcat=" + bcat +
        ", cattax=" + cattax +
        ", badv=" + badv +
        ", bapp=" + bapp +
        ", battr=" + battr +
        ", ext=" + ext +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Restrictions that = (Restrictions) o;
    return Objects.equals(getBcat(), that.getBcat()) &&
        Objects.equals(getCattax(), that.getCattax()) &&
        Objects.equals(getBadv(), that.getBadv()) &&
        Objects.equals(getBapp(), that.getBapp()) &&
        Objects.equals(getBattr(), that.getBattr()) &&
        Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBcat(), getCattax(), getBadv(), getBapp(), getBattr(), getExt());
  }
}
