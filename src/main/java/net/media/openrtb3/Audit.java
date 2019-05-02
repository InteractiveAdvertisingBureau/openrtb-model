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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Audit {

  private Integer status;
  private Collection<String> feedback = null;
  private Integer init;
  private Integer lastmod;
  private Map<String, Object> corr;
  private Map<String, Object> ext;

  public Audit() {}

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Collection<String> getFeedback() {
    return this.feedback;
  }

  public void setFeedback(Collection<String> feedback) {
    this.feedback = feedback;
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

  public Map<String, Object> getCorr() {
    return this.corr;
  }

  public void setCorr(Map<String, Object> corr) {
    this.corr = corr;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Audit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Audit audit = (Audit) o;
    return Objects.equals(getStatus(), audit.getStatus())
        && Objects.equals(getFeedback(), audit.getFeedback())
        && Objects.equals(getInit(), audit.getInit())
        && Objects.equals(getLastmod(), audit.getLastmod())
        && Objects.equals(getCorr(), audit.getCorr())
        && Objects.equals(getExt(), audit.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getStatus(), getFeedback(), getInit(), getLastmod(), getCorr(), getExt());
  }
}
