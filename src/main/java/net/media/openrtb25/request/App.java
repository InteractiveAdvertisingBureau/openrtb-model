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

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;

public class App {

  @NotNull private String id;

  private String name;

  private String bundle;

  private String domain;

  private String storeurl;

  private Collection<String> cat;

  private Collection<String> sectioncat;

  private Collection<String> pagecat;

  private String ver;

  private Integer privacypolicy;

  private Integer paid;

  private Publisher publisher;

  private Content content;

  private String keywords;

  private Map<String, Object> ext;

  public App() {}

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

  public String getBundle() {
    return this.bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public String getStoreurl() {
    return this.storeurl;
  }

  public void setStoreurl(String storeurl) {
    this.storeurl = storeurl;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public Collection<String> getSectioncat() {
    return this.sectioncat;
  }

  public void setSectioncat(Collection<String> sectioncat) {
    this.sectioncat = sectioncat;
  }

  public Collection<String> getPagecat() {
    return this.pagecat;
  }

  public void setPagecat(Collection<String> pagecat) {
    this.pagecat = pagecat;
  }

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public Integer getPrivacypolicy() {
    return this.privacypolicy;
  }

  public void setPrivacypolicy(Integer privacypolicy) {
    this.privacypolicy = privacypolicy;
  }

  public Integer getPaid() {
    return this.paid;
  }

  public void setPaid(Integer paid) {
    this.paid = paid;
  }

  public Publisher getPublisher() {
    return this.publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public Content getContent() {
    return this.content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof App)) return false;
    final App other = (App) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final Object this$bundle = this.getBundle();
    final Object other$bundle = other.getBundle();
    if (this$bundle == null ? other$bundle != null : !this$bundle.equals(other$bundle))
      return false;
    final Object this$domain = this.getDomain();
    final Object other$domain = other.getDomain();
    if (this$domain == null ? other$domain != null : !this$domain.equals(other$domain))
      return false;
    final Object this$storeurl = this.getStoreurl();
    final Object other$storeurl = other.getStoreurl();
    if (this$storeurl == null ? other$storeurl != null : !this$storeurl.equals(other$storeurl))
      return false;
    final Object this$cat = this.getCat();
    final Object other$cat = other.getCat();
    if (this$cat == null ? other$cat != null : !this$cat.equals(other$cat)) return false;
    final Object this$sectioncat = this.getSectioncat();
    final Object other$sectioncat = other.getSectioncat();
    if (this$sectioncat == null
        ? other$sectioncat != null
        : !this$sectioncat.equals(other$sectioncat)) return false;
    final Object this$pagecat = this.getPagecat();
    final Object other$pagecat = other.getPagecat();
    if (this$pagecat == null ? other$pagecat != null : !this$pagecat.equals(other$pagecat))
      return false;
    final Object this$ver = this.getVer();
    final Object other$ver = other.getVer();
    if (this$ver == null ? other$ver != null : !this$ver.equals(other$ver)) return false;
    final Object this$privacypolicy = this.getPrivacypolicy();
    final Object other$privacypolicy = other.getPrivacypolicy();
    if (this$privacypolicy == null
        ? other$privacypolicy != null
        : !this$privacypolicy.equals(other$privacypolicy)) return false;
    final Object this$paid = this.getPaid();
    final Object other$paid = other.getPaid();
    if (this$paid == null ? other$paid != null : !this$paid.equals(other$paid)) return false;
    final Object this$publisher = this.getPublisher();
    final Object other$publisher = other.getPublisher();
    if (this$publisher == null ? other$publisher != null : !this$publisher.equals(other$publisher))
      return false;
    final Object this$content = this.getContent();
    final Object other$content = other.getContent();
    if (this$content == null ? other$content != null : !this$content.equals(other$content))
      return false;
    final Object this$keywords = this.getKeywords();
    final Object other$keywords = other.getKeywords();
    if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $bundle = this.getBundle();
    result = result * PRIME + ($bundle == null ? 43 : $bundle.hashCode());
    final Object $domain = this.getDomain();
    result = result * PRIME + ($domain == null ? 43 : $domain.hashCode());
    final Object $storeurl = this.getStoreurl();
    result = result * PRIME + ($storeurl == null ? 43 : $storeurl.hashCode());
    final Object $cat = this.getCat();
    result = result * PRIME + ($cat == null ? 43 : $cat.hashCode());
    final Object $sectioncat = this.getSectioncat();
    result = result * PRIME + ($sectioncat == null ? 43 : $sectioncat.hashCode());
    final Object $pagecat = this.getPagecat();
    result = result * PRIME + ($pagecat == null ? 43 : $pagecat.hashCode());
    final Object $ver = this.getVer();
    result = result * PRIME + ($ver == null ? 43 : $ver.hashCode());
    final Object $privacypolicy = this.getPrivacypolicy();
    result = result * PRIME + ($privacypolicy == null ? 43 : $privacypolicy.hashCode());
    final Object $paid = this.getPaid();
    result = result * PRIME + ($paid == null ? 43 : $paid.hashCode());
    final Object $publisher = this.getPublisher();
    result = result * PRIME + ($publisher == null ? 43 : $publisher.hashCode());
    final Object $content = this.getContent();
    result = result * PRIME + ($content == null ? 43 : $content.hashCode());
    final Object $keywords = this.getKeywords();
    result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof App;
  }

  public String toString() {
    return "net.media.openrtb25.request.App(id="
        + this.getId()
        + ", name="
        + this.getName()
        + ", bundle="
        + this.getBundle()
        + ", domain="
        + this.getDomain()
        + ", storeurl="
        + this.getStoreurl()
        + ", cat="
        + this.getCat()
        + ", sectioncat="
        + this.getSectioncat()
        + ", pagecat="
        + this.getPagecat()
        + ", ver="
        + this.getVer()
        + ", privacypolicy="
        + this.getPrivacypolicy()
        + ", paid="
        + this.getPaid()
        + ", publisher="
        + this.getPublisher()
        + ", content="
        + this.getContent()
        + ", keywords="
        + this.getKeywords()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
