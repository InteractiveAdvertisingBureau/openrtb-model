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

import com.fasterxml.jackson.annotation.JsonProperty;

public class NativeRequest {

  @JsonProperty("native")
  private NativeRequestBody nativeRequestBody;

  public NativeRequest() {}

  public NativeRequestBody getNativeRequestBody() {
    return this.nativeRequestBody;
  }

  public void setNativeRequestBody(NativeRequestBody nativeRequestBody) {
    this.nativeRequestBody = nativeRequestBody;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof NativeRequest)) return false;
    final NativeRequest other = (NativeRequest) o;
    if (!other.canEqual(this)) return false;
    final Object this$nativeRequestBody = this.getNativeRequestBody();
    final Object other$nativeRequestBody = other.getNativeRequestBody();
    return this$nativeRequestBody == null
        ? other$nativeRequestBody == null
        : this$nativeRequestBody.equals(other$nativeRequestBody);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $nativeRequestBody = this.getNativeRequestBody();
    result = result * PRIME + ($nativeRequestBody == null ? 43 : $nativeRequestBody.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof NativeRequest;
  }

  public String toString() {
    return "net.media.openrtb25.request.NativeRequest(nativeRequestBody="
        + this.getNativeRequestBody()
        + ")";
  }
}
