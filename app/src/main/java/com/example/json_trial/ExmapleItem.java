package com.example.json_trial;

public class ExmapleItem {
    private String imageUrl;
    private String mCreator;
    private int mLikes;

    public ExmapleItem(String imageUrl, String creator, int likes) {
        this.imageUrl = imageUrl;
        this.mCreator = creator;
        this.mLikes = likes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public void setmCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    public int getmLikes() {
        return mLikes;
    }

    public void setmLikes(int mLikes) {
        this.mLikes = mLikes;
    }
}
