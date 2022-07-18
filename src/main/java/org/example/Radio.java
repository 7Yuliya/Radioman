package org.example;

public class Radio {
    public int currentRadioNumber;
    public int maxCurrentRadioNumber = 9;
    public int minCurrentRadioNumber = 0;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {

        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;

    }

    public void nextCurrentRadioNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
        }

        if (currentRadioNumber == 9) {
            currentRadioNumber = 0;
        }

    }

    public void prevCurrentRadioNumber() {
        if (currentRadioNumber == 0) {
            currentRadioNumber = 9;
        }


    }


    public int currentVolume;
    public int maxCurrentVolume = 10;
    public int minCurrentVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;


    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == 10) {
            currentVolume = currentVolume - 1;;
        }
    }

}

