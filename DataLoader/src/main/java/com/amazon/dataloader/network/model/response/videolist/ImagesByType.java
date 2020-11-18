
package com.amazon.dataloader.network.model.response.videolist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImagesByType {

    @SerializedName("default")
    @Expose
    private Default _default;

    public Default getDefault() {
        return _default;
    }

    public void setDefault(Default _default) {
        this._default = _default;
    }

}
