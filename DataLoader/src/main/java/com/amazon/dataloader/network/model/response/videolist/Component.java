
package com.amazon.dataloader.network.model.response.videolist;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Component {

    @SerializedName("component")
    @Expose
    private String component;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;
    @SerializedName("title")
    @Expose
    private String title;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
