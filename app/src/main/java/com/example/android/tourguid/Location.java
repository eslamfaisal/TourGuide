package com.example.android.tourguid;

import android.net.Uri;

import java.io.Serializable;

public class Location implements Serializable {
    private String latitude;
    private String longitude;

    public Location(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Uri getUri() {
        Uri geoLocation = Uri.parse("geo:" + latitude + "," + longitude);
        return geoLocation;
    }
}
