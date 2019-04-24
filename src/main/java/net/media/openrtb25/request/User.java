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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof User)) return false;
    final User other = (User) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$buyeruid = this.getBuyeruid();
    final Object other$buyeruid = other.getBuyeruid();
    if (this$buyeruid == null ? other$buyeruid != null : !this$buyeruid.equals(other$buyeruid))
      return false;
    final Object this$yob = this.getYob();
    final Object other$yob = other.getYob();
    if (this$yob == null ? other$yob != null : !this$yob.equals(other$yob)) return false;
    final Object this$gender = this.getGender();
    final Object other$gender = other.getGender();
    if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender))
      return false;
    final Object this$geo = this.getGeo();
    final Object other$geo = other.getGeo();
    if (this$geo == null ? other$geo != null : !this$geo.equals(other$geo)) return false;
    final Object this$keywords = this.getKeywords();
    final Object other$keywords = other.getKeywords();
    if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords))
      return false;
    final Object this$customdata = this.getCustomdata();
    final Object other$customdata = other.getCustomdata();
    if (this$customdata == null
        ? other$customdata != null
        : !this$customdata.equals(other$customdata)) return false;
    final Object this$data = this.getData();
    final Object other$data = other.getData();
    if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    if (this$ext == null ? other$ext != null : !this$ext.equals(other$ext)) return false;
    final Object this$age = this.getAge();
    final Object other$age = other.getAge();
    return this$age == null ? other$age == null : this$age.equals(other$age);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $buyeruid = this.getBuyeruid();
    result = result * PRIME + ($buyeruid == null ? 43 : $buyeruid.hashCode());
    final Object $yob = this.getYob();
    result = result * PRIME + ($yob == null ? 43 : $yob.hashCode());
    final Object $gender = this.getGender();
    result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
    final Object $geo = this.getGeo();
    result = result * PRIME + ($geo == null ? 43 : $geo.hashCode());
    final Object $keywords = this.getKeywords();
    result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
    final Object $customdata = this.getCustomdata();
    result = result * PRIME + ($customdata == null ? 43 : $customdata.hashCode());
    final Object $data = this.getData();
    result = result * PRIME + ($data == null ? 43 : $data.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    final Object $age = this.getAge();
    result = result * PRIME + ($age == null ? 43 : $age.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof User;
  }

  public String toString() {
    return "net.media.openrtb25.request.User(id="
        + this.getId()
        + ", buyeruid="
        + this.getBuyeruid()
        + ", yob="
        + this.getYob()
        + ", gender="
        + this.getGender()
        + ", geo="
        + this.getGeo()
        + ", keywords="
        + this.getKeywords()
        + ", customdata="
        + this.getCustomdata()
        + ", data="
        + this.getData()
        + ", ext="
        + this.getExt()
        + ", age="
        + this.getAge()
        + ")";
  }
}
