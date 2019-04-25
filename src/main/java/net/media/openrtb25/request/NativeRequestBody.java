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

package net.media.openrtb25.request;

import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class NativeRequestBody {

  private String ver = Native.DEFAULT_NATIVE_VERSION;

  private Integer layout;

  private Integer adunit;

  private Integer context;

  private Integer contextsubtype;

  private Integer plcmttype;

  private Integer plcmtcnt;

  private Integer seq;

  @NotEmpty private Collection<Asset> assets;

  private Map<String, Object> ext;

  public NativeRequestBody() {}

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public Integer getLayout() {
    return this.layout;
  }

  public void setLayout(Integer layout) {
    this.layout = layout;
  }

  public Integer getAdunit() {
    return this.adunit;
  }

  public void setAdunit(Integer adunit) {
    this.adunit = adunit;
  }

  public Integer getContext() {
    return this.context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }

  public Integer getContextsubtype() {
    return this.contextsubtype;
  }

  public void setContextsubtype(Integer contextsubtype) {
    this.contextsubtype = contextsubtype;
  }

  public Integer getPlcmttype() {
    return this.plcmttype;
  }

  public void setPlcmttype(Integer plcmttype) {
    this.plcmttype = plcmttype;
  }

  public Integer getPlcmtcnt() {
    return this.plcmtcnt;
  }

  public void setPlcmtcnt(Integer plcmtcnt) {
    this.plcmtcnt = plcmtcnt;
  }

  public Integer getSeq() {
    return this.seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public @NotEmpty Collection<Asset> getAssets() {
    return this.assets;
  }

  public void setAssets(@NotEmpty Collection<Asset> assets) {
    this.assets = assets;
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
    NativeRequestBody that = (NativeRequestBody) o;
    return Objects.equals(getVer(), that.getVer())
        && Objects.equals(getLayout(), that.getLayout())
        && Objects.equals(getAdunit(), that.getAdunit())
        && Objects.equals(getContext(), that.getContext())
        && Objects.equals(getContextsubtype(), that.getContextsubtype())
        && Objects.equals(getPlcmttype(), that.getPlcmttype())
        && Objects.equals(getPlcmtcnt(), that.getPlcmtcnt())
        && Objects.equals(getSeq(), that.getSeq())
        && Objects.equals(getAssets(), that.getAssets())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getVer(),
        getLayout(),
        getAdunit(),
        getContext(),
        getContextsubtype(),
        getPlcmttype(),
        getPlcmtcnt(),
        getSeq(),
        getAssets(),
        getExt());
  }
}
