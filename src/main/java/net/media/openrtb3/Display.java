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

import com.fasterxml.jackson.annotation.JsonProperty;
import net.media.utils.validator.CheckExactlyOneNotNull;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@CheckExactlyOneNotNull(fieldNames = {"adm", "banner", "_native", "curl"})
public class Display {

  private String mime;
  private Collection<Integer> api = null;
  private Integer ctype;
  private Integer w;
  private Integer h;
  private Integer wratio;
  private Integer hratio;
  private String priv;
  private Object adm;
  private String curl;
  @Valid private Banner banner;

  @Valid
  @JsonProperty("native")
  private Native _native;

  @Valid private Collection<Event> event = null;
  private Map<String, Object> ext;

  public Display() {}

  public String getMime() {
    return this.mime;
  }

  public void setMime(String mime) {
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

  public Integer getWratio() {
    return this.wratio;
  }

  public void setWratio(Integer wratio) {
    this.wratio = wratio;
  }

  public Integer getHratio() {
    return this.hratio;
  }

  public void setHratio(Integer hratio) {
    this.hratio = hratio;
  }

  public String getPriv() {
    return this.priv;
  }

  public void setPriv(String priv) {
    this.priv = priv;
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

  public @Valid Banner getBanner() {
    return this.banner;
  }

  public void setBanner(@Valid Banner banner) {
    this.banner = banner;
  }

  public @Valid Native get_native() {
    return this._native;
  }

  public void set_native(@Valid Native _native) {
    this._native = _native;
  }

  public @Valid Collection<Event> getEvent() {
    return this.event;
  }

  public void setEvent(@Valid Collection<Event> event) {
    this.event = event;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Display;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Display display = (Display) o;
    return Objects.equals(getMime(), display.getMime())
        && Objects.equals(getApi(), display.getApi())
        && Objects.equals(getCtype(), display.getCtype())
        && Objects.equals(getW(), display.getW())
        && Objects.equals(getH(), display.getH())
        && Objects.equals(getWratio(), display.getWratio())
        && Objects.equals(getHratio(), display.getHratio())
        && Objects.equals(getPriv(), display.getPriv())
        && Objects.equals(getAdm(), display.getAdm())
        && Objects.equals(getCurl(), display.getCurl())
        && Objects.equals(getBanner(), display.getBanner())
        && Objects.equals(get_native(), display.get_native())
        && Objects.equals(getEvent(), display.getEvent())
        && Objects.equals(getExt(), display.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getMime(),
        getApi(),
        getCtype(),
        getW(),
        getH(),
        getWratio(),
        getHratio(),
        getPriv(),
        getAdm(),
        getCurl(),
        getBanner(),
        get_native(),
        getEvent(),
        getExt());
  }
}
