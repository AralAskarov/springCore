package com.setter.injection;

public class Specification {
    private String animal;
    private String name;

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
