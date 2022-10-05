package com.berkaytutal.troopgenerator.model.dto;

import com.berkaytutal.troopgenerator.model.Troop;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TroopResponse {

    private final int spearMan;

    private final int swordsMan;

    private final int archers;

    public static TroopResponse from(Troop troop) {

        return TroopResponse.builder()
                .spearMan(troop.getSpearMan())
                .swordsMan(troop.getSwordsMan())
                .archers(troop.getArchers())
                .build();
    }
}
