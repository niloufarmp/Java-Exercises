package parkinglot;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class HandicapDriver extends Driver {

    ParkingSpace decideWhereToPark(ParkingSpace parkingSpace) throws NoSpaceAvailableException {
        Integer handicapSpace = parkingSpace.getHandicapSpace();

        if (handicapSpace > 0) {
            parkingSpace.setHandicapSpace(handicapSpace - 1);
            return parkingSpace;
        } else {
            System.out.println("No handicap space found, trying regular space..");
            return super.decideWhereToPark(parkingSpace);
        }
    }

    @Override
    public String toString() {
        return "Handicap Driver";
    }
}
