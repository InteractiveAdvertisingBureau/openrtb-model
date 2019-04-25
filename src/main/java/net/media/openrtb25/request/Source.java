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
import java.util.Objects;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Source source = (Source) o;
    return Objects.equals(getFd(), source.getFd()) &&
      Objects.equals(getTid(), source.getTid()) &&
      Objects.equals(getPchain(), source.getPchain()) &&
      Objects.equals(getExt(), source.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFd(), getTid(), getPchain(), getExt());
  }
}
