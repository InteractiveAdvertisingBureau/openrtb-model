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

import javax.validation.Valid;
import java.util.Objects;

public class Context {
  private Site site;
  private App app;
  @Valid private User user;
  private Dooh dooh;
  private Device device;
  private Regs regs;
  private Restrictions restrictions;

  public Site getSite() {
    return this.site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public App getApp() {
    return this.app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  public @Valid User getUser() {
    return this.user;
  }

  public void setUser(@Valid User user) {
    this.user = user;
  }

  public Dooh getDooh() {
    return this.dooh;
  }

  public void setDooh(Dooh dooh) {
    this.dooh = dooh;
  }

  public Device getDevice() {
    return this.device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public Regs getRegs() {
    return this.regs;
  }

  public void setRegs(Regs regs) {
    this.regs = regs;
  }

  public Restrictions getRestrictions() {
    return this.restrictions;
  }

  public void setRestrictions(Restrictions restrictions) {
    this.restrictions = restrictions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Context context = (Context) o;
    return Objects.equals(getSite(), context.getSite())
        && Objects.equals(getApp(), context.getApp())
        && Objects.equals(getUser(), context.getUser())
        && Objects.equals(getDooh(), context.getDooh())
        && Objects.equals(getDevice(), context.getDevice())
        && Objects.equals(getRegs(), context.getRegs())
        && Objects.equals(getRestrictions(), context.getRestrictions());
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        getSite(), getApp(), getUser(), getDooh(), getDevice(), getRegs(), getRestrictions());
  }
}
