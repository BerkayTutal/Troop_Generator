package com.berkaytutal.troopgenerator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Troop {

    private int spearMan;

    private int swordsMan;

    private int archers;

    public boolean isUnique() {

        return !(spearMan == swordsMan || spearMan == archers || swordsMan == archers);
    }
}
