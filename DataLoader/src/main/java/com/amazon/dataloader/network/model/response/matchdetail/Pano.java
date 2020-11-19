
package com.amazon.dataloader.network.model.response.matchdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pano {

    @SerializedName("hls")
    @Expose
    private String hls;
    @SerializedName("mp4")
    @Expose
    private String mp4;

    public String getHls() {
        return hls;
    }

    public void setHls(String hls) {
        this.hls = hls;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

}
