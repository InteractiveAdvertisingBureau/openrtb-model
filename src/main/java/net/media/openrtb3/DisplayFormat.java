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

import java.util.Collection;
import java.util.Map;

/** Created by shiva.b on 14/12/18. */
public class DisplayFormat {
  private Integer w;
  private Integer h;
  private Integer wratio;
  private Integer hratio;
  private Collection<Integer> expdir;
  private Map<String, Object> ext;

  public Integer getW() {
    return this.w;
  }

  public void setW(Integer w) {
    this.w = w;
  }

  public Integer getH() {
    return this.h;
  }

  public void setH(Integer h) {
    this.h = h;
  }

  public Integer getWratio() {
    return this.wratio;
  }

  public void setWratio(Integer wratio) {
    this.wratio = wratio;
  }

  public Integer getHratio() {
    return this.hratio;
  }

  public void setHratio(Integer hratio) {
    this.hratio = hratio;
  }

  public Collection<Integer> getExpdir() {
    return this.expdir;
  }

  public void setExpdir(Collection<Integer> expdir) {
    this.expdir = expdir;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
