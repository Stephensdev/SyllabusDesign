package com.starlabs.syllabusdesign;

public class Getter_Item {

    private String id;
    private String eventtittle;
    private String details;
    private String posteddate;
    private String picture;


    //constructor


    public Getter_Item(String id, String newtittle, String details, String posteddate, String picture) {
        this.id = id;
        this.eventtittle = newtittle;
        this.details = details;
        this.posteddate = posteddate;
        this.picture = picture;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventtittle() {
        return eventtittle;
    }

    public void setEventtittle(String eventtittle) {
        this.eventtittle = eventtittle;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(String posteddate) {
        this.posteddate = posteddate;
    }
    public String getPicture() {
        return picture;
    }

    public void setpicture(String picture) {
        this.picture = picture;
    }
}
