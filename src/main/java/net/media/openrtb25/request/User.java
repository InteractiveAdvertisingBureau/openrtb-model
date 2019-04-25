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

import net.media.utils.validator.CheckAtLeastOneNotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@CheckAtLeastOneNotNull(fieldNames = {"id", "buyeruid"})
public class User {

  public String id;

  public String buyeruid;

  public Integer yob;

  public String gender;

  public Geo geo;

  private String keywords;

  private String customdata;

  private Collection<Data> data;

  private Map<String, Object> ext;

  private Integer age;

  public User() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBuyeruid() {
    return this.buyeruid;
  }

  public void setBuyeruid(String buyeruid) {
    this.buyeruid = buyeruid;
  }

  public Integer getYob() {
    return this.yob;
  }

  public void setYob(Integer yob) {
    this.yob = yob;
  }

  public String getGender() {
    return this.gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Geo getGeo() {
    return this.geo;
  }

  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getCustomdata() {
    return this.customdata;
  }

  public void setCustomdata(String customdata) {
    this.customdata = customdata;
  }

  public Collection<Data> getData() {
    return this.data;
  }

  public void setData(Collection<Data> data) {
    this.data = data;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(getId(), user.getId()) &&
      Objects.equals(getBuyeruid(), user.getBuyeruid()) &&
      Objects.equals(getYob(), user.getYob()) &&
      Objects.equals(getGender(), user.getGender()) &&
      Objects.equals(getGeo(), user.getGeo()) &&
      Objects.equals(getKeywords(), user.getKeywords()) &&
      Objects.equals(getCustomdata(), user.getCustomdata()) &&
      Objects.equals(getData(), user.getData()) &&
      Objects.equals(getExt(), user.getExt()) &&
      Objects.equals(getAge(), user.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getBuyeruid(), getYob(), getGender(), getGeo(), getKeywords(), getCustomdata(), getData(), getExt(), getAge());
  }
}
