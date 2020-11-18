
package com.amazon.dataloader.network.model.response.matchdetail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sponsors {

    @SerializedName("sponsors")
    @Expose
    private List<Object> sponsors = null;
    @SerializedName("main")
    @Expose
    private Main main;

    public List<Object> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Object> sponsors) {
        this.sponsors = sponsors;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

}
