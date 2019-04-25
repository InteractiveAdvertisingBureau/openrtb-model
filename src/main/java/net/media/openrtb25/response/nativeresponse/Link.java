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

package net.media.openrtb25.response.nativeresponse;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Link {
  private String url;

  private Collection<String> clicktrackers;

  private String fallback;

  private Map<String, Object> ext;

  public Link() {}

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Collection<String> getClicktrackers() {
    return this.clicktrackers;
  }

  public void setClicktrackers(Collection<String> clicktrackers) {
    this.clicktrackers = clicktrackers;
  }

  public String getFallback() {
    return this.fallback;
  }

  public void setFallback(String fallback) {
    this.fallback = fallback;
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
    Link link = (Link) o;
    return Objects.equals(getUrl(), link.getUrl()) &&
      Objects.equals(getClicktrackers(), link.getClicktrackers()) &&
      Objects.equals(getFallback(), link.getFallback()) &&
      Objects.equals(getExt(), link.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUrl(), getClicktrackers(), getFallback(), getExt());
  }
}
