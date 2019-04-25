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

import javax.validation.constraints.NotNull;
import java.util.Map;

public class Macro {

  @NotNull private String key;
  private String value;
  private Map<String, Object> ext;

  public Macro() {}

  public @NotNull String getKey() {
    return this.key;
  }

  public void setKey(@NotNull String key) {
    this.key = key;
  }

  public Map<String, Object> getExt() {
    return ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Macro)) return false;

    Macro macro = (Macro) o;

    if (getKey() != null ? !getKey().equals(macro.getKey()) : macro.getKey() != null) return false;
    if (getValue() != null ? !getValue().equals(macro.getValue()) : macro.getValue() != null)
      return false;
    return getExt() != null ? getExt().equals(macro.getExt()) : macro.getExt() == null;
  }

  @Override
  public int hashCode() {
    int result = getKey() != null ? getKey().hashCode() : 0;
    result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
    result = 31 * result + (getExt() != null ? getExt().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Macro{" + "key='" + key + '\'' + ", value='" + value + '\'' + ", ext=" + ext + '}';
  }

  protected boolean canEqual(Object other) {
    return other instanceof Macro;
  }
}
