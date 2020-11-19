
package com.amazon.dataloader.network.model.response.videolist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("controls")
    @Expose
    private String controls;
    @SerializedName("background")
    @Expose
    private String background;

    public String getControls() {
        return controls;
    }

    public void setControls(String controls) {
        this.controls = controls;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

}
