package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){

    }
    public boolean isSpeedZero() {
        return this.speedometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
        }
    }

    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            if (this.speedometer > MAX_SPEED) {
                this.speedometer = MAX_SPEED;
            }
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle > 45) {
            this.wheelsAngle = 45;
        } else if (angle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = angle;
        }
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0 && reverse) {
            this.gear = "R";
        } else if (!reverse) {
            this.gear = "N";
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocidad actual: " + this.speedometer + " km/h");
        System.out.println("Tacómetro: " + this.tachometer + " RPM");
        System.out.println("Marcha actual: " + this.gear);
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados");
    }
}

