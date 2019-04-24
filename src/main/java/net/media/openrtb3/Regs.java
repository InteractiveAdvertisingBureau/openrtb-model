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

import java.util.Map;

public class Regs {

  private Integer coppa;
  private Integer gdpr;
  private Map<String, Object> ext;

  public Integer getCoppa() {
    return this.coppa;
  }

  public void setCoppa(Integer coppa) {
    this.coppa = coppa;
  }

  public Integer getGdpr() {
    return this.gdpr;
  }

  public void setGdpr(Integer gdpr) {
    this.gdpr = gdpr;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
