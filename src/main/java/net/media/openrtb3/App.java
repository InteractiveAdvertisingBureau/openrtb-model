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

package net.media.openrtb3;

import java.util.Collection;
import java.util.Map;

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

public class App extends DistributionChannel {

  private static final Integer DEFAULT_PAID = 0;

  private String domain;
  private Collection<String> cat;
  private Collection<String> sectcat;
  private Collection<String> pagecat;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private Integer privpolicy;
  private String keywords;
  private String bundle;
  private String storeid;
  private String storeurl;
  private String ver;
  private Integer paid = DEFAULT_PAID;
  private Map<String, Object> ext;

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

  public Collection<String> getSectcat() {
    return this.sectcat;
  }

  public void setSectcat(Collection<String> sectcat) {
    this.sectcat = sectcat;
  }

  public Collection<String> getPagecat() {
    return this.pagecat;
  }

  public void setPagecat(Collection<String> pagecat) {
    this.pagecat = pagecat;
  }

  public Integer getCattax() {
    return this.cattax;
  }

  public void setCattax(Integer cattax) {
    this.cattax = cattax;
  }

  public Integer getPrivpolicy() {
    return this.privpolicy;
  }

  public void setPrivpolicy(Integer privpolicy) {
    this.privpolicy = privpolicy;
  }

  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getBundle() {
    return this.bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public String getStoreid() {
    return this.storeid;
  }

  public void setStoreid(String storeid) {
    this.storeid = storeid;
  }

  public String getStoreurl() {
    return this.storeurl;
  }

  public void setStoreurl(String storeurl) {
    this.storeurl = storeurl;
  }

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public Integer getPaid() {
    return this.paid;
  }

  public void setPaid(Integer paid) {
    this.paid = paid;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
