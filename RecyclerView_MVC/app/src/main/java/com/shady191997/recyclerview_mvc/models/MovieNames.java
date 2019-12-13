package com.shady191997.recyclerview_mvc.models;

public class MovieNames {

    private String mMovieName;
    private String mMovieAuthor;
    private String mDescription;
    private int mMovieImage;

    public MovieNames(String mMovieName, int mMovieImage, int mdate) {
        this.mMovieName = mMovieName;
        this.mMovieImage = mMovieImage;
        this.mdate = mdate;
    }

    public int getmMovieImage() {
        return mMovieImage;
    }

    public void setmMovieImage(int mMovieImage) {
        this.mMovieImage = mMovieImage;
    }

    public MovieNames(String mMovieName, int mdate) {
        this.mMovieName = mMovieName;
        this.mdate = mdate;
    }

    private int mdate;

    public String getmMovieName() {
        return mMovieName;
    }

    public void setmMovieName(String mMovieName) {
        this.mMovieName = mMovieName;
    }

    public String getmMovieAuthor() {
        return mMovieAuthor;
    }

    public void setmMovieAuthor(String mMovieAuthor) {
        this.mMovieAuthor = mMovieAuthor;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getMdate() {
        return mdate;
    }

    public void setMdate(int mdate) {
        this.mdate = mdate;
    }

    public MovieNames(String mMovieName, String mMovieAuthor, String mDescription, int mdate) {
        this.mMovieName = mMovieName;
        this.mMovieAuthor = mMovieAuthor;
        this.mDescription = mDescription;
        this.mdate = mdate;
    }
}
