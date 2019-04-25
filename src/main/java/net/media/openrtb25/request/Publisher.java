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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/** Created by vishnu on 6/5/16. */
public class Publisher {

  @NotNull private String id;

  private String name;

  private Collection<String> cat;

  private String domain;

  private Map<String, Object> ext;

  public Publisher(String id) {
    this.id = id;
  }

  public Publisher() {}

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

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
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
    Publisher publisher = (Publisher) o;
    return Objects.equals(getId(), publisher.getId()) &&
      Objects.equals(getName(), publisher.getName()) &&
      Objects.equals(getCat(), publisher.getCat()) &&
      Objects.equals(getDomain(), publisher.getDomain()) &&
      Objects.equals(getExt(), publisher.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getCat(), getDomain(), getExt());
  }
}
