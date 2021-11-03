package zw.co.poscloud.poscloud.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;
    private String make;
    private String model;
    private String yearOfManufacture;
    private String country;
    private Double consumptionInLitres;
    private String code;

    public Vehicle(String make, String model, String yearOfManufacture, String country, Double consumptionInLitres, String code) {
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.country = country;
        this.consumptionInLitres = consumptionInLitres;
        this.code = code;
    }

    public Long getId(){
        return  Id;
    }
    public String getMake(){
        return  make;
    }

    public String getModel(){
        return  model;
    }
    public String getYearOfManufacture(){
        return  yearOfManufacture;
    }
    public String getCountry(){
        return country;
    }
    public Double getConsumptionInLitres(){
        return consumptionInLitres;
    }
    public String getCode() {
        return code;
    }

    public void setMake(String make){
          this.make = make;
    }

    public void setModel(String model){
          this.model= model;
    }
    public void setYearOfManufacture(String yearOfManufacture){
          this.yearOfManufacture = yearOfManufacture;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setConsumptionInLitres( Double consumptionInLitres){
         this.consumptionInLitres = consumptionInLitres;
    }
    public void setCode(String code){
        this.code = code;
    }
    @Override
    public String toString(){
        return "Vehicle{"+
                "id=" +Id+
                ", make'" +make +'\''+
                ", model '" + model +'\''+
                ", yearOfManufacture '"+yearOfManufacture+'\''+
                ", country '"+country+'\''+
                ", consumptionInLitres'"+
                ", code'"+
                '}';
    }


}


