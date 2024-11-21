package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Gasolina");

        System.out.println("¿La velocidad es 0? " + car.isSpeedZero());

        car.start();
        System.out.println("¿El tacómetro es mayor que 0? " + car.isTachometerGreaterThanZero());

        car.start();

        car.accelerate();
        System.out.println("Velocidad actual: " + car.speedometer);

        car.accelerate();
        System.out.println("Velocidad actual: " + car.speedometer);

        for (int i = 0; i < 15; i++) {
            car.accelerate();
        }
        System.out.println("Velocidad actual tras intentar exceder: " + car.speedometer);

        car.brake();
        System.out.println("Velocidad actual tras frenar: " + car.speedometer);

        car.brake();
        car.brake();
        car.brake();
        System.out.println("Velocidad actual tras frenar varias veces: " + car.speedometer);

        while (!car.isSpeedZero()) {
            car.brake();
        }
        System.out.println("¿La velocidad es 0 tras detener? " + car.isSpeedZero());

        car.stop();
        System.out.println("¿El tacómetro es igual a 0 tras apagar? " + car.isTachometerEqualToZero());

        car.turnAngleOfWheels(20);
        System.out.println("Ángulo del volante: " + car.wheelsAngle);

        car.turnAngleOfWheels(50);
        System.out.println("Ángulo del volante tras intentar exceder: " + car.wheelsAngle);

        car.turnAngleOfWheels(-50);
        System.out.println("Ángulo del volante tras intentar exceder negativo: " + car.wheelsAngle);

        car.setReverse(true);
        System.out.println("Marcha actual: " + car.gear);

        car.start();
        car.accelerate();
        car.setReverse(true);
        System.out.println("Marcha actual tras intentar reversa en movimiento: " + car.gear);

        while (!car.isSpeedZero()) {
            car.brake();
        }
        car.setReverse(true);
        System.out.println("Marcha actual tras detener y poner reversa: " + car.gear);

        car.showDetails();
    }
}


