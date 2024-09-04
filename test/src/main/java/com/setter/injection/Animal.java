package com.setter.injection;

public class Animal {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Details" + specification.toString());
    }
}
