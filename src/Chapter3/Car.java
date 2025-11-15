package Chapter3;

public class Car {
    private String model;
    private String year;
    private double price;
// Constructor
    public Car(String model, String year, double price){
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void setYear(String year){
        this.year=year;
    }


    public String getYear(){
        return year;
    }


    public void setPrice(double price){
        if (price>0.0){
            this.price=price;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public double getPrice(){
        return price;
    }

    private double discount1;
    private double discount2;


    public void setDiscount1(double discount1){
        this.discount1=discount1;
    }

    public double getDiscount1(){
        return price-(price*0.05);
    }

    public void setDiscount2(double discount2){
        this.discount2=discount2;
    }

    public double getDiscount2(){
        return price-(price*0.07);
    }

}