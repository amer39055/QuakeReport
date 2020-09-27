package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader <List<EarthQuake>> {
    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl=url;

    }
    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"Test: onStartLoading()...");
        forceLoad();
    }

    @Override
    public List<EarthQuake> loadInBackground() {
        Log.i(LOG_TAG, "Test LoadInBackground()....");
        if (mUrl==null){
        return null;}
        List<EarthQuake> earthquake= QueryUtils.fetchEarthquakeData(mUrl);
        return earthquake;
    }
}
