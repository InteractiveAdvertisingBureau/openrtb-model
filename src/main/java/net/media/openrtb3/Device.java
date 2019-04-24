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

import java.util.Map;

public class Device {
  private Integer type;
  private String ua;
  private String ifa;
  private String dnt;
  private Integer lmt;
  private String make;
  private String model;
  private Integer os;
  private String osv;
  private String hwv;
  private Integer h;
  private Integer w;
  private Integer ppi;
  private Float pxratio;
  private Integer js;
  private String lang;
  private String ip;
  private String ipv6;
  private String xff;
  private Integer iptr;
  private String carrier;
  private String mccmnc;
  private String mccmncsim;
  private Integer contype;
  private Integer geofetch;
  private Geo geo;
  private Map<String, Object> ext;

  public Integer getType() {
    return this.type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getUa() {
    return this.ua;
  }

  public void setUa(String ua) {
    this.ua = ua;
  }

  public String getIfa() {
    return this.ifa;
  }

  public void setIfa(String ifa) {
    this.ifa = ifa;
  }

  public String getDnt() {
    return this.dnt;
  }

  public void setDnt(String dnt) {
    this.dnt = dnt;
  }

  public Integer getLmt() {
    return this.lmt;
  }

  public void setLmt(Integer lmt) {
    this.lmt = lmt;
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

  public Integer getOs() {
    return this.os;
  }

  public void setOs(Integer os) {
    this.os = os;
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

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
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

  public String getXff() {
    return this.xff;
  }

  public void setXff(String xff) {
    this.xff = xff;
  }

  public Integer getIptr() {
    return this.iptr;
  }

  public void setIptr(Integer iptr) {
    this.iptr = iptr;
  }

  public String getCarrier() {
    return this.carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public String getMccmnc() {
    return this.mccmnc;
  }

  public void setMccmnc(String mccmnc) {
    this.mccmnc = mccmnc;
  }

  public String getMccmncsim() {
    return this.mccmncsim;
  }

  public void setMccmncsim(String mccmncsim) {
    this.mccmncsim = mccmncsim;
  }

  public Integer getContype() {
    return this.contype;
  }

  public void setContype(Integer contype) {
    this.contype = contype;
  }

  public Integer getGeofetch() {
    return this.geofetch;
  }

  public void setGeofetch(Integer geofetch) {
    this.geofetch = geofetch;
  }

  public Geo getGeo() {
    return this.geo;
  }

  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
