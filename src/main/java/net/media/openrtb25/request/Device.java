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

import java.util.Map;
import java.util.Objects;

public class Device {
  private String ua;

  private Geo geo;

  private Integer dnt;

  private Integer lmt;

  private String ip;

  private String ipv6;

  private String os;

  private Integer devicetype;

  private String make;

  private String model;

  private String osv;

  private String hwv;

  private Integer h;

  private Integer w;

  private Integer ppi;

  private Float pxratio;

  private Integer js;

  private Integer geofetch;

  private String mccmnc;

  private String flashver;

  private String language;

  private String carrier;

  private Integer connectiontype;

  private String ifa;

  private String didsha1;

  private String didmd5;

  private String dpidsha1;

  private String dpidmd5;

  private String macsha1;

  private String macmd5;

  private Map<String, Object> ext;

  public Device() {}

  public String getUa() {
    return this.ua;
  }

  public void setUa(String ua) {
    this.ua = ua;
  }

  public Geo getGeo() {
    return this.geo;
  }

  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  public Integer getDnt() {
    return this.dnt;
  }

  public void setDnt(Integer dnt) {
    this.dnt = dnt;
  }

  public Integer getLmt() {
    return this.lmt;
  }

  public void setLmt(Integer lmt) {
    this.lmt = lmt;
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getIpv6() {
    return this.ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

  public String getOs() {
    return this.os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public Integer getDevicetype() {
    return this.devicetype;
  }

  public void setDevicetype(Integer devicetype) {
    this.devicetype = devicetype;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getOsv() {
    return this.osv;
  }

  public void setOsv(String osv) {
    this.osv = osv;
  }

  public String getHwv() {
    return this.hwv;
  }

  public void setHwv(String hwv) {
    this.hwv = hwv;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getPpi() {
    return this.ppi;
  }

  public void setPpi(Integer ppi) {
    this.ppi = ppi;
  }

  public Float getPxratio() {
    return this.pxratio;
  }

  public void setPxratio(Float pxratio) {
    this.pxratio = pxratio;
  }

  public Integer getJs() {
    return this.js;
  }

  public void setJs(Integer js) {
    this.js = js;
  }

  public Integer getGeofetch() {
    return this.geofetch;
  }

  public void setGeofetch(Integer geofetch) {
    this.geofetch = geofetch;
  }

  public String getMccmnc() {
    return this.mccmnc;
  }

  public void setMccmnc(String mccmnc) {
    this.mccmnc = mccmnc;
  }

  public String getFlashver() {
    return this.flashver;
  }

  public void setFlashver(String flashver) {
    this.flashver = flashver;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCarrier() {
    return this.carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Integer getConnectiontype() {
    return this.connectiontype;
  }

  public void setConnectiontype(Integer connectiontype) {
    this.connectiontype = connectiontype;
  }

  public String getIfa() {
    return this.ifa;
  }

  public void setIfa(String ifa) {
    this.ifa = ifa;
  }

  public String getDidsha1() {
    return this.didsha1;
  }

  public void setDidsha1(String didsha1) {
    this.didsha1 = didsha1;
  }

  public String getDidmd5() {
    return this.didmd5;
  }

  public void setDidmd5(String didmd5) {
    this.didmd5 = didmd5;
  }

  public String getDpidsha1() {
    return this.dpidsha1;
  }

  public void setDpidsha1(String dpidsha1) {
    this.dpidsha1 = dpidsha1;
  }

  public String getDpidmd5() {
    return this.dpidmd5;
  }

  public void setDpidmd5(String dpidmd5) {
    this.dpidmd5 = dpidmd5;
  }

  public String getMacsha1() {
    return this.macsha1;
  }

  public void setMacsha1(String macsha1) {
    this.macsha1 = macsha1;
  }

  public String getMacmd5() {
    return this.macmd5;
  }

  public void setMacmd5(String macmd5) {
    this.macmd5 = macmd5;
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
    Device device = (Device) o;
    return Objects.equals(getUa(), device.getUa()) &&
      Objects.equals(getGeo(), device.getGeo()) &&
      Objects.equals(getDnt(), device.getDnt()) &&
      Objects.equals(getLmt(), device.getLmt()) &&
      Objects.equals(getIp(), device.getIp()) &&
      Objects.equals(getIpv6(), device.getIpv6()) &&
      Objects.equals(getOs(), device.getOs()) &&
      Objects.equals(getDevicetype(), device.getDevicetype()) &&
      Objects.equals(getMake(), device.getMake()) &&
      Objects.equals(getModel(), device.getModel()) &&
      Objects.equals(getOsv(), device.getOsv()) &&
      Objects.equals(getHwv(), device.getHwv()) &&
      Objects.equals(getH(), device.getH()) &&
      Objects.equals(getW(), device.getW()) &&
      Objects.equals(getPpi(), device.getPpi()) &&
      Objects.equals(getPxratio(), device.getPxratio()) &&
      Objects.equals(getJs(), device.getJs()) &&
      Objects.equals(getGeofetch(), device.getGeofetch()) &&
      Objects.equals(getMccmnc(), device.getMccmnc()) &&
      Objects.equals(getFlashver(), device.getFlashver()) &&
      Objects.equals(getLanguage(), device.getLanguage()) &&
      Objects.equals(getCarrier(), device.getCarrier()) &&
      Objects.equals(getConnectiontype(), device.getConnectiontype()) &&
      Objects.equals(getIfa(), device.getIfa()) &&
      Objects.equals(getDidsha1(), device.getDidsha1()) &&
      Objects.equals(getDidmd5(), device.getDidmd5()) &&
      Objects.equals(getDpidsha1(), device.getDpidsha1()) &&
      Objects.equals(getDpidmd5(), device.getDpidmd5()) &&
      Objects.equals(getMacsha1(), device.getMacsha1()) &&
      Objects.equals(getMacmd5(), device.getMacmd5()) &&
      Objects.equals(getExt(), device.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getUa(), getGeo(), getDnt(), getLmt(), getIp(), getIpv6(), getOs(), getDevicetype(), getMake(), getModel(), getOsv(), getHwv(), getH(), getW(), getPpi(), getPxratio(), getJs(), getGeofetch(), getMccmnc(), getFlashver(), getLanguage(), getCarrier(), getConnectiontype(), getIfa(), getDidsha1(), getDidmd5(), getDpidsha1(), getDpidmd5(), getMacsha1(), getMacmd5(), getExt());
  }
}
