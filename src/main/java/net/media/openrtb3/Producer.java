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

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

public class Producer {
  @NotNull private String id;
  private String name;
  private String domain;
  private Collection<String> cat;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private Map<String, Object> ext;

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Producer producer = (Producer) o;
    return Objects.equals(getId(), producer.getId())
        && Objects.equals(getName(), producer.getName())
        && Objects.equals(getDomain(), producer.getDomain())
        && Objects.equals(getCat(), producer.getCat())
        && Objects.equals(getCattax(), producer.getCattax())
        && Objects.equals(getExt(), producer.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getDomain(), getCat(), getCattax(), getExt());
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

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
