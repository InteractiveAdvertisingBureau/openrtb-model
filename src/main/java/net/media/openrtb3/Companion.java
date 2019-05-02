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

/** Created by shiva.b on 14/12/18. */
public class Companion {
  private String id;
  private Integer vcm;
  private DisplayPlacement display;
  private Map<String, Object> ext;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getVcm() {
    return this.vcm;
  }

  public void setVcm(Integer vcm) {
    this.vcm = vcm;
  }

  public DisplayPlacement getDisplay() {
    return this.display;
  }

  public void setDisplay(DisplayPlacement display) {
    this.display = display;
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
    Companion companion = (Companion) o;
    return Objects.equals(getId(), companion.getId())
        && Objects.equals(getVcm(), companion.getVcm())
        && Objects.equals(getDisplay(), companion.getDisplay())
        && Objects.equals(getExt(), companion.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getVcm(), getDisplay(), getExt());
  }
}
