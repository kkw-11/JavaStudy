package di.exam003;

public class Car {
    Tire tire;

    public Tire getTire(){
        return tire;
    }

    public void setTire(Tire tire){
        this.tire = tire;
    }

    public String getTireBrand(){
        return "This tire is get " + tire.getBrand();
    }
}
