package com.mocha.pattern.observerpattern;

public class Test {
    public static void main(String[] args) {
        VideoSite vs = new VideoSite();
        vs.registerObserver(new VideoFans("LeiJun"));
        vs.registerObserver(new VideoFans("MaYun"));
        vs.registerObserver(new VideoFans("MaHuaTeng"));

        System.out.println(vs);

        vs.addVideos("Friends");
        vs.addVideos("House");

        System.out.println(vs);
    }
}
