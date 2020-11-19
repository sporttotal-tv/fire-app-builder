
package com.amazon.dataloader.network.model.response.videolist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VideoListResponse {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ancestors")
    @Expose
    private List<String> ancestors = null;
    @SerializedName("imagesByType")
    @Expose
    private ImagesByType imagesByType;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("menu")
    @Expose
    private Menu menu;
    @SerializedName("sponsors")
    @Expose
    private Sponsors sponsors;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("ads")
    @Expose
    private Ads ads;
    @SerializedName("components")
    @Expose
    private List<Component> components = null;
    @SerializedName("general")
    @Expose
    private General general;
    @SerializedName("dictionary")
    @Expose
    private Dictionary dictionary;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAncestors() {
        return ancestors;
    }

    public void setAncestors(List<String> ancestors) {
        this.ancestors = ancestors;
    }

    public ImagesByType getImagesByType() {
        return imagesByType;
    }

    public void setImagesByType(ImagesByType imagesByType) {
        this.imagesByType = imagesByType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Sponsors getSponsors() {
        return sponsors;
    }

    public void setSponsors(Sponsors sponsors) {
        this.sponsors = sponsors;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

}
