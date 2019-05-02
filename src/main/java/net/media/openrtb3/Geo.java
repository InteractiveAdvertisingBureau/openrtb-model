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

import java.util.Map;
import java.util.Objects;

public class Geo {

  private Integer type;
  private Float lat;
  private Float lon;
  private Integer accur;
  private Integer lastfix;
  private Integer ipserv;
  private String country;
  private String region;
  private String metro;
  private String city;
  private String zip;
  private Integer utcoffset;
  private Map<String, Object> ext;

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Float getLat() {
    return this.lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public Float getLon() {
    return this.lon;
  }

  public void setLon(Float lon) {
    this.lon = lon;
  }

  public Integer getAccur() {
    return this.accur;
  }

  public void setAccur(Integer accur) {
    this.accur = accur;
  }

  public Integer getLastfix() {
    return this.lastfix;
  }

  public void setLastfix(Integer lastfix) {
    this.lastfix = lastfix;
  }

  public Integer getIpserv() {
    return this.ipserv;
  }

  public void setIpserv(Integer ipserv) {
    this.ipserv = ipserv;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getMetro() {
    return this.metro;
  }

  public void setMetro(String metro) {
    this.metro = metro;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return this.zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Integer getUtcoffset() {
    return this.utcoffset;
  }

  public void setUtcoffset(Integer utcoffset) {
    this.utcoffset = utcoffset;
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
    Geo geo = (Geo) o;
    return Objects.equals(getType(), geo.getType())
        && Objects.equals(getLat(), geo.getLat())
        && Objects.equals(getLon(), geo.getLon())
        && Objects.equals(getAccur(), geo.getAccur())
        && Objects.equals(getLastfix(), geo.getLastfix())
        && Objects.equals(getIpserv(), geo.getIpserv())
        && Objects.equals(getCountry(), geo.getCountry())
        && Objects.equals(getRegion(), geo.getRegion())
        && Objects.equals(getMetro(), geo.getMetro())
        && Objects.equals(getCity(), geo.getCity())
        && Objects.equals(getZip(), geo.getZip())
        && Objects.equals(getUtcoffset(), geo.getUtcoffset())
        && Objects.equals(getExt(), geo.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getType(),
        getLat(),
        getLon(),
        getAccur(),
        getLastfix(),
        getIpserv(),
        getCountry(),
        getRegion(),
        getMetro(),
        getCity(),
        getZip(),
        getUtcoffset(),
        getExt());
  }
}
