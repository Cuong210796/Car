package com.example.carfromvietnam.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String model;
    @Column
    private int year;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    @Column
    private String engine;
    @Column
    private String carPrice;
    @Column
    private int doorNumber;
    @Column
    private int seatNumber;
    @Column
    private String controlScreen;
    @Column(length = 5000)
    private String content;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToMany
    @JoinTable(name = "car_color",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id"))
    private List<Color> colors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "car_furniture",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "furniture_color_id"))
    private List<FurnitureColor> furnitureColors = new ArrayList<>();

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getControlScreen() {
        return controlScreen;
    }

    public void setControlScreen(String controlScreen) {
        this.controlScreen = controlScreen;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<FurnitureColor> getFurnitureColors() {
        return furnitureColors;
    }

    public void setFurnitureColors(List<FurnitureColor> furnitureColors) {
        this.furnitureColors = furnitureColors;
    }
}
