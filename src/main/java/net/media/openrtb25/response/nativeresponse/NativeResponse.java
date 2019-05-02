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

package net.media.openrtb25.response.nativeresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class NativeResponse {

  @JsonProperty("native")
  private NativeResponseBody nativeResponseBody;

  public NativeResponse() {}

  public NativeResponseBody getNativeResponseBody() {
    return this.nativeResponseBody;
  }

  public void setNativeResponseBody(NativeResponseBody nativeResponseBody) {
    this.nativeResponseBody = nativeResponseBody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NativeResponse that = (NativeResponse) o;
    return Objects.equals(getNativeResponseBody(), that.getNativeResponseBody());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNativeResponseBody());
  }
}
