
package com.amazon.dataloader.network.model.response.matchdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Colors {

    @SerializedName("backgroundPastel")
    @Expose
    private String backgroundPastel;
    @SerializedName("highlightAlt")
    @Expose
    private String highlightAlt;
    @SerializedName("highlight")
    @Expose
    private String highlight;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("player")
    @Expose
    private Player player;
    @SerializedName("menu")
    @Expose
    private Menu menu;
    @SerializedName("background")
    @Expose
    private String background;
    @SerializedName("textPastel")
    @Expose
    private String textPastel;
    @SerializedName("highlightPastel")
    @Expose
    private String highlightPastel;

    public String getBackgroundPastel() {
        return backgroundPastel;
    }

    public void setBackgroundPastel(String backgroundPastel) {
        this.backgroundPastel = backgroundPastel;
    }

    public String getHighlightAlt() {
        return highlightAlt;
    }

    public void setHighlightAlt(String highlightAlt) {
        this.highlightAlt = highlightAlt;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getTextPastel() {
        return textPastel;
    }

    public void setTextPastel(String textPastel) {
        this.textPastel = textPastel;
    }

    public String getHighlightPastel() {
        return highlightPastel;
    }

    public void setHighlightPastel(String highlightPastel) {
        this.highlightPastel = highlightPastel;
    }

}
