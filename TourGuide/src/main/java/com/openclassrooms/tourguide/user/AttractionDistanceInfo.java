package com.openclassrooms.tourguide.user;

import gpsUtil.location.Location;
import rewardCentral.RewardCentral;

public class AttractionDistanceInfo {
    private String attractionName;
    private Location attractionLocation;
    private Location userLocation;
    private Double distanceWithAttraction;
    private int rewardCentral;

    public AttractionDistanceInfo(String attractionName, Location attractionLocation, Location userLocation, Double distanceWithAttraction, int rewardCentral) {
        this.attractionName = attractionName;
        this.attractionLocation = attractionLocation;
        this.userLocation = userLocation;
        this.distanceWithAttraction = distanceWithAttraction;
        this.rewardCentral = rewardCentral;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public Location getAttractionLocation() {
        return attractionLocation;
    }

    public void setAttractionLocation(Location attractionLocation) {
        this.attractionLocation = attractionLocation;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }

    public Double getDistanceWithAttraction() {
        return distanceWithAttraction;
    }

    public void setDistanceWithAttraction(Double distanceWithAttraction) {
        this.distanceWithAttraction = distanceWithAttraction;
    }

    public int getRewardCentral() {
        return rewardCentral;
    }

    public void setRewardCentral(int rewardCentral) {
        this.rewardCentral = rewardCentral;
    }
}
