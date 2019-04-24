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

import java.util.Map;

public class Source {

  private Integer fd;

  private String tid;

  private String pchain;

  private Map<String, Object> ext;

  public Source() {}

  public Integer getFd() {
    return this.fd;
  }

  public void setFd(Integer fd) {
    this.fd = fd;
  }

  public String getTid() {
    return this.tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public String getPchain() {
    return this.pchain;
  }

  public void setPchain(String pchain) {
    this.pchain = pchain;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Source)) return false;
    final Source other = (Source) o;
    if (!other.canEqual(this)) return false;
    final Object this$fd = this.getFd();
    final Object other$fd = other.getFd();
    if (this$fd == null ? other$fd != null : !this$fd.equals(other$fd)) return false;
    final Object this$tid = this.getTid();
    final Object other$tid = other.getTid();
    if (this$tid == null ? other$tid != null : !this$tid.equals(other$tid)) return false;
    final Object this$pchain = this.getPchain();
    final Object other$pchain = other.getPchain();
    if (this$pchain == null ? other$pchain != null : !this$pchain.equals(other$pchain))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $fd = this.getFd();
    result = result * PRIME + ($fd == null ? 43 : $fd.hashCode());
    final Object $tid = this.getTid();
    result = result * PRIME + ($tid == null ? 43 : $tid.hashCode());
    final Object $pchain = this.getPchain();
    result = result * PRIME + ($pchain == null ? 43 : $pchain.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Source;
  }

  public String toString() {
    return "net.media.openrtb25.request.Source(fd="
        + this.getFd()
        + ", tid="
        + this.getTid()
        + ", pchain="
        + this.getPchain()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
