package com.berkaytutal.troopgenerator.service;

import com.berkaytutal.troopgenerator.model.Troop;
import org.springframework.stereotype.Service;

@Service
public interface TroopService {

    Troop generateUnique(int sum);

}
