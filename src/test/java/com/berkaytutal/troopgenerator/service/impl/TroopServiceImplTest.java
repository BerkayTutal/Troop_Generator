package com.berkaytutal.troopgenerator.service.impl;

import com.berkaytutal.troopgenerator.exception.InvalidRequestException;
import com.berkaytutal.troopgenerator.model.Troop;
import com.berkaytutal.troopgenerator.service.TroopService;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
public class TroopServiceImplTest {

    @Autowired
    private TroopService troopService;

    @Test
    public void generate_whenInputValid_returnsTroopWithCorrectSum() {
        //given
        int sum = 100;
        //when
        Troop troop = troopService.generateUnique(sum);
        //then
        assertThat(troop).isNotNull();
        assertThat(troop.getArchers() + troop.getSwordsMan() + troop.getSpearMan()).isEqualTo(100);
    }

    @Test
    public void generate_whenInputNotValid_throwsException() {
        //given
        int sum = 5;
        //When
        final ThrowableAssert.ThrowingCallable throwingCallable = () -> troopService.generateUnique(sum);

        //Then
        assertThatThrownBy(throwingCallable)
                .isInstanceOf(InvalidRequestException.class);

    }
}
