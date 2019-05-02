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

import java.util.Map;
import java.util.Objects;

public class Source {
  private String tid;
  private Integer ts;
  private String ds;
  private String dsmap;
  private String cert;
  private String digest;
  private String pchain;
  private Map<String, Object> ext;

  public String getTid() {
    return this.tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Integer getTs() {
    return this.ts;
  }

  public void setTs(Integer ts) {
    this.ts = ts;
  }

  public String getDs() {
    return this.ds;
  }

  public void setDs(String ds) {
    this.ds = ds;
  }

  public String getDsmap() {
    return this.dsmap;
  }

  public void setDsmap(String dsmap) {
    this.dsmap = dsmap;
  }

  public String getCert() {
    return this.cert;
  }

  public void setCert(String cert) {
    this.cert = cert;
  }

  public String getDigest() {
    return this.digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Source source = (Source) o;
    return Objects.equals(getTid(), source.getTid())
        && Objects.equals(getTs(), source.getTs())
        && Objects.equals(getDs(), source.getDs())
        && Objects.equals(getDsmap(), source.getDsmap())
        && Objects.equals(getCert(), source.getCert())
        && Objects.equals(getDigest(), source.getDigest())
        && Objects.equals(getPchain(), source.getPchain())
        && Objects.equals(getExt(), source.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getTid(), getTs(), getDs(), getDsmap(), getCert(), getDigest(), getPchain(), getExt());
  }
}
