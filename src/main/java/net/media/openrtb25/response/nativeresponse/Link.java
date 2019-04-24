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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Link)) return false;
    final Link other = (Link) o;
    if (!other.canEqual(this)) return false;
    final Object this$url = this.getUrl();
    final Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    final Object this$clicktrackers = this.getClicktrackers();
    final Object other$clicktrackers = other.getClicktrackers();
    if (this$clicktrackers == null
        ? other$clicktrackers != null
        : !this$clicktrackers.equals(other$clicktrackers)) return false;
    final Object this$fallback = this.getFallback();
    final Object other$fallback = other.getFallback();
    if (this$fallback == null ? other$fallback != null : !this$fallback.equals(other$fallback))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $url = this.getUrl();
    result = result * PRIME + ($url == null ? 43 : $url.hashCode());
    final Object $clicktrackers = this.getClicktrackers();
    result = result * PRIME + ($clicktrackers == null ? 43 : $clicktrackers.hashCode());
    final Object $fallback = this.getFallback();
    result = result * PRIME + ($fallback == null ? 43 : $fallback.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Link;
  }

  public String toString() {
    return "net.media.openrtb25.response.nativeresponse.Link(url="
        + this.getUrl()
        + ", clicktrackers="
        + this.getClicktrackers()
        + ", fallback="
        + this.getFallback()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
