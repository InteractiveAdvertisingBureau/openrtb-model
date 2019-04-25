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

import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;

/** Created by shiva.b on 14/12/18. */
public class VideoPlacement {

  private static final Integer DEFAULT_UNITS = 1;

  private Integer ptype;
  private Integer pos;
  private Integer delay;
  private Integer skip;
  private Integer skipmin;
  private Integer skipafter;
  private Integer playmethod;
  private Integer playend;
  private Integer clktype;
  @NotEmpty private Collection<String> mime;
  private Collection<Integer> api;
  private Collection<Integer> ctype;
  private Integer w;
  private Integer h;
  private Integer unit = DEFAULT_UNITS;
  private Integer mindur;
  private Integer maxdur;
  private Integer maxext = 0;
  private Integer minbitr;
  private Integer maxbitr;
  private Collection<Integer> delivery;
  private Integer maxseq;
  private Integer linear;
  private Integer boxing;
  private Collection<Companion> comp;
  private Collection<Integer> comptype;
  private Map<String, Object> ext;

  public Integer getPtype() {
    return this.ptype;
  }

  public void setPtype(Integer ptype) {
    this.ptype = ptype;
  }

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Integer getDelay() {
    return this.delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public Integer getSkip() {
    return this.skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public Integer getSkipmin() {
    return this.skipmin;
  }

  public void setSkipmin(Integer skipmin) {
    this.skipmin = skipmin;
  }

  public Integer getSkipafter() {
    return this.skipafter;
  }

  public void setSkipafter(Integer skipafter) {
    this.skipafter = skipafter;
  }

  public Integer getPlaymethod() {
    return this.playmethod;
  }

  public void setPlaymethod(Integer playmethod) {
    this.playmethod = playmethod;
  }

  public Integer getPlayend() {
    return this.playend;
  }

  public void setPlayend(Integer playend) {
    this.playend = playend;
  }

  public Integer getClktype() {
    return this.clktype;
  }

  public void setClktype(Integer clktype) {
    this.clktype = clktype;
  }

  public @NotEmpty Collection<String> getMime() {
    return this.mime;
  }

  public void setMime(@NotEmpty Collection<String> mime) {
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

  public Integer getMindur() {
    return this.mindur;
  }

  public void setMindur(Integer mindur) {
    this.mindur = mindur;
  }

  public Integer getMaxdur() {
    return this.maxdur;
  }

  public void setMaxdur(Integer maxdur) {
    this.maxdur = maxdur;
  }

  public Integer getMaxext() {
    return this.maxext;
  }

  public void setMaxext(Integer maxext) {
    this.maxext = maxext;
  }

  public Integer getMinbitr() {
    return this.minbitr;
  }

  public void setMinbitr(Integer minbitr) {
    this.minbitr = minbitr;
  }

  public Integer getMaxbitr() {
    return this.maxbitr;
  }

  public void setMaxbitr(Integer maxbitr) {
    this.maxbitr = maxbitr;
  }

  public Collection<Integer> getDelivery() {
    return this.delivery;
  }

  public void setDelivery(Collection<Integer> delivery) {
    this.delivery = delivery;
  }

  public Integer getMaxseq() {
    return this.maxseq;
  }

  public void setMaxseq(Integer maxseq) {
    this.maxseq = maxseq;
  }

  public Integer getLinear() {
    return this.linear;
  }

  public void setLinear(Integer linear) {
    this.linear = linear;
  }

  public Integer getBoxing() {
    return this.boxing;
  }

  public void setBoxing(Integer boxing) {
    this.boxing = boxing;
  }

  public Collection<Companion> getComp() {
    return this.comp;
  }

  public void setComp(Collection<Companion> comp) {
    this.comp = comp;
  }

  public Collection<Integer> getComptype() {
    return this.comptype;
  }

  public void setComptype(Collection<Integer> comptype) {
    this.comptype = comptype;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
