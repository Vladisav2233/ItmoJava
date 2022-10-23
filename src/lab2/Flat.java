package lab2;

public class Flat {
    private String address;
    private Integer floor;
    private Integer numbOfRooms;
    private Double square;
    private Long price;
    //Конструктор со всеми параметрами
    public Flat(String address, Integer floor, Integer numbOfRooms, Double square, Long price)
    {
        this.address = address;
        this.floor = floor;
        this.numbOfRooms = numbOfRooms;
        this.square = square;
        this. price = price;
    }
    //Конструктор по умолчанию
    public Flat(){

    }
    //Конструктор с неполными параметрами
    public Flat(String address, Long price){
        this.address = address;
        this.price = price;
    }
    ///Getter
    public String getAddress(){
        return address;
    }
    public Integer getFloor(){
        return floor;
    }
    public Integer getNumbOfRooms(){
        return numbOfRooms;
    }
    public Double getSquare(){
        return square;
    }
    public Long getPrice(){
        return price;
    }

    public static void main(String[] args) {
        System.out.println("\n Задание №2 \n");
        Flat flat = new Flat("Спб", 2, 14, 50.5,5_000_000L);
        System.out.println(flat.getAddress());
        System.out.println(flat.getFloor());
        System.out.println(flat.getNumbOfRooms());
        System.out.println(flat.getSquare());
        System.out.println(flat.getPrice());
    }
}



