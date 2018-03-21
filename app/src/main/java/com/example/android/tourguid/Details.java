package com.example.android.tourguid;

import java.io.Serializable;

public class Details implements Serializable {

    private String name;
    private String description;
    private int image;
    private Location location;

    public Details(String Mname, String Mdescription, int Mimage , Location Mlocation) {
        this.name = Mname;
        this.description = Mdescription;
        this.image = Mimage;
        this.location = Mlocation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
    public Location getLocation() {
        return location;
    }
}
