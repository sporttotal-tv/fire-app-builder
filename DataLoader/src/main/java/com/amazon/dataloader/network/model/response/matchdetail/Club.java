
package com.amazon.dataloader.network.model.response.matchdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Club {

    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("cover")
    @Expose
    private String cover;

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
