package com.saransh.quakereport;

class Earthquake
{

    private String mLocation;
    private long mTimeInMilliseconds ;
    private  double mMagnitude;
    private String mUrl;

    Earthquake(double mag, String name, long timeInMilliseconds, String url)
    {
        mMagnitude = mag;
        mLocation = name;
        mTimeInMilliseconds  = timeInMilliseconds;
        mUrl = url;

    }

    double getMagnitude()
    {
        return mMagnitude;
    }
    String getLocation()
    {
        return mLocation;
    }
    long getTimeInMilliseconds()
{
    return mTimeInMilliseconds ;
}
    String getUrl(){ return  mUrl;
    }

}
