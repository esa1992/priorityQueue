package com.myCompany;

import java.util.Comparator;

public class CustomComporatorStatus implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if ((o1.isVip() && o2.isVip()) || (!o1.isVip() && !o2.isVip())) {
            return 0;
        } else if (o1.isVip() && !o2.isVip()){
            return -1;
        } else if (!o1.isVip() && o2.isVip()){
            return 1;
        }

        return 0;
    }
}
