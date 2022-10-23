package lab3;

public class Car {
    private String Color;
    private String Name;
    private int Weight;

    Car (String Color, String Name, int Weight){
        this.Color = Color;
        this.Name = Name;
        this.Weight = Weight;
    }

    public Car(String Color, int Weight) {
        this.Color = Color;
        this.Weight = Weight;
    }

    public Car() {
    }

    public String getInfoCar()
    {
        return ("Цвет машины - " + this.Color+"\n"+"Наименование - "+ this.Name + "\n"+"Наименование - "+ this.Weight);
    }
    public static void main(String[] args) {
        Car car = new Car("Black", "Kia", 1200);
        Car car1 = new Car("White", 1100);
        System.out.println("\nЗадание 2");
        System.out.println(car.getInfoCar());
        System.out.print("\n");
        System.out.println(car1.getInfoCar());
    }

}




