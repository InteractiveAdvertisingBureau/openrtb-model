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

/** Created by shiva.b on 10/04/19. */
public class OpenRTBWrapper3_X {

  private OpenRTB3_X openrtb;

  public OpenRTBWrapper3_X() {}

  public OpenRTB3_X getOpenrtb() {
    return this.openrtb;
  }

  public void setOpenrtb(OpenRTB3_X openrtb) {
    this.openrtb = openrtb;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof OpenRTBWrapper3_X)) return false;
    final OpenRTBWrapper3_X other = (OpenRTBWrapper3_X) o;
    if (!other.canEqual(this)) return false;
    final Object this$openrtb = this.getOpenrtb();
    final Object other$openrtb = other.getOpenrtb();
    return this$openrtb == null ? other$openrtb == null : this$openrtb.equals(other$openrtb);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $openrtb = this.getOpenrtb();
    result = result * PRIME + ($openrtb == null ? 43 : $openrtb.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof OpenRTBWrapper3_X;
  }

  public String toString() {
    return "net.media.openrtb3.OpenRTBWrapper3_X(openrtb=" + this.getOpenrtb() + ")";
  }
}
