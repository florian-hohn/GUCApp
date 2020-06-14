package com.example.gucapp;

public class CounterInstance {
    private int enterCount;
    private int leaveCount;
    private int enteredMarket;

    public CounterInstance() {
        enterCount = 0;
        leaveCount = 0;
        enteredMarket = 0;
    }

    public int getEnterCount() {
        return enterCount;
    }

    public void setEnterCount(int enterCount) {
        this.enterCount = enterCount;
    }

    public int getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(int leaveCount) {
        this.leaveCount = leaveCount;
    }

    public int getEnteredMarket() {
        return enteredMarket;
    }

    public void setEnteredMarket(int enteredMarket) {
        this.enteredMarket = enteredMarket;
    }

    public int calculateEntered(){
        return this.enteredMarket = this.enterCount - this.leaveCount;
    }

    public void resetCounter(){
        this.enterCount = 0;
        this.leaveCount = 0;
        this.enteredMarket = 0;
    }
}
