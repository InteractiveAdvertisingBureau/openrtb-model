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

import net.media.utils.JacksonObjectMapper;

import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/** Created by vishnu on 6/5/16. */
public class Native {

  public static final String DEFAULT_NATIVE_VERSION = "1.1";

  @NotNull private Object request;

  private String ver = DEFAULT_NATIVE_VERSION;

  private Collection<Integer> api;

  private Collection<Integer> battr;

  private Map<String, Object> ext;

  private transient NativeRequestBody nativeRequestBody;

  private transient String requestAsString;

  public Native() {}

  public NativeRequestBody getNativeRequestBody() {
    if (nonNull(nativeRequestBody)) {
      return nativeRequestBody;
    }
    if (isNull(request)) {
      return null;
    }
    NativeRequestBody nativeRequestBody;
    if (request instanceof String) {
      String nativeRequestString = (String) request;
      requestAsString = nativeRequestString;
      try {
        nativeRequestBody =
            JacksonObjectMapper.getMapper().readValue(nativeRequestString, NativeRequestBody.class);
      } catch (IOException e) {
        return null;
      }
    } else {
      NativeRequest nativeRequest =
          JacksonObjectMapper.getMapper().convertValue(request, NativeRequest.class);
      nativeRequestBody =
          JacksonObjectMapper.getMapper()
              .convertValue(nativeRequest.getNativeRequestBody(), NativeRequestBody.class);
    }
    return nativeRequestBody;
  }

  public void setNativeRequestBody(NativeRequestBody nativeRequestBody) {
    this.nativeRequestBody = nativeRequestBody;
  }

  public String getRequestAsString() {
    if (nonNull(request) && (request instanceof String)) {
      requestAsString = (String) request;
    }
    return requestAsString;
  }

  public void setRequestAsString(String requestAsString) {
    this.requestAsString = requestAsString;
  }

  public @NotNull Object getRequest() {
    return this.request;
  }

  public void setRequest(@NotNull Object request) {
    this.request = request;
  }

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public Collection<Integer> getApi() {
    return this.api;
  }

  public void setApi(Collection<Integer> api) {
    this.api = api;
  }

  public Collection<Integer> getBattr() {
    return this.battr;
  }

  public void setBattr(Collection<Integer> battr) {
    this.battr = battr;
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
    Native aNative = (Native) o;
    return Objects.equals(getRequest(), aNative.getRequest())
        && Objects.equals(getVer(), aNative.getVer())
        && Objects.equals(getApi(), aNative.getApi())
        && Objects.equals(getBattr(), aNative.getBattr())
        && Objects.equals(getExt(), aNative.getExt())
        && Objects.equals(getNativeRequestBody(), aNative.getNativeRequestBody())
        && Objects.equals(getRequestAsString(), aNative.getRequestAsString());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getRequest(),
        getVer(),
        getApi(),
        getBattr(),
        getExt(),
        getNativeRequestBody(),
        getRequestAsString());
  }
}
