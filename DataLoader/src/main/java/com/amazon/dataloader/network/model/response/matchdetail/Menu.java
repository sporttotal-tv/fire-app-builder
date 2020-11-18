
package com.amazon.dataloader.network.model.response.matchdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Menu {

    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;
    @SerializedName("links")
    @Expose
    private List<Object> links = null;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public List<Object> getLinks() {
        return links;
    }

    public void setLinks(List<Object> links) {
        this.links = links;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
