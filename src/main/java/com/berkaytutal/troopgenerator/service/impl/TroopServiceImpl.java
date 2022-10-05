package com.berkaytutal.troopgenerator.service.impl;

import com.berkaytutal.troopgenerator.exception.InvalidRequestException;
import com.berkaytutal.troopgenerator.model.Errors;
import com.berkaytutal.troopgenerator.model.Troop;
import com.berkaytutal.troopgenerator.service.TroopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class TroopServiceImpl implements TroopService {

    @Override
    public Troop generateUnique(int sum) {
        if(sum < 6){
            throw new InvalidRequestException(Errors.INVALID_MINIMUM_SUM_ERROR);
        }

        Troop troop = generate(sum);

        while (!troop.isUnique()) {
            troop = generate(sum);
        }
        return troop;
    }

    private Troop generate(int sum) {

        Random rand = new Random();
        int spearMan = rand.nextInt(sum - 3) + 1; //-3 because at least one of the items should be 1 and other one is 2, +1 because 0 is inclusive, sum is exclusive
        int swordsMan = rand.nextInt(sum - spearMan - 1) + 1; // -1 because at least 1 needs to be left for archers
        int archers = sum - spearMan - swordsMan;

        return Troop.builder()
                .spearMan(spearMan)
                .swordsMan(swordsMan)
                .archers(archers)
                .build();
    }
}
