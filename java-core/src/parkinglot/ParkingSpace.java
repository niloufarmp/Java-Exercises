package parkinglot;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class ParkingSpace {
    private Integer RegularSpace;
    private Integer HandicapSpace;

    ParkingSpace(Integer regularSpace, Integer handicapSpace) {
        RegularSpace = regularSpace;
        HandicapSpace = handicapSpace;
    }

    public Integer getRegularSpace() {
        return RegularSpace;
    }

    public void setRegularSpace(Integer regularSpace) {
        RegularSpace = regularSpace;
    }

    public Integer getHandicapSpace() {
        return HandicapSpace;
    }

    public void setHandicapSpace(Integer handicapSpace) {
        HandicapSpace = handicapSpace;
    }
}
