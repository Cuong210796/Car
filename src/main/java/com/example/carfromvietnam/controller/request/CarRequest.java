package com.example.carfromvietnam.controller.request;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;

public class CarRequest {

    private Long id;
    private String model;
    private int year;
    private String image;
    private String engine;
    private int seatNumber;
    private String carPrice;
    private int doorNumber;
    private MultipartFile multipartFile;
    private Long brandid;
    private Long[] colorids;
    private Long[] furnitureColorids;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public Long[] getColorids() {
        return colorids;
    }

    public void setColorids(Long[] colorids) {
        this.colorids = colorids;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Long[] getFurnitureColorids() {
        return furnitureColorids;
    }

    public void setFurnitureColorids(Long[] furnitureColorids) {
        this.furnitureColorids = furnitureColorids;
    }
}
