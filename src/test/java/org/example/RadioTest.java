package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextCurrentRadioNumber() {
        Radio radio = new Radio();

        radio.nextCurrentRadioNumber();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentRadioNumberEqualTo9() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.nextCurrentRadioNumber();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentRadioNumberEqualTo0() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        radio.prevCurrentRadioNumber();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentRadioNumberNoEqualTo0() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(2);
        radio.prevCurrentRadioNumber();
        int expected = 2;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolumeLessThen10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMoreThen10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeEqualTo10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeEqualTo10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMoreThen10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioNumberEqualTo9() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioNumberEqualTo10() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolumeEqualTo11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}