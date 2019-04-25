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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeRequestBody)) return false;
    final NativeRequestBody other = (NativeRequestBody) o;
    if (!other.canEqual(this)) return false;
    final Object this$ver = this.getVer();
    final Object other$ver = other.getVer();
    if (this$ver == null ? other$ver != null : !this$ver.equals(other$ver)) return false;
    final Object this$layout = this.getLayout();
    final Object other$layout = other.getLayout();
    if (this$layout == null ? other$layout != null : !this$layout.equals(other$layout))
      return false;
    final Object this$adunit = this.getAdunit();
    final Object other$adunit = other.getAdunit();
    if (this$adunit == null ? other$adunit != null : !this$adunit.equals(other$adunit))
      return false;
    final Object this$context = this.getContext();
    final Object other$context = other.getContext();
    if (this$context == null ? other$context != null : !this$context.equals(other$context))
      return false;
    final Object this$contextsubtype = this.getContextsubtype();
    final Object other$contextsubtype = other.getContextsubtype();
    if (this$contextsubtype == null
        ? other$contextsubtype != null
        : !this$contextsubtype.equals(other$contextsubtype)) return false;
    final Object this$plcmttype = this.getPlcmttype();
    final Object other$plcmttype = other.getPlcmttype();
    if (this$plcmttype == null ? other$plcmttype != null : !this$plcmttype.equals(other$plcmttype))
      return false;
    final Object this$plcmtcnt = this.getPlcmtcnt();
    final Object other$plcmtcnt = other.getPlcmtcnt();
    if (this$plcmtcnt == null ? other$plcmtcnt != null : !this$plcmtcnt.equals(other$plcmtcnt))
      return false;
    final Object this$seq = this.getSeq();
    final Object other$seq = other.getSeq();
    if (this$seq == null ? other$seq != null : !this$seq.equals(other$seq)) return false;
    final Object this$assets = this.getAssets();
    final Object other$assets = other.getAssets();
    if (this$assets == null ? other$assets != null : !this$assets.equals(other$assets))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $ver = this.getVer();
    result = result * PRIME + ($ver == null ? 43 : $ver.hashCode());
    final Object $layout = this.getLayout();
    result = result * PRIME + ($layout == null ? 43 : $layout.hashCode());
    final Object $adunit = this.getAdunit();
    result = result * PRIME + ($adunit == null ? 43 : $adunit.hashCode());
    final Object $context = this.getContext();
    result = result * PRIME + ($context == null ? 43 : $context.hashCode());
    final Object $contextsubtype = this.getContextsubtype();
    result = result * PRIME + ($contextsubtype == null ? 43 : $contextsubtype.hashCode());
    final Object $plcmttype = this.getPlcmttype();
    result = result * PRIME + ($plcmttype == null ? 43 : $plcmttype.hashCode());
    final Object $plcmtcnt = this.getPlcmtcnt();
    result = result * PRIME + ($plcmtcnt == null ? 43 : $plcmtcnt.hashCode());
    final Object $seq = this.getSeq();
    result = result * PRIME + ($seq == null ? 43 : $seq.hashCode());
    final Object $assets = this.getAssets();
    result = result * PRIME + ($assets == null ? 43 : $assets.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeRequestBody;
  }

  public String toString() {
    return "net.media.openrtb25.request.NativeRequestBody(ver="
        + this.getVer()
        + ", layout="
        + this.getLayout()
        + ", adunit="
        + this.getAdunit()
        + ", context="
        + this.getContext()
        + ", contextsubtype="
        + this.getContextsubtype()
        + ", plcmttype="
        + this.getPlcmttype()
        + ", plcmtcnt="
        + this.getPlcmtcnt()
        + ", seq="
        + this.getSeq()
        + ", assets="
        + this.getAssets()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
