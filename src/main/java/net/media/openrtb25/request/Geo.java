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

import java.util.Map;
import java.util.Objects;

public class Geo {
  private Integer type;
  private String region;
  private String regionfips104;
  private String metro;
  private String city;
  private String zip;
  private Integer utcoffset;
  private String country;
  private Float lat;
  private Float lon;
  private Integer accuracy;
  private Integer lastfix;
  private Integer ipservice;
  private Map<String, Object> ext;

  public Geo() {}

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getRegion() {
    return this.region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getRegionfips104() {
    return this.regionfips104;
  }

  public void setRegionfips104(String regionfips104) {
    this.regionfips104 = regionfips104;
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

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
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

  public Integer getAccuracy() {
    return this.accuracy;
  }

  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  public Integer getLastfix() {
    return this.lastfix;
  }

  public void setLastfix(Integer lastfix) {
    this.lastfix = lastfix;
  }

  public Integer getIpservice() {
    return this.ipservice;
  }

  public void setIpservice(Integer ipservice) {
    this.ipservice = ipservice;
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
        && Objects.equals(getRegion(), geo.getRegion())
        && Objects.equals(getRegionfips104(), geo.getRegionfips104())
        && Objects.equals(getMetro(), geo.getMetro())
        && Objects.equals(getCity(), geo.getCity())
        && Objects.equals(getZip(), geo.getZip())
        && Objects.equals(getUtcoffset(), geo.getUtcoffset())
        && Objects.equals(getCountry(), geo.getCountry())
        && Objects.equals(getLat(), geo.getLat())
        && Objects.equals(getLon(), geo.getLon())
        && Objects.equals(getAccuracy(), geo.getAccuracy())
        && Objects.equals(getLastfix(), geo.getLastfix())
        && Objects.equals(getIpservice(), geo.getIpservice())
        && Objects.equals(getExt(), geo.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getType(),
        getRegion(),
        getRegionfips104(),
        getMetro(),
        getCity(),
        getZip(),
        getUtcoffset(),
        getCountry(),
        getLat(),
        getLon(),
        getAccuracy(),
        getLastfix(),
        getIpservice(),
        getExt());
  }
}
