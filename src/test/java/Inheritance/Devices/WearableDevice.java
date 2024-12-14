package Inheritance.Devices;

public class WearableDevice extends SmartDevice{
    String strapMaterial; // Every wearable device object, should have a strap material

    // create a constructor that matches, super/parent classes constructor
    public WearableDevice(String brand,int batteryLife,String strapMaterial){
        //  I would like to call constructor from the super/parent class.
        super(brand,batteryLife);
        this.strapMaterial = strapMaterial;
    }

    void wear(){
        System.out.println("You are wearing a " + brand + " device with a " + strapMaterial + " strap.");
    }
}