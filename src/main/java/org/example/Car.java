package org.example;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int speed;

    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.year = 2000;
        this.speed = 0;
    }
    public void startCar(){
        System.out.println("Car starting.");
    }
    public void accelerate(){
        this.speed += 10;
    }
    public void showSpeed(){
        System.out.println("Speed: " + this.speed);
    }
}
