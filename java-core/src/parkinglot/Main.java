package parkinglot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class Main {
    public static void main(String[] args) {
        Map<VehicleSize, ParkingSpace> parkingLotMap = new HashMap<>();
        parkingLotMap.put(VehicleSize.SMALL, new ParkingSpace(9, 0));
        parkingLotMap.put(VehicleSize.MEDIUM, new ParkingSpace(24, 5));
        parkingLotMap.put(VehicleSize.LARGE, new ParkingSpace(10, 0));
        ParkingLot parkingLot = new ParkingLot(parkingLotMap);

        Vehicle vehicle;

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.LARGE, new HandicapDriver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.SMALL, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.SMALL, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.SMALL, new Driver());
        vehicle.park(parkingLot);

        vehicle= new Vehicle(VehicleSize.MEDIUM, new Driver());
        vehicle.park(parkingLot);
    }
}
