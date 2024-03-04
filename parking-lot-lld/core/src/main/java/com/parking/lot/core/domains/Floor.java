package com.parking.lot.core.domains;

import com.parking.lot.core.domains.commons.Identity;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(of = {"floorName", "floorNumber"})
public class Floor {
    Identity id;
    String floorName;
    Long floorNumber;
    boolean active;

    public static Floor newInstance(Identity id, String floorName, Long floorNumber, boolean active) {
        return new Floor(id, floorName, floorNumber, active);
    }
}
