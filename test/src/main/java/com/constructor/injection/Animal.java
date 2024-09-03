package com.constructor.injection;

public class Animal {
    private Specification specification;

    public Animal(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Details" + specification.toString());
    }
}
