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

package net.media.openrtb25.request;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Site {

  private String id;

  private String name;

  private String domain;

  private Collection<String> cat;

  private Collection<String> sectioncat;

  private Collection<String> pagecat;

  private String page;

  private String ref;

  private String search;

  private Integer mobile;

  private Integer privacypolicy;

  private Publisher publisher;

  private Content content;

  private String keywords;

  private Map<String, Object> ext;

  public Site() {}

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

  public String getDomain() {
    return this.domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
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

  public String getPage() {
    return this.page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public String getRef() {
    return this.ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public String getSearch() {
    return this.search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public Integer getMobile() {
    return this.mobile;
  }

  public void setMobile(Integer mobile) {
    this.mobile = mobile;
  }

  public Integer getPrivacypolicy() {
    return this.privacypolicy;
  }

  public void setPrivacypolicy(Integer privacypolicy) {
    this.privacypolicy = privacypolicy;
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
    Site site = (Site) o;
    return Objects.equals(getId(), site.getId())
        && Objects.equals(getName(), site.getName())
        && Objects.equals(getDomain(), site.getDomain())
        && Objects.equals(getCat(), site.getCat())
        && Objects.equals(getSectioncat(), site.getSectioncat())
        && Objects.equals(getPagecat(), site.getPagecat())
        && Objects.equals(getPage(), site.getPage())
        && Objects.equals(getRef(), site.getRef())
        && Objects.equals(getSearch(), site.getSearch())
        && Objects.equals(getMobile(), site.getMobile())
        && Objects.equals(getPrivacypolicy(), site.getPrivacypolicy())
        && Objects.equals(getPublisher(), site.getPublisher())
        && Objects.equals(getContent(), site.getContent())
        && Objects.equals(getKeywords(), site.getKeywords())
        && Objects.equals(getExt(), site.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getName(),
        getDomain(),
        getCat(),
        getSectioncat(),
        getPagecat(),
        getPage(),
        getRef(),
        getSearch(),
        getMobile(),
        getPrivacypolicy(),
        getPublisher(),
        getContent(),
        getKeywords(),
        getExt());
  }
}
