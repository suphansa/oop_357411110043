package oop_lab7;
//Talking about Student?
//1.Car brand
//2.Car color
//3.Car engine size
//4.Max speed
//5.Country of origin
public class SuperCar {

    private String CarBrand;
    private String CarColor;
    private String CarEngineSize;
    private String MaxSpeed;
    private String CountryOfOrigin;
    //Constructor
    //Default constructor
    public SuperCar(){}
        //crate constructor by owner
        //crate constructor by owner
    public SuperCar(String b,String c, String e ,String m,String o) {
        //assign data to class properties
        this.CarBrand = b;
        this.CarColor = c;
        this.CarEngineSize = e;
        this.MaxSpeed = m;
        this.CountryOfOrigin = o;
    }
    //getter and setter methods


    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize='" + CarEngineSize + '\'' +
                ", MaxSpeed='" + MaxSpeed + '\'' +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                '}';
    }

    public String getCarBrand() {
        return this.CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarEngineSize() {
        return CarEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        CarEngineSize = carEngineSize;
    }

    public String getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }
}//class

