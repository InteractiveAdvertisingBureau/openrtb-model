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

package net.media.openrtb25.response.nativeresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeResponse)) return false;
    final NativeResponse other = (NativeResponse) o;
    if (!other.canEqual(this)) return false;
    final Object this$nativeResponseBody = this.getNativeResponseBody();
    final Object other$nativeResponseBody = other.getNativeResponseBody();
    return this$nativeResponseBody == null
        ? other$nativeResponseBody == null
        : this$nativeResponseBody.equals(other$nativeResponseBody);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $nativeResponseBody = this.getNativeResponseBody();
    result = result * PRIME + ($nativeResponseBody == null ? 43 : $nativeResponseBody.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeResponse;
  }

  public String toString() {
    return "net.media.openrtb25.response.nativeresponse.NativeResponse(nativeResponseBody="
        + this.getNativeResponseBody()
        + ")";
  }
}
