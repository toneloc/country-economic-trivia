package com.toneloc.countrytrivia;


public class Country {
    String mName;
    String mAbbrev;
    Double mGDP;
    Integer mPop;
    Integer mGDPPerCapita;

    public Country(String name, String abbrev, Double GDP, Integer pop, Integer GDPPerCapita) {
        this.mName = name;
        this.mAbbrev = abbrev;
        this.mGDP = GDP;
        this.mPop = pop;
        this.mGDPPerCapita = GDPPerCapita;
    }

    public String getmName() {
        return mName;
    }

    public Double getmGDP() {
        return mGDP;
    }

    public String getmAbbrev() {
        return mAbbrev;
    }

    public Integer getmPop() {
        return mPop;
    }

    public Integer getmGDPPerCapita() {
        return mGDPPerCapita;
    }




}
