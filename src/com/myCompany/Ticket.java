package com.myCompany;

public class Ticket {

    private int cost;
    private boolean isVip;

    public Ticket() {
    }
    public Ticket(int cost, boolean isVip) {
        this.cost = cost;
        this.isVip = isVip;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}
