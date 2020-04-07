package com.saransh.quakereport;

class Earthquake
{

    private String mMagnitude,mLocation,mDate;

    Earthquake(String mag,String name,String date)
    {
        mMagnitude = mag;
        mLocation = name;
        mDate = date;
    }

    String getMagnitude()
    {
        return mMagnitude;
    }
    String getLocation()
    {
        return mLocation;
    }

    String getDate()
{
    return mDate;
}

}
