package parkinglot;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class Vehicle {
    private Driver driver;
    private VehicleSize size;

    public Driver getDriver() {
        return driver;
    }

    public VehicleSize getSize() {
        return size;
    }

    Vehicle(VehicleSize size, Driver driver) {
        this.size = size;
        this.driver = driver;
    }

    public void park(ParkingLot parkingLot) {
        System.out.println("-> " + driver + " arrived with " + size + " sized vehicle.");

        parkingLot.allocateSpace(this);
    }
}
