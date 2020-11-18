
package com.amazon.dataloader.network.model.response.videolist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Default {

    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("cover")
    @Expose
    private String cover;

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

}
