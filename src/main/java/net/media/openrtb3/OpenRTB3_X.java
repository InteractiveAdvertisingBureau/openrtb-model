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

import net.media.utils.validator.CheckExactlyOneNotNull;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@CheckExactlyOneNotNull(fieldNames = {"request", "response"})
public class OpenRTB3_X {

  private String ver = "3.0";
  private String domainSpec = "adcom";
  @NotNull private String domainVer = "1.0";
  @Valid private Request request;
  @Valid private Response response;

  public String getVer() {
    return this.ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public String getDomainSpec() {
    return this.domainSpec;
  }

  public void setDomainSpec(String domainSpec) {
    this.domainSpec = domainSpec;
  }

  public @NotNull String getDomainVer() {
    return this.domainVer;
  }

  public void setDomainVer(@NotNull String domainVer) {
    this.domainVer = domainVer;
  }

  public @Valid Request getRequest() {
    return this.request;
  }

  public void setRequest(@Valid Request request) {
    this.request = request;
  }

  public @Valid Response getResponse() {
    return this.response;
  }

  public void setResponse(@Valid Response response) {
    this.response = response;
  }
}
