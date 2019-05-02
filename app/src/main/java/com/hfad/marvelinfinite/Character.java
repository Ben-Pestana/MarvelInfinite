package com.hfad.marvelinfinite;

import java.util.ArrayList;

public class Character {
    private String name;
    private int imageResource;
    private int video;
    private String universe;
    private String status;
    private String bio;
    private ArrayList<Character> suggested;

    public Character (String name, int imageResource, int video, String universe, String status, String bio, ArrayList<Character> suggested){

        this.name = name;
        this.imageResource = imageResource;
        this.video = video;
        this.universe = universe;
        this.status = status;
        this.bio = bio;
        this.suggested = suggested;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getVideo() {
        return video;
    }

    public String getUniverse() {
        return universe;
    }

    public String getStatus() {
        return status;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<Character> getSuggested() {
        return suggested;
    }
}
