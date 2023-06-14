package transmission;
public interface Transmission {
    AutomaticTransmission increaseSpeed();
    AutomaticTransmission decreaseSpeed();
    int getSpeed();
    String toString();

    int getGear();
}
