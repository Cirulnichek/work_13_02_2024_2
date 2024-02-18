package com.example.work_13_02_2024.Domain;

public class Pet {
    private String specie;
    private String name;
    private String picture;

    public Pet(String specie, String name) {
        this.specie = specie;
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }
}
