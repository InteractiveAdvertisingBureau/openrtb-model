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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Created by vishnu on 6/5/16. */
public class Pmp {

  private Integer private_auction;

  private Collection<Deal> deals;

  private Map<String, Object> ext;

  public Pmp() {}

  public Integer getPrivate_auction() {
    return this.private_auction;
  }

  public void setPrivate_auction(Integer private_auction) {
    this.private_auction = private_auction;
  }

  public Collection<Deal> getDeals() {
    return this.deals;
  }

  public void setDeals(Collection<Deal> deals) {
    this.deals = deals;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map ext) {
    this.ext = ext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pmp pmp = (Pmp) o;
    return Objects.equals(getPrivate_auction(), pmp.getPrivate_auction())
        && Objects.equals(getDeals(), pmp.getDeals())
        && Objects.equals(getExt(), pmp.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPrivate_auction(), getDeals(), getExt());
  }
}
