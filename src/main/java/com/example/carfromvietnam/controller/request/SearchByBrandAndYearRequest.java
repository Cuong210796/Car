package com.example.carfromvietnam.controller.request;

public class SearchByBrandAndYearRequest {

    private Long brandid;
    private int year;

    public SearchByBrandAndYearRequest() {
    }

    public SearchByBrandAndYearRequest(Long brandid, int year) {
        this.brandid = brandid;
        this.year = year;
    }

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
