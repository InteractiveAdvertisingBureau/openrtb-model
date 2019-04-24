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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Device)) return false;
    final Device other = (Device) o;
    if (!other.canEqual(this)) return false;
    final Object this$ua = this.getUa();
    final Object other$ua = other.getUa();
    if (this$ua == null ? other$ua != null : !this$ua.equals(other$ua)) return false;
    final Object this$geo = this.getGeo();
    final Object other$geo = other.getGeo();
    if (this$geo == null ? other$geo != null : !this$geo.equals(other$geo)) return false;
    final Object this$dnt = this.getDnt();
    final Object other$dnt = other.getDnt();
    if (this$dnt == null ? other$dnt != null : !this$dnt.equals(other$dnt)) return false;
    final Object this$lmt = this.getLmt();
    final Object other$lmt = other.getLmt();
    if (this$lmt == null ? other$lmt != null : !this$lmt.equals(other$lmt)) return false;
    final Object this$ip = this.getIp();
    final Object other$ip = other.getIp();
    if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
    final Object this$ipv6 = this.getIpv6();
    final Object other$ipv6 = other.getIpv6();
    if (this$ipv6 == null ? other$ipv6 != null : !this$ipv6.equals(other$ipv6)) return false;
    final Object this$os = this.getOs();
    final Object other$os = other.getOs();
    if (this$os == null ? other$os != null : !this$os.equals(other$os)) return false;
    final Object this$devicetype = this.getDevicetype();
    final Object other$devicetype = other.getDevicetype();
    if (this$devicetype == null
        ? other$devicetype != null
        : !this$devicetype.equals(other$devicetype)) return false;
    final Object this$make = this.getMake();
    final Object other$make = other.getMake();
    if (this$make == null ? other$make != null : !this$make.equals(other$make)) return false;
    final Object this$model = this.getModel();
    final Object other$model = other.getModel();
    if (this$model == null ? other$model != null : !this$model.equals(other$model)) return false;
    final Object this$osv = this.getOsv();
    final Object other$osv = other.getOsv();
    if (this$osv == null ? other$osv != null : !this$osv.equals(other$osv)) return false;
    final Object this$hwv = this.getHwv();
    final Object other$hwv = other.getHwv();
    if (this$hwv == null ? other$hwv != null : !this$hwv.equals(other$hwv)) return false;
    final Object this$h = this.getH();
    final Object other$h = other.getH();
    if (this$h == null ? other$h != null : !this$h.equals(other$h)) return false;
    final Object this$w = this.getW();
    final Object other$w = other.getW();
    if (this$w == null ? other$w != null : !this$w.equals(other$w)) return false;
    final Object this$ppi = this.getPpi();
    final Object other$ppi = other.getPpi();
    if (this$ppi == null ? other$ppi != null : !this$ppi.equals(other$ppi)) return false;
    final Object this$pxratio = this.getPxratio();
    final Object other$pxratio = other.getPxratio();
    if (this$pxratio == null ? other$pxratio != null : !this$pxratio.equals(other$pxratio))
      return false;
    final Object this$js = this.getJs();
    final Object other$js = other.getJs();
    if (this$js == null ? other$js != null : !this$js.equals(other$js)) return false;
    final Object this$geofetch = this.getGeofetch();
    final Object other$geofetch = other.getGeofetch();
    if (this$geofetch == null ? other$geofetch != null : !this$geofetch.equals(other$geofetch))
      return false;
    final Object this$mccmnc = this.getMccmnc();
    final Object other$mccmnc = other.getMccmnc();
    if (this$mccmnc == null ? other$mccmnc != null : !this$mccmnc.equals(other$mccmnc))
      return false;
    final Object this$flashver = this.getFlashver();
    final Object other$flashver = other.getFlashver();
    if (this$flashver == null ? other$flashver != null : !this$flashver.equals(other$flashver))
      return false;
    final Object this$language = this.getLanguage();
    final Object other$language = other.getLanguage();
    if (this$language == null ? other$language != null : !this$language.equals(other$language))
      return false;
    final Object this$carrier = this.getCarrier();
    final Object other$carrier = other.getCarrier();
    if (this$carrier == null ? other$carrier != null : !this$carrier.equals(other$carrier))
      return false;
    final Object this$connectiontype = this.getConnectiontype();
    final Object other$connectiontype = other.getConnectiontype();
    if (this$connectiontype == null
        ? other$connectiontype != null
        : !this$connectiontype.equals(other$connectiontype)) return false;
    final Object this$ifa = this.getIfa();
    final Object other$ifa = other.getIfa();
    if (this$ifa == null ? other$ifa != null : !this$ifa.equals(other$ifa)) return false;
    final Object this$didsha1 = this.getDidsha1();
    final Object other$didsha1 = other.getDidsha1();
    if (this$didsha1 == null ? other$didsha1 != null : !this$didsha1.equals(other$didsha1))
      return false;
    final Object this$didmd5 = this.getDidmd5();
    final Object other$didmd5 = other.getDidmd5();
    if (this$didmd5 == null ? other$didmd5 != null : !this$didmd5.equals(other$didmd5))
      return false;
    final Object this$dpidsha1 = this.getDpidsha1();
    final Object other$dpidsha1 = other.getDpidsha1();
    if (this$dpidsha1 == null ? other$dpidsha1 != null : !this$dpidsha1.equals(other$dpidsha1))
      return false;
    final Object this$dpidmd5 = this.getDpidmd5();
    final Object other$dpidmd5 = other.getDpidmd5();
    if (this$dpidmd5 == null ? other$dpidmd5 != null : !this$dpidmd5.equals(other$dpidmd5))
      return false;
    final Object this$macsha1 = this.getMacsha1();
    final Object other$macsha1 = other.getMacsha1();
    if (this$macsha1 == null ? other$macsha1 != null : !this$macsha1.equals(other$macsha1))
      return false;
    final Object this$macmd5 = this.getMacmd5();
    final Object other$macmd5 = other.getMacmd5();
    if (this$macmd5 == null ? other$macmd5 != null : !this$macmd5.equals(other$macmd5))
      return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $ua = this.getUa();
    result = result * PRIME + ($ua == null ? 43 : $ua.hashCode());
    final Object $geo = this.getGeo();
    result = result * PRIME + ($geo == null ? 43 : $geo.hashCode());
    final Object $dnt = this.getDnt();
    result = result * PRIME + ($dnt == null ? 43 : $dnt.hashCode());
    final Object $lmt = this.getLmt();
    result = result * PRIME + ($lmt == null ? 43 : $lmt.hashCode());
    final Object $ip = this.getIp();
    result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
    final Object $ipv6 = this.getIpv6();
    result = result * PRIME + ($ipv6 == null ? 43 : $ipv6.hashCode());
    final Object $os = this.getOs();
    result = result * PRIME + ($os == null ? 43 : $os.hashCode());
    final Object $devicetype = this.getDevicetype();
    result = result * PRIME + ($devicetype == null ? 43 : $devicetype.hashCode());
    final Object $make = this.getMake();
    result = result * PRIME + ($make == null ? 43 : $make.hashCode());
    final Object $model = this.getModel();
    result = result * PRIME + ($model == null ? 43 : $model.hashCode());
    final Object $osv = this.getOsv();
    result = result * PRIME + ($osv == null ? 43 : $osv.hashCode());
    final Object $hwv = this.getHwv();
    result = result * PRIME + ($hwv == null ? 43 : $hwv.hashCode());
    final Object $h = this.getH();
    result = result * PRIME + ($h == null ? 43 : $h.hashCode());
    final Object $w = this.getW();
    result = result * PRIME + ($w == null ? 43 : $w.hashCode());
    final Object $ppi = this.getPpi();
    result = result * PRIME + ($ppi == null ? 43 : $ppi.hashCode());
    final Object $pxratio = this.getPxratio();
    result = result * PRIME + ($pxratio == null ? 43 : $pxratio.hashCode());
    final Object $js = this.getJs();
    result = result * PRIME + ($js == null ? 43 : $js.hashCode());
    final Object $geofetch = this.getGeofetch();
    result = result * PRIME + ($geofetch == null ? 43 : $geofetch.hashCode());
    final Object $mccmnc = this.getMccmnc();
    result = result * PRIME + ($mccmnc == null ? 43 : $mccmnc.hashCode());
    final Object $flashver = this.getFlashver();
    result = result * PRIME + ($flashver == null ? 43 : $flashver.hashCode());
    final Object $language = this.getLanguage();
    result = result * PRIME + ($language == null ? 43 : $language.hashCode());
    final Object $carrier = this.getCarrier();
    result = result * PRIME + ($carrier == null ? 43 : $carrier.hashCode());
    final Object $connectiontype = this.getConnectiontype();
    result = result * PRIME + ($connectiontype == null ? 43 : $connectiontype.hashCode());
    final Object $ifa = this.getIfa();
    result = result * PRIME + ($ifa == null ? 43 : $ifa.hashCode());
    final Object $didsha1 = this.getDidsha1();
    result = result * PRIME + ($didsha1 == null ? 43 : $didsha1.hashCode());
    final Object $didmd5 = this.getDidmd5();
    result = result * PRIME + ($didmd5 == null ? 43 : $didmd5.hashCode());
    final Object $dpidsha1 = this.getDpidsha1();
    result = result * PRIME + ($dpidsha1 == null ? 43 : $dpidsha1.hashCode());
    final Object $dpidmd5 = this.getDpidmd5();
    result = result * PRIME + ($dpidmd5 == null ? 43 : $dpidmd5.hashCode());
    final Object $macsha1 = this.getMacsha1();
    result = result * PRIME + ($macsha1 == null ? 43 : $macsha1.hashCode());
    final Object $macmd5 = this.getMacmd5();
    result = result * PRIME + ($macmd5 == null ? 43 : $macmd5.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Device;
  }

  public String toString() {
    return "net.media.openrtb25.request.Device(ua="
        + this.getUa()
        + ", geo="
        + this.getGeo()
        + ", dnt="
        + this.getDnt()
        + ", lmt="
        + this.getLmt()
        + ", ip="
        + this.getIp()
        + ", ipv6="
        + this.getIpv6()
        + ", os="
        + this.getOs()
        + ", devicetype="
        + this.getDevicetype()
        + ", make="
        + this.getMake()
        + ", model="
        + this.getModel()
        + ", osv="
        + this.getOsv()
        + ", hwv="
        + this.getHwv()
        + ", h="
        + this.getH()
        + ", w="
        + this.getW()
        + ", ppi="
        + this.getPpi()
        + ", pxratio="
        + this.getPxratio()
        + ", js="
        + this.getJs()
        + ", geofetch="
        + this.getGeofetch()
        + ", mccmnc="
        + this.getMccmnc()
        + ", flashver="
        + this.getFlashver()
        + ", language="
        + this.getLanguage()
        + ", carrier="
        + this.getCarrier()
        + ", connectiontype="
        + this.getConnectiontype()
        + ", ifa="
        + this.getIfa()
        + ", didsha1="
        + this.getDidsha1()
        + ", didmd5="
        + this.getDidmd5()
        + ", dpidsha1="
        + this.getDpidsha1()
        + ", dpidmd5="
        + this.getDpidmd5()
        + ", macsha1="
        + this.getMacsha1()
        + ", macmd5="
        + this.getMacmd5()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
