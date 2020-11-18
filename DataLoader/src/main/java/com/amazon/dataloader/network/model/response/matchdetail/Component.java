
package com.amazon.dataloader.network.model.response.matchdetail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Component {

    @SerializedName("allowGeo")
    @Expose
    private List<Object> allowGeo = null;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("date")
    @Expose
    private Long date;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("video")
    @Expose
    private Video video;
    @SerializedName("component")
    @Expose
    private String component;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("end")
    @Expose
    private Long end;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("sponsors")
    @Expose
    private List<Object> sponsors = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("children")
    @Expose
    private List<Child> children = null;

    public List<Object> getAllowGeo() {
        return allowGeo;
    }

    public void setAllowGeo(List<Object> allowGeo) {
        this.allowGeo = allowGeo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Object> sponsors) {
        this.sponsors = sponsors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

}
