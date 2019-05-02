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

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class DisplayPlacement {

  private static final Integer DEFAULT_CLICKTYPE = 1;
  private static final Integer DEFAULT_UNITS = 1;
  private static final Integer DEFAULT_PRIVACY_NOTICE = 0;

  private Integer pos;
  private Integer instl;
  private Integer topframe;
  private Collection<String> ifrbust;
  private Integer clktype = DEFAULT_CLICKTYPE;
  private Integer ampren;
  private Integer ptype;
  private Integer context;
  private Collection<String> mime;
  private Collection<Integer> api;
  private Collection<Integer> ctype;
  private Integer w;
  private Integer h;
  private Integer unit = DEFAULT_UNITS;
  private Integer priv = DEFAULT_PRIVACY_NOTICE;
  private Collection<DisplayFormat> displayfmt;
  @Valid private NativeFormat nativefmt;
  @Valid private Collection<EventSpec> event;
  private Map<String, Object> ext;

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Integer getInstl() {
    return this.instl;
  }

  public void setInstl(Integer instl) {
    this.instl = instl;
  }

  public Integer getTopframe() {
    return this.topframe;
  }

  public void setTopframe(Integer topframe) {
    this.topframe = topframe;
  }

  public Collection<String> getIfrbust() {
    return this.ifrbust;
  }

  public void setIfrbust(Collection<String> ifrbust) {
    this.ifrbust = ifrbust;
  }

  public Integer getClktype() {
    return this.clktype;
  }

  public void setClktype(Integer clktype) {
    this.clktype = clktype;
  }

  public Integer getAmpren() {
    return this.ampren;
  }

  public void setAmpren(Integer ampren) {
    this.ampren = ampren;
  }

  public Integer getPtype() {
    return this.ptype;
  }

  public void setPtype(Integer ptype) {
    this.ptype = ptype;
  }

  public Integer getContext() {
    return this.context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }

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

  public Collection<Integer> getCtype() {
    return this.ctype;
  }

  public void setCtype(Collection<Integer> ctype) {
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

  public Integer getUnit() {
    return this.unit;
  }

  public void setUnit(Integer unit) {
    this.unit = unit;
  }

  public Integer getPriv() {
    return this.priv;
  }

  public void setPriv(Integer priv) {
    this.priv = priv;
  }

  public Collection<DisplayFormat> getDisplayfmt() {
    return this.displayfmt;
  }

  public void setDisplayfmt(Collection<DisplayFormat> displayfmt) {
    this.displayfmt = displayfmt;
  }

  public @Valid NativeFormat getNativefmt() {
    return this.nativefmt;
  }

  public void setNativefmt(@Valid NativeFormat nativefmt) {
    this.nativefmt = nativefmt;
  }

  public @Valid Collection<EventSpec> getEvent() {
    return this.event;
  }

  public void setEvent(@Valid Collection<EventSpec> event) {
    this.event = event;
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
    DisplayPlacement that = (DisplayPlacement) o;
    return Objects.equals(getPos(), that.getPos())
        && Objects.equals(getInstl(), that.getInstl())
        && Objects.equals(getTopframe(), that.getTopframe())
        && Objects.equals(getIfrbust(), that.getIfrbust())
        && Objects.equals(getClktype(), that.getClktype())
        && Objects.equals(getAmpren(), that.getAmpren())
        && Objects.equals(getPtype(), that.getPtype())
        && Objects.equals(getContext(), that.getContext())
        && Objects.equals(getMime(), that.getMime())
        && Objects.equals(getApi(), that.getApi())
        && Objects.equals(getCtype(), that.getCtype())
        && Objects.equals(getW(), that.getW())
        && Objects.equals(getH(), that.getH())
        && Objects.equals(getUnit(), that.getUnit())
        && Objects.equals(getPriv(), that.getPriv())
        && Objects.equals(getDisplayfmt(), that.getDisplayfmt())
        && Objects.equals(getNativefmt(), that.getNativefmt())
        && Objects.equals(getEvent(), that.getEvent())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getPos(),
        getInstl(),
        getTopframe(),
        getIfrbust(),
        getClktype(),
        getAmpren(),
        getPtype(),
        getContext(),
        getMime(),
        getApi(),
        getCtype(),
        getW(),
        getH(),
        getUnit(),
        getPriv(),
        getDisplayfmt(),
        getNativefmt(),
        getEvent(),
        getExt());
  }
}
