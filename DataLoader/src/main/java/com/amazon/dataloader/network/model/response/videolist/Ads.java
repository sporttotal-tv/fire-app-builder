
package com.amazon.dataloader.network.model.response.videolist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ads {

    @SerializedName("partnerBanner")
    @Expose
    private Boolean partnerBanner;
    @SerializedName("misc")
    @Expose
    private Misc misc;
    @SerializedName("browser")
    @Expose
    private Browser browser;
    @SerializedName("video")
    @Expose
    private Video video;

    public Boolean getPartnerBanner() {
        return partnerBanner;
    }

    public void setPartnerBanner(Boolean partnerBanner) {
        this.partnerBanner = partnerBanner;
    }

    public Misc getMisc() {
        return misc;
    }

    public void setMisc(Misc misc) {
        this.misc = misc;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

}
