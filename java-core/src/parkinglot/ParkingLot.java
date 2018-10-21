package parkinglot;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class ParkingLot {
    private Map<VehicleSize, ParkingSpace> parkingLotMap;
    private List<VehicleSize> vehicleSizeList = Arrays.asList(VehicleSize.values());

    ParkingLot(Map<VehicleSize, ParkingSpace> parkingLotMap) {
        this.parkingLotMap = parkingLotMap;
    }

    private ParkingSpace getAvailableParkingSpace(VehicleSize vehicleSize) {
        return parkingLotMap.get(vehicleSize);
    }

    private void setAvailableParkingSpace(VehicleSize vehicleSize, ParkingSpace parkingSpace) {
        parkingLotMap.put(vehicleSize, parkingSpace);
    }

    public void allocateSpace(Vehicle vehicle) {
        VehicleSize vehicleSize = vehicle.getSize();
        Driver vehicleDriver = vehicle.getDriver();

        int idx = vehicleSizeList.indexOf(vehicleSize);
        VehicleSize parkingSize;
        while (idx < vehicleSizeList.size()) {
            parkingSize = vehicleSizeList.get(idx);
            ParkingSpace parkingSpace = getAvailableParkingSpace(parkingSize);
            try {
                ParkingSpace parkingSpaceAfterParked = vehicleDriver.decideWhereToPark(parkingSpace);
                setAvailableParkingSpace(parkingSize, parkingSpaceAfterParked);
                System.out.println(vehicleDriver.toString() + " with " + vehicleSize + " sized vehicle parked successfully in a " + parkingSize + " sized space.");
                return;
            } catch (NoSpaceAvailableException e) {
                System.out.println("No " + parkingSize + " sized Space found.");
            }
            idx++;
        }
        System.out.println("The car could not be parked at this time!");
    }
}
