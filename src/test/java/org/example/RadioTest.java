package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextCurrentRadioNumber() {
        Radio cond = new Radio();
        cond.nextCurrentRadioNumber();
        int expected = 1;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentRadioNumber9() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(9);
        cond.nextCurrentRadioNumber();
        int expected = 0;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentRadioNumber() {
        Radio cond = new Radio();

        cond.prevCurrentRadioNumber();
        int expected = 9;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolume() {
        Radio cond = new Radio();
        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetDecreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.decreaseVolume();
        int expected = 9;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioNumber() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(9);
        int expected = 9;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioNumber10() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        int expected = 10;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume11() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}