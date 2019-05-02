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
import javax.validation.Valid;

import java.util.Objects;

/** Created by shiva.b on 10/04/19. */
public class OpenRTBWrapper3_X {

  @Valid
  private OpenRTB3_X openrtb;

  public OpenRTBWrapper3_X() {}

  public OpenRTB3_X getOpenrtb() {
    return this.openrtb;
  }

  public void setOpenrtb(OpenRTB3_X openrtb) {
    this.openrtb = openrtb;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OpenRTBWrapper3_X that = (OpenRTBWrapper3_X) o;
    return Objects.equals(getOpenrtb(), that.getOpenrtb());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getOpenrtb());
  }
}
