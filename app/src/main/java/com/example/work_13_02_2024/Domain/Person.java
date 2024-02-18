package com.example.work_13_02_2024.Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    private int id;
    private String name;
    private String phone;

    private List<Pet> pets;

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.pets = new ArrayList<>();

        String[] species = {"whippet", "rhodesian ridgeback", "irish wolfhound", "dachshund",
                "borzoi", "bloodhound", "beagle", "basset hound"};

        String[] names = {"Cooper", "Milo", "Finn", "Charlie", "Tucker", "Ollie", "Bear", "Max"};

        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            this.pets.add(new Pet(species[generator.nextInt(species.length)],
                    names[generator.nextInt(names.length)]));
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Pet> getPets() {
        return pets;
    }
}
