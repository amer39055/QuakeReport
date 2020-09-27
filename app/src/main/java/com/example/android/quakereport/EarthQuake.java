package com.example.android.quakereport;

public class EarthQuake {

    private double mMagnitude;
    private  String mLocation;
    private long mDate;
    private String mUrl;

    //TODO Constructor
    public EarthQuake(double mag, String location, long date, String url){
        mMagnitude = mag;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }



}
