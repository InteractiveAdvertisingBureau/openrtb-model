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
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class Item {

  private static final Integer DEFAULT_QUANTITY = 1;
  private static final Integer DEFAULT_DELIVERY_METHOD = 0;

  @NotBlank private String id;
  private Integer qty = DEFAULT_QUANTITY;
  private Integer seq;
  private double flr;
  private String flrcur;
  private Integer exp;
  private Integer dt;
  private Integer dlvy = DEFAULT_DELIVERY_METHOD;
  @Valid private Collection<Metric> metric;
  @Valid private Collection<Deal> deal;

  @JsonProperty("private")
  private Integer priv;

  @NotNull @Valid private Spec spec;
  private Map<String, Object> ext;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getQty() {
    return this.qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public Integer getSeq() {
    return this.seq;
  }

  public void setSeq(Integer seq) {
    this.seq = seq;
  }

  public double getFlr() {
    return this.flr;
  }

  public void setFlr(double flr) {
    this.flr = flr;
  }

  public String getFlrcur() {
    return this.flrcur;
  }

  public void setFlrcur(String flrcur) {
    this.flrcur = flrcur;
  }

  public Integer getExp() {
    return this.exp;
  }

  public void setExp(Integer exp) {
    this.exp = exp;
  }

  public Integer getDt() {
    return this.dt;
  }

  public void setDt(Integer dt) {
    this.dt = dt;
  }

  public Integer getDlvy() {
    return this.dlvy;
  }

  public void setDlvy(Integer dlvy) {
    this.dlvy = dlvy;
  }

  public Collection<Metric> getMetric() {
    return this.metric;
  }

  public void setMetric(Collection<Metric> metric) {
    this.metric = metric;
  }

  public Collection<Deal> getDeal() {
    return this.deal;
  }

  public void setDeal(Collection<Deal> deal) {
    this.deal = deal;
  }

  public Integer getPriv() {
    return this.priv;
  }

  public void setPriv(Integer priv) {
    this.priv = priv;
  }

  public @NotNull Spec getSpec() {
    return this.spec;
  }

  public void setSpec(@NotNull Spec spec) {
    this.spec = spec;
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
    Item item = (Item) o;
    return Double.compare(item.getFlr(), getFlr()) == 0
        && Objects.equals(getId(), item.getId())
        && Objects.equals(getQty(), item.getQty())
        && Objects.equals(getSeq(), item.getSeq())
        && Objects.equals(getFlrcur(), item.getFlrcur())
        && Objects.equals(getExp(), item.getExp())
        && Objects.equals(getDt(), item.getDt())
        && Objects.equals(getDlvy(), item.getDlvy())
        && Objects.equals(getMetric(), item.getMetric())
        && Objects.equals(getDeal(), item.getDeal())
        && Objects.equals(getPriv(), item.getPriv())
        && Objects.equals(getSpec(), item.getSpec())
        && Objects.equals(getExt(), item.getExt());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getId(),
        getQty(),
        getSeq(),
        getFlr(),
        getFlrcur(),
        getExp(),
        getDt(),
        getDlvy(),
        getMetric(),
        getDeal(),
        getPriv(),
        getSpec(),
        getExt());
  }
}
