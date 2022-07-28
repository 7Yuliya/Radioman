package org.example;

public class Radio {
    private int currentRadioNumber;
    private int currentVolume;
    private int numberOfRadioStations;

    public Radio() {
        numberOfRadioStations = 10;
    }

    public Radio(int numberOfRadioStations) {

        this.numberOfRadioStations = numberOfRadioStations;

    }


    public int getCurrentRadioNumber() {

        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int currentRadioNumber) {
        if (currentRadioNumber < 0) {
            return;
        }
        if (currentRadioNumber > numberOfRadioStations - 1) {
            return;
        }
        this.currentRadioNumber = currentRadioNumber;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public int getNumberOfRadioStations() {
        return numberOfRadioStations;


    }


    public void next() {
        if (currentRadioNumber < numberOfRadioStations - 1) {
            currentRadioNumber = currentRadioNumber + 1;
        } else {
            currentRadioNumber = 0;
        }

    }

    public void prev() {
        if (currentRadioNumber > 0) {
            currentRadioNumber = currentRadioNumber - 1;
        } else {
            currentRadioNumber = numberOfRadioStations - 1;

        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentRadioNumber = 0;
        }


    }

}


