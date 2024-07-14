package com.example.CodingChallenge.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BatteryInfo", schema = "public")

public class UserEntity
{
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private int postcode;
    @Column
    private int wattCapacity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setWattCapacity(int wattCapacity) {
        this.wattCapacity = wattCapacity;
    }

    public UserEntity(String name, int postcode, int wattCapacity) {
        this.name = name;
        this.postcode = postcode;
        this.wattCapacity = wattCapacity;
    }
}
