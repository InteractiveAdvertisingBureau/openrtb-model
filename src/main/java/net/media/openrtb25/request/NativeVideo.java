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

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class NativeVideo {

  @NotEmpty private Collection<String> mimes;

  @NotNull private Integer minduration;

  @NotNull private Integer maxduration;

  @NotEmpty private Collection<Integer> protocols;

  private Map<String, Object> ext;

  public NativeVideo() {}

  public @NotEmpty Collection<String> getMimes() {
    return this.mimes;
  }

  public void setMimes(@NotEmpty Collection<String> mimes) {
    this.mimes = mimes;
  }

  public @NotNull Integer getMinduration() {
    return this.minduration;
  }

  public void setMinduration(@NotNull Integer minduration) {
    this.minduration = minduration;
  }

  public @NotNull Integer getMaxduration() {
    return this.maxduration;
  }

  public void setMaxduration(@NotNull Integer maxduration) {
    this.maxduration = maxduration;
  }

  public @NotEmpty Collection<Integer> getProtocols() {
    return this.protocols;
  }

  public void setProtocols(@NotEmpty Collection<Integer> protocols) {
    this.protocols = protocols;
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
    NativeVideo that = (NativeVideo) o;
    return Objects.equals(getMimes(), that.getMimes())
        && Objects.equals(getMinduration(), that.getMinduration())
        && Objects.equals(getMaxduration(), that.getMaxduration())
        && Objects.equals(getProtocols(), that.getProtocols())
        && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getMimes(), getMinduration(), getMaxduration(), getProtocols(), getExt());
  }
}
