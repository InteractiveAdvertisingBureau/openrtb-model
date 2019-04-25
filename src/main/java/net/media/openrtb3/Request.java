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

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Request {

  private static final Integer DEFAULT_WSEAT = 1;

  @NotEmpty private String id;
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
  @NotNull @Valid private Source source;
  @NotNull @Valid private Collection<Item> item;

  @JsonProperty("package")
  private Integer pack;

  @NotNull @Valid private Context context;
  private Map<String, Object> ext;

  public @NotEmpty String getId() {
    return this.id;
  }

  public void setId(@NotEmpty String id) {
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

  public @NotNull @Valid Source getSource() {
    return this.source;
  }

  public void setSource(@NotNull @Valid Source source) {
    this.source = source;
  }

  public @NotNull @Valid Collection<Item> getItem() {
    return this.item;
  }

  public void setItem(@NotNull @Valid Collection<Item> item) {
    this.item = item;
  }

  public Integer getPack() {
    return this.pack;
  }

  public void setPack(Integer pack) {
    this.pack = pack;
  }

  public @NotNull @Valid Context getContext() {
    return this.context;
  }

  public void setContext(@NotNull @Valid Context context) {
    this.context = context;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
