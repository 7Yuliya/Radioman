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
    public void shouldSetNextCurrentRadioNumberEqualTo9() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(9);
        cond.nextCurrentRadioNumber();
        int expected = 0;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentRadioNumberEqualTo0() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(0);
        cond.prevCurrentRadioNumber();
        int expected = 9;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentRadioNumberNoEqualTo0() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(2);
        cond.prevCurrentRadioNumber();
        int expected = 2;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolumeLessThen10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(2);
        cond.increaseVolume();
        int expected = 3;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMoreThen10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        cond.increaseVolume();
        int expected = 1;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeEqualTo10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.increaseVolume();
        int expected = 10;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeEqualTo10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        cond.decreaseVolume();
        int expected = 9;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMoreThen10() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioNumberEqualTo9() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(9);
        int expected = 9;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioNumberEqualTo10() {
        Radio cond = new Radio();
        cond.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = cond.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolumeEqualTo11() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}