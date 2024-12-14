package Inheritance.Devices;

public class SmartWatch extends WearableDevice{
    boolean heartRateMonitor;

    public SmartWatch(String brand,int batteryLife, String strapMaterial, boolean heartRateMonitor){
        // First thing you must do as a child class of WearableDevice is call the super class constructor.
        super(brand,batteryLife,strapMaterial);
        this.heartRateMonitor = heartRateMonitor;
    }

    // Additional Method Specific to SmartWatches

    void heartRateCheck(){
        if(heartRateMonitor){
            System.out.println("HeartRate is being checked now, please check your screen to see the value.");
        }else{
            System.out.println("Sorry this feature is not available on your device. ");
            System.out.println("Please visit our webpage to see your options to upgrade.");
        }
    }
    @Override
    void wear(){
        System.out.println("you are wearing "+ brand+" smart watch with "+strapMaterial+" Strap on your wrist");
    }
}