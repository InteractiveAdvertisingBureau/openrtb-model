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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

/** Created by shiva.b on 17/12/18. */
@CheckExactlyOneNotNull(fieldNames = {"video", "audio", "display"})
public class Ad {

  @NotNull private String id;
  private Collection<String> adomain = null;
  private Collection<String> bundle = null;
  private String iurl;
  private Collection<String> cat = null;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private String lang;
  private Collection<Integer> attr = null;
  private Integer secure;
  private Integer mrating;
  private Integer init;
  private Integer lastmod;
  @Valid private Display display;
  @Valid private Video video;
  @Valid private Audio audio;
  @Valid private Audit audit;
  private Map<String, Object> ext;

  public Ad() {}

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public Collection<String> getAdomain() {
    return this.adomain;
  }

  public void setAdomain(Collection<String> adomain) {
    this.adomain = adomain;
  }

  public Collection<String> getBundle() {
    return this.bundle;
  }

  public void setBundle(Collection<String> bundle) {
    this.bundle = bundle;
  }

  public String getIurl() {
    return this.iurl;
  }

  public void setIurl(String iurl) {
    this.iurl = iurl;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public Integer getCattax() {
    return this.cattax;
  }

  public void setCattax(Integer cattax) {
    this.cattax = cattax;
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Collection<Integer> getAttr() {
    return this.attr;
  }

  public void setAttr(Collection<Integer> attr) {
    this.attr = attr;
  }

  public Integer getSecure() {
    return this.secure;
  }

  public void setSecure(Integer secure) {
    this.secure = secure;
  }

  public Integer getMrating() {
    return this.mrating;
  }

  public void setMrating(Integer mrating) {
    this.mrating = mrating;
  }

  public Integer getInit() {
    return this.init;
  }

  public void setInit(Integer init) {
    this.init = init;
  }

  public Integer getLastmod() {
    return this.lastmod;
  }

  public void setLastmod(Integer lastmod) {
    this.lastmod = lastmod;
  }

  public @Valid Display getDisplay() {
    return this.display;
  }

  public void setDisplay(@Valid Display display) {
    this.display = display;
  }

  public @Valid Video getVideo() {
    return this.video;
  }

  public void setVideo(@Valid Video video) {
    this.video = video;
  }

  public @Valid Audio getAudio() {
    return this.audio;
  }

  public void setAudio(@Valid Audio audio) {
    this.audio = audio;
  }

  public @Valid Audit getAudit() {
    return this.audit;
  }

  public void setAudit(@Valid Audit audit) {
    this.audit = audit;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Ad;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Ad ad = (Ad) o;
    return Objects.equals(getId(), ad.getId())
        && Objects.equals(getAdomain(), ad.getAdomain())
        && Objects.equals(getBundle(), ad.getBundle())
        && Objects.equals(getIurl(), ad.getIurl())
        && Objects.equals(getCat(), ad.getCat())
        && Objects.equals(getCattax(), ad.getCattax())
        && Objects.equals(getLang(), ad.getLang())
        && Objects.equals(getAttr(), ad.getAttr())
        && Objects.equals(getSecure(), ad.getSecure())
        && Objects.equals(getMrating(), ad.getMrating())
        && Objects.equals(getInit(), ad.getInit())
        && Objects.equals(getLastmod(), ad.getLastmod())
        && Objects.equals(getDisplay(), ad.getDisplay())
        && Objects.equals(getVideo(), ad.getVideo())
        && Objects.equals(getAudio(), ad.getAudio())
        && Objects.equals(getAudit(), ad.getAudit())
        && Objects.equals(getExt(), ad.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getId(),
        getAdomain(),
        getBundle(),
        getIurl(),
        getCat(),
        getCattax(),
        getLang(),
        getAttr(),
        getSecure(),
        getMrating(),
        getInit(),
        getLastmod(),
        getDisplay(),
        getVideo(),
        getAudio(),
        getAudit(),
        getExt());
  }
}
