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

  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Content)) return false;
    final Content other = (Content) o;
    if (!other.canEqual(this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$episode = this.getEpisode();
    final Object other$episode = other.getEpisode();
    if (this$episode == null ? other$episode != null : !this$episode.equals(other$episode))
      return false;
    final Object this$title = this.getTitle();
    final Object other$title = other.getTitle();
    if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
    final Object this$series = this.getSeries();
    final Object other$series = other.getSeries();
    if (this$series == null ? other$series != null : !this$series.equals(other$series))
      return false;
    final Object this$season = this.getSeason();
    final Object other$season = other.getSeason();
    if (this$season == null ? other$season != null : !this$season.equals(other$season))
      return false;
    final Object this$artist = this.getArtist();
    final Object other$artist = other.getArtist();
    if (this$artist == null ? other$artist != null : !this$artist.equals(other$artist))
      return false;
    final Object this$genre = this.getGenre();
    final Object other$genre = other.getGenre();
    if (this$genre == null ? other$genre != null : !this$genre.equals(other$genre)) return false;
    final Object this$album = this.getAlbum();
    final Object other$album = other.getAlbum();
    if (this$album == null ? other$album != null : !this$album.equals(other$album)) return false;
    final Object this$isrc = this.getIsrc();
    final Object other$isrc = other.getIsrc();
    if (this$isrc == null ? other$isrc != null : !this$isrc.equals(other$isrc)) return false;
    final Object this$producer = this.getProducer();
    final Object other$producer = other.getProducer();
    if (this$producer == null ? other$producer != null : !this$producer.equals(other$producer))
      return false;
    final Object this$url = this.getUrl();
    final Object other$url = other.getUrl();
    if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
    final Object this$videoquality = this.getVideoquality();
    final Object other$videoquality = other.getVideoquality();
    if (this$videoquality == null
        ? other$videoquality != null
        : !this$videoquality.equals(other$videoquality)) return false;
    final Object this$cat = this.getCat();
    final Object other$cat = other.getCat();
    if (this$cat == null ? other$cat != null : !this$cat.equals(other$cat)) return false;
    final Object this$prodq = this.getProdq();
    final Object other$prodq = other.getProdq();
    if (this$prodq == null ? other$prodq != null : !this$prodq.equals(other$prodq)) return false;
    final Object this$context = this.getContext();
    final Object other$context = other.getContext();
    if (this$context == null ? other$context != null : !this$context.equals(other$context))
      return false;
    final Object this$contentrating = this.getContentrating();
    final Object other$contentrating = other.getContentrating();
    if (this$contentrating == null
        ? other$contentrating != null
        : !this$contentrating.equals(other$contentrating)) return false;
    final Object this$userrating = this.getUserrating();
    final Object other$userrating = other.getUserrating();
    if (this$userrating == null
        ? other$userrating != null
        : !this$userrating.equals(other$userrating)) return false;
    final Object this$qagmediarating = this.getQagmediarating();
    final Object other$qagmediarating = other.getQagmediarating();
    if (this$qagmediarating == null
        ? other$qagmediarating != null
        : !this$qagmediarating.equals(other$qagmediarating)) return false;
    final Object this$keywords = this.getKeywords();
    final Object other$keywords = other.getKeywords();
    if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords))
      return false;
    final Object this$livestream = this.getLivestream();
    final Object other$livestream = other.getLivestream();
    if (this$livestream == null
        ? other$livestream != null
        : !this$livestream.equals(other$livestream)) return false;
    final Object this$sourcerelationship = this.getSourcerelationship();
    final Object other$sourcerelationship = other.getSourcerelationship();
    if (this$sourcerelationship == null
        ? other$sourcerelationship != null
        : !this$sourcerelationship.equals(other$sourcerelationship)) return false;
    final Object this$len = this.getLen();
    final Object other$len = other.getLen();
    if (this$len == null ? other$len != null : !this$len.equals(other$len)) return false;
    final Object this$language = this.getLanguage();
    final Object other$language = other.getLanguage();
    if (this$language == null ? other$language != null : !this$language.equals(other$language))
      return false;
    final Object this$embeddable = this.getEmbeddable();
    final Object other$embeddable = other.getEmbeddable();
    if (this$embeddable == null
        ? other$embeddable != null
        : !this$embeddable.equals(other$embeddable)) return false;
    final Object this$data = this.getData();
    final Object other$data = other.getData();
    if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
    final Object this$ext = this.getExt();
    final Object other$ext = other.getExt();
    return this$ext == null ? other$ext == null : this$ext.equals(other$ext);
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $episode = this.getEpisode();
    result = result * PRIME + ($episode == null ? 43 : $episode.hashCode());
    final Object $title = this.getTitle();
    result = result * PRIME + ($title == null ? 43 : $title.hashCode());
    final Object $series = this.getSeries();
    result = result * PRIME + ($series == null ? 43 : $series.hashCode());
    final Object $season = this.getSeason();
    result = result * PRIME + ($season == null ? 43 : $season.hashCode());
    final Object $artist = this.getArtist();
    result = result * PRIME + ($artist == null ? 43 : $artist.hashCode());
    final Object $genre = this.getGenre();
    result = result * PRIME + ($genre == null ? 43 : $genre.hashCode());
    final Object $album = this.getAlbum();
    result = result * PRIME + ($album == null ? 43 : $album.hashCode());
    final Object $isrc = this.getIsrc();
    result = result * PRIME + ($isrc == null ? 43 : $isrc.hashCode());
    final Object $producer = this.getProducer();
    result = result * PRIME + ($producer == null ? 43 : $producer.hashCode());
    final Object $url = this.getUrl();
    result = result * PRIME + ($url == null ? 43 : $url.hashCode());
    final Object $videoquality = this.getVideoquality();
    result = result * PRIME + ($videoquality == null ? 43 : $videoquality.hashCode());
    final Object $cat = this.getCat();
    result = result * PRIME + ($cat == null ? 43 : $cat.hashCode());
    final Object $prodq = this.getProdq();
    result = result * PRIME + ($prodq == null ? 43 : $prodq.hashCode());
    final Object $context = this.getContext();
    result = result * PRIME + ($context == null ? 43 : $context.hashCode());
    final Object $contentrating = this.getContentrating();
    result = result * PRIME + ($contentrating == null ? 43 : $contentrating.hashCode());
    final Object $userrating = this.getUserrating();
    result = result * PRIME + ($userrating == null ? 43 : $userrating.hashCode());
    final Object $qagmediarating = this.getQagmediarating();
    result = result * PRIME + ($qagmediarating == null ? 43 : $qagmediarating.hashCode());
    final Object $keywords = this.getKeywords();
    result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
    final Object $livestream = this.getLivestream();
    result = result * PRIME + ($livestream == null ? 43 : $livestream.hashCode());
    final Object $sourcerelationship = this.getSourcerelationship();
    result = result * PRIME + ($sourcerelationship == null ? 43 : $sourcerelationship.hashCode());
    final Object $len = this.getLen();
    result = result * PRIME + ($len == null ? 43 : $len.hashCode());
    final Object $language = this.getLanguage();
    result = result * PRIME + ($language == null ? 43 : $language.hashCode());
    final Object $embeddable = this.getEmbeddable();
    result = result * PRIME + ($embeddable == null ? 43 : $embeddable.hashCode());
    final Object $data = this.getData();
    result = result * PRIME + ($data == null ? 43 : $data.hashCode());
    final Object $ext = this.getExt();
    result = result * PRIME + ($ext == null ? 43 : $ext.hashCode());
    return result;
  }

  protected boolean canEqual(Object other) {
    return other instanceof Content;
  }

  public String toString() {
    return "net.media.openrtb25.request.Content(id="
        + this.getId()
        + ", episode="
        + this.getEpisode()
        + ", title="
        + this.getTitle()
        + ", series="
        + this.getSeries()
        + ", season="
        + this.getSeason()
        + ", artist="
        + this.getArtist()
        + ", genre="
        + this.getGenre()
        + ", album="
        + this.getAlbum()
        + ", isrc="
        + this.getIsrc()
        + ", producer="
        + this.getProducer()
        + ", url="
        + this.getUrl()
        + ", videoquality="
        + this.getVideoquality()
        + ", cat="
        + this.getCat()
        + ", prodq="
        + this.getProdq()
        + ", context="
        + this.getContext()
        + ", contentrating="
        + this.getContentrating()
        + ", userrating="
        + this.getUserrating()
        + ", qagmediarating="
        + this.getQagmediarating()
        + ", keywords="
        + this.getKeywords()
        + ", livestream="
        + this.getLivestream()
        + ", sourcerelationship="
        + this.getSourcerelationship()
        + ", len="
        + this.getLen()
        + ", language="
        + this.getLanguage()
        + ", embeddable="
        + this.getEmbeddable()
        + ", data="
        + this.getData()
        + ", ext="
        + this.getExt()
        + ")";
  }
}
