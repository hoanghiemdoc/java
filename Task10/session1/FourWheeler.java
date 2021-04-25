package BTVN.Task10.session1;

public class FourWheeler extends Vehicle {
    private boolean powerSteer; // Variable to store steering information

    /**
     * Parameterized constructor to initialize values based on user input
     *
     * @param vName     a String variable storing vehicle name
     * @param numWheels an integer variable storing number of wheels
     * @param pSteer    a String variable storing steering information
     */
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer) {
// Invoke the super class constructor
        super(vId, vName, numWheels);
        powerSteer = pSteer;
    }

    /**
     * Displays vehicle details
     *
     * @return void
     */
    public void showDetails() {
        System.out.println("Vehicle no:" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Number of Wheels:" + wheels);
        if (powerSteer == true) {
            System.out.println("Power Steering:Yes");
        } else {
            System.out.println("Power Stearing:No");
        }
    }
/**
 * Overridden method
 * Displays the acceleration details of the vehicle
 *
 * @return void
 */
        @Override
        public void accelerate(int speed){
// Invoke the super class accelerate() method
            super.accelerate(speed);
            System.out.println("Maximum acceleration:"+ speed + " kmph");
        }

    }
