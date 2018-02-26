package com.sample.service.dto;

/**
 * Created by VT65 on 11/28/2017.
 */
public enum FreshDepot implements IdNamedEnum {

    DONCASTER("95"),
    DIDCOT("115"),
    DAGENHAM("135"),
    SNODLAND("175"),
    HINCKLEY("195"),
    SOUTHAMPTON("235"),
    PETERBOROUGH("315"),
    LIVINGSTON("505"),
    BELFAST("835"),
    AVONMOUTH("845"),
    WIDNES("875");
    private String depotNumber;

    FreshDepot(String depotNumber) {
        this.depotNumber = depotNumber;
    }

    @Override
    public String getId() {
        return depotNumber;
    }
}
