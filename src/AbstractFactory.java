// Данный паттерн является фабрикой фабрик

public class AbstractFactory {
    public static void main(String[] args) {
        Factory carFactory = new AbstractFactoryes().createFactory("Car");
        Factory tankFactory = new AbstractFactoryes().createFactory("Tank");
        Car toyota = new CarFactory().createCar("Toyota");
        Car audi = new CarFactory().createCar("Audi");
        toyota.drive();
        audi.drive();
        Tank t51 = tankFactory.createTank("T51");
        Tank t52 = tankFactory.createTank("T52");
        t51.drive();
        t52.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car{
    @Override
    public void drive(){
        System.out.println("drive Toyota");
    }
}

class Audi implements Car{
    @Override
    public void drive(){
        System.out.println("drive Audi");
    }
}

interface Factory {
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default: return null;
        }
    }

    @Override
    public Tank createTank(String typeOfTank){
        return null;
    }
}

interface Tank {
    void drive();
}

class T51 implements Tank{
    @Override
    public void drive(){
        System.out.println("drive T51");
    }
}

class T52 implements Tank{
    @Override
    public void drive(){
        System.out.println("drive T52");
    }
}

class TankFactory implements Factory{
    public Tank createTank(String typeOfTank){
        switch (typeOfTank){
            case "T51" : return new T51();
            case "T52" : return new T52();
            default: return null;
        }
    }
    @Override
    public Car createCar(String typeOfCar){
        return null;
    }
}

class AbstractFactoryes {
    Factory createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "Car" : return new CarFactory();
            case "Tank" : return new TankFactory();
            default: return null;
        }
    }
}
