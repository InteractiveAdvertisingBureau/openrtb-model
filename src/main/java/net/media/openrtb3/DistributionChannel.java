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

import javax.validation.constraints.NotNull;
import java.util.Objects;

public abstract class DistributionChannel {
  @NotNull private String id;
  private String name;
  private Publisher pub;
  private Content content;

  public @NotNull String getId() {
    return this.id;
  }

  public void setId(@NotNull String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Publisher getPub() {
    return this.pub;
  }

  public void setPub(Publisher pub) {
    this.pub = pub;
  }

  public Content getContent() {
    return this.content;
  }

  public void setContent(Content content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DistributionChannel that = (DistributionChannel) o;
    return Objects.equals(getId(), that.getId())
        && Objects.equals(getName(), that.getName())
        && Objects.equals(getPub(), that.getPub())
        && Objects.equals(getContent(), that.getContent());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName(), getPub(), getContent());
  }
}
