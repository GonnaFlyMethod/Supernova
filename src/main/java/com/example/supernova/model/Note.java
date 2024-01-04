package com.example.supernova.model;

public class Note {
    public Note(String title, String content) {
        this.id = "1";
        this.title = title;
        this.content = content;
    }

    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String title;
    private String content;
}
