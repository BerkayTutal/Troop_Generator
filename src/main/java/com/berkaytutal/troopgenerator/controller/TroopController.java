package com.berkaytutal.troopgenerator.controller;

import com.berkaytutal.troopgenerator.model.Troop;
import com.berkaytutal.troopgenerator.model.dto.TroopResponse;
import com.berkaytutal.troopgenerator.service.TroopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/troops")
@RequiredArgsConstructor
public class TroopController {

    private final TroopService troopService;

    @GetMapping("/generate/{sum}")
    public TroopResponse generate(@PathVariable int sum) {

        Troop troop = troopService.generateUnique(sum);
        return TroopResponse.from(troop);
    }
}
