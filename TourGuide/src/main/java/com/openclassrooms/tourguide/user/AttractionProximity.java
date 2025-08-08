package com.openclassrooms.tourguide.user;

import gpsUtil.location.Attraction;

public class AttractionProximity {
    private Attraction attraction;
    private double distance;

    public AttractionProximity(Attraction attraction, double distance) {
        this.attraction = attraction;
        this.distance = distance;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
