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

import static net.media.utils.CommonConstants.DEFAULT_CATTAX_THREEDOTX;

public class Content {

  private String id;
  private Integer episode;
  private String title;
  private String series;
  private String season;
  private String artist;
  private String genre;
  private String album;
  private String isrc;
  private String url;
  private Collection<String> cat;
  private Integer cattax = DEFAULT_CATTAX_THREEDOTX;
  private Integer prodq;
  private Integer context;
  private String rating;
  private String urating;
  private Integer mrating;
  private String keywords;
  private Integer live;
  private Integer srcrel;
  private Integer len;
  private String lang;
  private Integer embed;
  private Producer producer;
  private Collection<Data> data;
  private Map<String, Object> ext;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getEpisode() {
    return this.episode;
  }

  public void setEpisode(Integer episode) {
    this.episode = episode;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSeries() {
    return this.series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getSeason() {
    return this.season;
  }

  public void setSeason(String season) {
    this.season = season;
  }

  public String getArtist() {
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getAlbum() {
    return this.album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getIsrc() {
    return this.isrc;
  }

  public void setIsrc(String isrc) {
    this.isrc = isrc;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
  }

  public Integer getCattax() {
    return this.cattax;
  }

  public void setCattax(Integer cattax) {
    this.cattax = cattax;
  }

  public Integer getProdq() {
    return this.prodq;
  }

  public void setProdq(Integer prodq) {
    this.prodq = prodq;
  }

  public Integer getContext() {
    return this.context;
  }

  public void setContext(Integer context) {
    this.context = context;
  }

  public String getRating() {
    return this.rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public String getUrating() {
    return this.urating;
  }

  public void setUrating(String urating) {
    this.urating = urating;
  }

  public Integer getMrating() {
    return this.mrating;
  }

  public void setMrating(Integer mrating) {
    this.mrating = mrating;
  }

  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public Integer getLive() {
    return this.live;
  }

  public void setLive(Integer live) {
    this.live = live;
  }

  public Integer getSrcrel() {
    return this.srcrel;
  }

  public void setSrcrel(Integer srcrel) {
    this.srcrel = srcrel;
  }

  public Integer getLen() {
    return this.len;
  }

  public void setLen(Integer len) {
    this.len = len;
  }

  public String getLang() {
    return this.lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public Integer getEmbed() {
    return this.embed;
  }

  public void setEmbed(Integer embed) {
    this.embed = embed;
  }

  public Producer getProducer() {
    return this.producer;
  }

  public void setProducer(Producer producer) {
    this.producer = producer;
  }

  public Collection<Data> getData() {
    return this.data;
  }

  public void setData(Collection<Data> data) {
    this.data = data;
  }

  public Map<String, Object> getExt() {
    return this.ext;
  }

  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }
}
