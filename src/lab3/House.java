package lab3;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class House {

    public int YearConstruction;
    public int floors;
    public String name;


    public String  getAll() {
        return("Название города - "+this.name + " Кол-во этажей - " + this.floors + " Год постройки - " + this.YearConstruction);
    }
    public int getYearConstruction() {
        return YearConstruction;
    }

    public  void setAll( String name, int floors, int yearConstruction) // метод устанавливающий все значения
    {
        this.name = name;
        this.floors = floors;
        this.YearConstruction= yearConstruction;
    }
    public int exploitationLong(){
        LocalDate currentData = LocalDate.now();
        return(currentData.getYear() - this.getYearConstruction());
    }
    public static void main(String[] args){
        House house1 = new House();
        house1.setAll("Spb", 14 , 1970);
        House house2 = new House();
        house2.setAll("Msk", 6, 1980);
        System.out.println(house1.getAll());
        System.out.println("В экусплуатации " + house1.exploitationLong() + " года");
        System.out.println(house2.getAll());
        System.out.println("В экусплуатации " + house2.exploitationLong() + " года");
    }


}


