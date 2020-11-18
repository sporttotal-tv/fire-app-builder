
package com.amazon.dataloader.network.model.response.videolist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Theme {

    @SerializedName("colors")
    @Expose
    private Colors colors;

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

}
