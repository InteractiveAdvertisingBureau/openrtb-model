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

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/** Created by vishnu on 6/5/16. */
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

  private Producer producer;

  private String url;

  private Integer videoquality;

  private Collection<String> cat;

  private Integer prodq;

  private Integer context;

  private String contentrating;

  private String userrating;

  private Integer qagmediarating;

  private String keywords;

  private Integer livestream;

  private Integer sourcerelationship;

  private Integer len;

  private String language;

  private Integer embeddable;

  private Collection<Data> data;

  private Map<String, Object> ext;

  public Content() {}

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

  public Producer getProducer() {
    return this.producer;
  }

  public void setProducer(Producer producer) {
    this.producer = producer;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getVideoquality() {
    return this.videoquality;
  }

  public void setVideoquality(Integer videoquality) {
    this.videoquality = videoquality;
  }

  public Collection<String> getCat() {
    return this.cat;
  }

  public void setCat(Collection<String> cat) {
    this.cat = cat;
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

  public String getContentrating() {
    return this.contentrating;
  }

  public void setContentrating(String contentrating) {
    this.contentrating = contentrating;
  }

  public String getUserrating() {
    return this.userrating;
  }

  public void setUserrating(String userrating) {
    this.userrating = userrating;
  }

  public Integer getQagmediarating() {
    return this.qagmediarating;
  }

  public void setQagmediarating(Integer qagmediarating) {
    this.qagmediarating = qagmediarating;
  }

  public String getKeywords() {
    return this.keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public Integer getLivestream() {
    return this.livestream;
  }

  public void setLivestream(Integer livestream) {
    this.livestream = livestream;
  }

  public Integer getSourcerelationship() {
    return this.sourcerelationship;
  }

  public void setSourcerelationship(Integer sourcerelationship) {
    this.sourcerelationship = sourcerelationship;
  }

  public Integer getLen() {
    return this.len;
  }

  public void setLen(Integer len) {
    this.len = len;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getEmbeddable() {
    return this.embeddable;
  }

  public void setEmbeddable(Integer embeddable) {
    this.embeddable = embeddable;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Content content = (Content) o;
    return Objects.equals(getId(), content.getId())
        && Objects.equals(getEpisode(), content.getEpisode())
        && Objects.equals(getTitle(), content.getTitle())
        && Objects.equals(getSeries(), content.getSeries())
        && Objects.equals(getSeason(), content.getSeason())
        && Objects.equals(getArtist(), content.getArtist())
        && Objects.equals(getGenre(), content.getGenre())
        && Objects.equals(getAlbum(), content.getAlbum())
        && Objects.equals(getIsrc(), content.getIsrc())
        && Objects.equals(getProducer(), content.getProducer())
        && Objects.equals(getUrl(), content.getUrl())
        && Objects.equals(getVideoquality(), content.getVideoquality())
        && Objects.equals(getCat(), content.getCat())
        && Objects.equals(getProdq(), content.getProdq())
        && Objects.equals(getContext(), content.getContext())
        && Objects.equals(getContentrating(), content.getContentrating())
        && Objects.equals(getUserrating(), content.getUserrating())
        && Objects.equals(getQagmediarating(), content.getQagmediarating())
        && Objects.equals(getKeywords(), content.getKeywords())
        && Objects.equals(getLivestream(), content.getLivestream())
        && Objects.equals(getSourcerelationship(), content.getSourcerelationship())
        && Objects.equals(getLen(), content.getLen())
        && Objects.equals(getLanguage(), content.getLanguage())
        && Objects.equals(getEmbeddable(), content.getEmbeddable())
        && Objects.equals(getData(), content.getData())
        && Objects.equals(getExt(), content.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getId(),
        getEpisode(),
        getTitle(),
        getSeries(),
        getSeason(),
        getArtist(),
        getGenre(),
        getAlbum(),
        getIsrc(),
        getProducer(),
        getUrl(),
        getVideoquality(),
        getCat(),
        getProdq(),
        getContext(),
        getContentrating(),
        getUserrating(),
        getQagmediarating(),
        getKeywords(),
        getLivestream(),
        getSourcerelationship(),
        getLen(),
        getLanguage(),
        getEmbeddable(),
        getData(),
        getExt());
  }
}
