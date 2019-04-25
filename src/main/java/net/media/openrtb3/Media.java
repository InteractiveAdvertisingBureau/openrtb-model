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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Media {

  @NotNull @Valid private Ad ad;

  public Media() {}

  public @NotNull @Valid Ad getAd() {
    return this.ad;
  }

  public void setAd(@NotNull @Valid Ad ad) {
    this.ad = ad;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Media;
  }

  @Override
  public String toString() {
    return "Media{" +
        "ad=" + ad +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Media media = (Media) o;
    return Objects.equals(getAd(), media.getAd());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAd());
  }
}
