package com.example.carfromvietnam.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String brandName;

    

    public Brand() {
    }

    public Brand(Long id) {
        this.id = id;
    }

    public Brand(Long id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id.equals(brand.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
