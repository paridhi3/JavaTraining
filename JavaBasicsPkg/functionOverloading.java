package JavaBasicsPkg;

public class functionOverloading {
	
	public static double calFare(double distance) {
        return distance * 10;
    }

    public static double calFare(double distance, String cabType) {
        double ratePerKm;
        switch (cabType.toLowerCase()) {
            case "suv":
                ratePerKm = 25;
                break;
            case "premium":
                ratePerKm = 20;
                break;
            default:
                ratePerKm = 10;
        }
        return distance * ratePerKm;
    }

    public static double calFare(double distance, String cabType, boolean peakTime) {
        double baseFare = calFare(distance, cabType);
        if (peakTime) {
            baseFare += baseFare * 0.1;
        }
        return baseFare;
    }

	public static void main(String[] args) {
		System.out.println("Standard Fare: Rs " + calFare(15)); 
        System.out.println("SUV Fare: Rs " + calFare(15, "suv")); 
        System.out.println("Premium Fare with Peak Time Surcharge: Rs " + calFare(15,"premium", true));
	}

}
