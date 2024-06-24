package com.example.myapplication;

public class Model {
    private int image_resource;
    private String title;
    private String score;

    public Model(int image_resource,String title,String score){
        this.image_resource=image_resource;
        this.title=title;
        this.score=score;
    }


    public int getImage_resource() {
        return image_resource;
    }

    public void setImage_resource(int image_resource) {
        this.image_resource = image_resource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
