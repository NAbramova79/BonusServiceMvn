package ru.netology.javaqa.bonusservicemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.bonusservicemvn.services.BonusService;

public class BonusServiceTest {

    @ParameterizedTest
//    @CsvSource({
//          "1000, true, 30",
//          "1000000, true, 500",
//          "5000, false, 50",
//          "100000, false, 500"
//    })
    @CsvFileSource(files="src/test/resources/bonus.csv")
    void shouldCalculateForRegisteredAndUnderLimit (long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        //long amount = 1000;
        //boolean registered = true;
        //long expected = 30;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
    //@Test
   //void shouldCalculateForRegisteredAndOverLimit () {
   //BonusService service = new BonusService();

    //long amount = 1_000_000;
    //boolean registered = true;
    //long expected = 500;

    //long actual = service.calculate(amount, registered);

    //Assertions.assertEquals(expected, actual);
    //}
    //@Test
    //void shouldCalculateForUnRegisteredAndUnderLimit () {
    //BonusService service = new BonusService();

    //long amount = 5000;
    //boolean registered = false;
    //long expected = 50;

    //long actual = service.calculate(amount, registered);

    //Assertions.assertEquals(expected, actual);
    //}
    //@Test
    //void shouldCalculateForUnRegisteredAndOverLimit () {
            //BonusService service = new BonusService();
            //long amount = 100_000;
        //boolean registered = false;
            // long expected = 500;
            //long actual = service.calculate(amount, registered);

        //Assertions.assertEquals(expected, actual);
    // }
}
