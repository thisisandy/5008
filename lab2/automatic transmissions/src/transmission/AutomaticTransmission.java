package transmission;
public class AutomaticTransmission implements Transmission {
    private int currentSpeed;
    private final int[] thresholds;

    public AutomaticTransmission(int speed1, int speed2, int speed3, int speed4, int speed5) {
        this.thresholds = new int[]{speed1, speed2, speed3, speed4, speed5};
        for (int threshold : thresholds) {
            if (threshold <= 0) {
                throw new IllegalArgumentException();
            }
        }
    }
    public int getGear() {
        if (this.currentSpeed == 0) {
            return 0;
        }
        int gear = 1;
        for (int i = 0; i < thresholds.length; i++) {
            if (currentSpeed >= thresholds[i]) {
                gear = i+2;
            } else {
                break;
            }
        }
        return gear;
    }

    public AutomaticTransmission increaseSpeed() {
        this.currentSpeed += 2;
        return this;
    }

    public AutomaticTransmission decreaseSpeed() {
        if (this.currentSpeed <2){
            throw new IllegalStateException();
        }
        this.currentSpeed -= 2;
        return this;
    }

    public int getSpeed() {
        return this.currentSpeed;
    }

    @Override
    public String toString() {
        return "Transmission (speed = " + this.currentSpeed + ", gear = " + this.getGear() + ")";
    }
}