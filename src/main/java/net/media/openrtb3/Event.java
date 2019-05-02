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

import net.media.utils.validator.Ortb3EventObjectValidator;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Ortb3EventObjectValidator
public class Event {

  @NotNull private Integer type;
  @NotNull private Integer method;
  private String url;
  private Collection<Integer> api;
  private Map<String, Object> cdata;
  private Object ext;

  public Event() {}

  public @NotNull Integer getType() {
    return this.type;
  }

  public void setType(@NotNull Integer type) {
    this.type = type;
  }

  public @NotNull Integer getMethod() {
    return this.method;
  }

  public void setMethod(@NotNull Integer method) {
    this.method = method;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public Map<String, Object> getCdata() {
    return this.cdata;
  }

  public void setCdata(Map<String, Object> cdata) {
    this.cdata = cdata;
  }

  public Object getExt() {
    return this.ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Event event = (Event) o;
    return Objects.equals(getType(), event.getType())
        && Objects.equals(getMethod(), event.getMethod())
        && Objects.equals(getUrl(), event.getUrl())
        && Objects.equals(getApi(), event.getApi())
        && Objects.equals(getCdata(), event.getCdata())
        && Objects.equals(getExt(), event.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getType(), getMethod(), getUrl(), getApi(), getCdata(), getExt());
  }
}
