package com.coderpig.drysister;


public class Sister {

    private String _id;
    private String createAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUrl() {
        return url;
    }

    public void setCreateAt(String createdAt) {
        this.createAt=createdAt;
    }

    public void setDesc(String desc) {
        this.desc=desc;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt=publishedAt;
    }

    public void setSource(String source) {
        this.source=source;
    }

    public void setType(String type) {
        this.type=type;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public void setUsed(boolean used) {
        this.used=used;
    }

    public void setWho(String who) {
        this.who=who;
    }

    // 一些get和set方法..
}