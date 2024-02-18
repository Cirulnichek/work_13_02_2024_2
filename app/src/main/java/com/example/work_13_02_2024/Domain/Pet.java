package com.example.work_13_02_2024.Domain;

import com.example.work_13_02_2024.R;

import java.net.URI;

public class Pet {
    private String specie;
    private String name;
    private URI picture;

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

    public URI getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Порода: " + specie;
    }
}
