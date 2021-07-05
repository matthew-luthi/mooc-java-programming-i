/**
 *
 * @author Matt
 */
public class Fitbyte {
    private int age, restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * age);
        
        return (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}