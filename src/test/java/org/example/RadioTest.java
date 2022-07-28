package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNumberOfRadioStations() {
        Radio radio = new Radio(7);

        int actual = radio.getNumberOfRadioStations();
        Assertions.assertEquals(7, actual);
    }


    @Test
    public void testNumberOfRadioStationsEqualTo10() {
        Radio radio = new Radio();


        int actual = radio.getNumberOfRadioStations();
        Assertions.assertEquals(10, actual);
    }

    @Test
    public void shouldSetNext() {
        Radio radio = new Radio();

        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentRadioNumberEqualTo9() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentRadioNumberEqualTo0() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentRadioNumberNoEqualTo0() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseVolumeLessThen100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMoreThen100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeEqualTo100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeEqualTo100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMoreThen100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
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
    public void shouldSetCurrentVolumeEqualTo111() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentRadioNumberLessThen0() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeLessThen0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}