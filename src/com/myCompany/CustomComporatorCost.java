package com.myCompany;

import java.util.Comparator;

public class CustomComporatorCost implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o2.getCost() - o1.getCost();
    }
}
