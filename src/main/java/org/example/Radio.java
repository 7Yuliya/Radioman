package org.example;

public class Radio {
    public int currentRadioNumber;
    public int maxCurrentRadioNumber = 9;
    public int minCurrentRadioNumber = 0;
    private int numberOfRadioStations = 10;

    public Radio(int numberOfRadioStations) {

        this.numberOfRadioStations = numberOfRadioStations;
        this.maxCurrentRadioNumber =  numberOfRadioStations - 1;
    }

    public Radio() {

    }


    public int getCurrentRadioNumber() {

        return currentRadioNumber;
    }
    public int getMaxCurrentRadioNumber(){
        return maxCurrentRadioNumber;

    }
    public int getNumberOfRadioStations(){
        return numberOfRadioStations;


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
        } else {
            currentRadioNumber = 0;
        }

    }

    public void prevCurrentRadioNumber() {
        if (currentRadioNumber > 0) {
            currentRadioNumber = currentRadioNumber - 1;
        } else {
            currentRadioNumber = 9;
        }


    }


    public int currentVolume;
    public int maxCurrentVolume = 100;
    public int minCurrentVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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

