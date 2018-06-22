package com.mocha.pattern.observerpattern;

import java.util.ArrayList;

public class VideoSite implements Subject {
    private ArrayList<Observer> userList;
    private ArrayList<String> videos;

    public VideoSite() {
        this.userList = new ArrayList<Observer>();
        this.videos = new ArrayList<String>();
    }

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o: userList){
            o.update(this);
        }
    }

    public void addVideos(String video){
        this.videos.add(video);
        notifyAllObservers();
    }

    public ArrayList<String> getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return videos.toString();
    }
}
