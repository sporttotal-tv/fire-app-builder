
package com.amazon.dataloader.network.model.response.matchdetail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("default")
    @Expose
    private Default _default;
    @SerializedName("pano")
    @Expose
    private Pano pano;

    public Default getDefault() {
        return _default;
    }

    public void setDefault(Default _default) {
        this._default = _default;
    }

    public Pano getPano() {
        return pano;
    }

    public void setPano(Pano pano) {
        this.pano = pano;
    }

}
