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
import java.util.Objects;

public class App {

  private String id;

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

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App app = (App) o;
    return Objects.equals(getId(), app.getId())
        && Objects.equals(getName(), app.getName())
        && Objects.equals(getBundle(), app.getBundle())
        && Objects.equals(getDomain(), app.getDomain())
        && Objects.equals(getStoreurl(), app.getStoreurl())
        && Objects.equals(getCat(), app.getCat())
        && Objects.equals(getSectioncat(), app.getSectioncat())
        && Objects.equals(getPagecat(), app.getPagecat())
        && Objects.equals(getVer(), app.getVer())
        && Objects.equals(getPrivacypolicy(), app.getPrivacypolicy())
        && Objects.equals(getPaid(), app.getPaid())
        && Objects.equals(getPublisher(), app.getPublisher())
        && Objects.equals(getContent(), app.getContent())
        && Objects.equals(getKeywords(), app.getKeywords())
        && Objects.equals(getExt(), app.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getName(),
        getBundle(),
        getDomain(),
        getStoreurl(),
        getCat(),
        getSectioncat(),
        getPagecat(),
        getVer(),
        getPrivacypolicy(),
        getPaid(),
        getPublisher(),
        getContent(),
        getKeywords(),
        getExt());
  }
}
