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

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Request {

  private static final Integer DEFAULT_WSEAT = 1;

  @NotBlank private String id;
  private Integer test;
  private Integer tmax;
  private Integer at;
  private Collection<String> cur =
      new ArrayList<String>() {
        {
          add("USD");
        }
      };
  private Collection<String> seat;
  private Integer wseat = DEFAULT_WSEAT;
  private String cdata;
  @Valid private Source source;
  @NotEmpty @Valid private Collection<Item> item;
  @JsonProperty("package")
  private Integer pack;
  @Valid private Context context;
  private Map<String, Object> ext;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Request request = (Request) o;
    return Objects.equals(getId(), request.getId())
        && Objects.equals(getTest(), request.getTest())
        && Objects.equals(getTmax(), request.getTmax())
        && Objects.equals(getAt(), request.getAt())
        && Objects.equals(getCur(), request.getCur())
        && Objects.equals(getSeat(), request.getSeat())
        && Objects.equals(getWseat(), request.getWseat())
        && Objects.equals(getCdata(), request.getCdata())
        && Objects.equals(getSource(), request.getSource())
        && Objects.equals(getItem(), request.getItem())
        && Objects.equals(getPack(), request.getPack())
        && Objects.equals(getContext(), request.getContext())
        && Objects.equals(getExt(), request.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getTest(),
        getTmax(),
        getAt(),
        getCur(),
        getSeat(),
        getWseat(),
        getCdata(),
        getSource(),
        getItem(),
        getPack(),
        getContext(),
        getExt());
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getTest() {
    return this.test;
  }

  public void setTest(Integer test) {
    this.test = test;
  }

  public Integer getTmax() {
    return this.tmax;
  }

  public void setTmax(Integer tmax) {
    this.tmax = tmax;
  }

  public Integer getAt() {
    return this.at;
  }

  public void setAt(Integer at) {
    this.at = at;
  }

  public Collection<String> getCur() {
    return this.cur;
  }

  public void setCur(Collection<String> cur) {
    this.cur = cur;
  }

  public Collection<String> getSeat() {
    return this.seat;
  }

  public void setSeat(Collection<String> seat) {
    this.seat = seat;
  }

  public Integer getWseat() {
    return this.wseat;
  }

  public void setWseat(Integer wseat) {
    this.wseat = wseat;
  }

  public String getCdata() {
    return this.cdata;
  }

  public void setCdata(String cdata) {
    this.cdata = cdata;
  }

  public Source getSource() {
    return this.source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Collection<Item> getItem() {
    return this.item;
  }

  public void setItem(Collection<Item> item) {
    this.item = item;
  }

  public Integer getPack() {
    return this.pack;
  }

  public void setPack(Integer pack) {
    this.pack = pack;
  }

  public Context getContext() {
    return this.context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
