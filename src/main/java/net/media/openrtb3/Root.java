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

import java.util.Objects;

/** Created by rajat.go on 14/12/18. */
public class Root {

  private OpenRTB3_X openrtb;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Root root = (Root) o;
    return Objects.equals(openrtb, root.openrtb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openrtb);
  }

  @Override
  public String toString() {
    return "Root{" +
        "openrtb=" + openrtb +
        '}';
  }
}
