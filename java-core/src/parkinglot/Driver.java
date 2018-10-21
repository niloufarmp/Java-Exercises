package parkinglot;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class Driver {
    ParkingSpace decideWhereToPark(ParkingSpace parkingSpace) throws NoSpaceAvailableException {
        Integer regularSpace = parkingSpace.getRegularSpace();

        if (regularSpace > 0) {
            parkingSpace.setRegularSpace(regularSpace - 1);
            return parkingSpace;
        } else {
            throw new NoSpaceAvailableException();
        }
    }

    @Override
    public String toString() {
        return "Regular Driver";
    }
}
