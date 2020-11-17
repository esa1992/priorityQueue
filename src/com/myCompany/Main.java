package com.myCompany;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Ticket> ticketCostPriorityQueue = new PriorityQueue<>(new CustomComporatorCost());
        ticketCostPriorityQueue.add(new Ticket(100, true));
        ticketCostPriorityQueue.add(new Ticket(220, true));
        ticketCostPriorityQueue.add(new Ticket(182, true));
        ticketCostPriorityQueue.add(new Ticket(500, true));
        ticketCostPriorityQueue.add(new Ticket(330, true));
        ticketCostPriorityQueue.add(new Ticket(280, true));
        ticketCostPriorityQueue.add(new Ticket(400, true));

        System.out.println("Билеты с приоритетом по более высокой цене:");
        while(!ticketCostPriorityQueue.isEmpty()){
            System.out.println(ticketCostPriorityQueue.poll().getCost());
        }

        PriorityQueue<Ticket> ticketStatusPriorityQueue = new PriorityQueue<>(new CustomComporatorStatus());
        ticketStatusPriorityQueue.add(new Ticket(100, true));
        ticketStatusPriorityQueue.add(new Ticket(100, false));
        ticketStatusPriorityQueue.add(new Ticket(100, false));
        ticketStatusPriorityQueue.add(new Ticket(100, true));
        ticketStatusPriorityQueue.add(new Ticket(100, false));
        ticketStatusPriorityQueue.add(new Ticket(100, true));
        ticketStatusPriorityQueue.add(new Ticket(100, false));

        System.out.println("-----------------------------\nБилеты с приоритетом по статусу VIP:");
        while(!ticketStatusPriorityQueue.isEmpty()){
            System.out.println(ticketStatusPriorityQueue.poll().isVip());
        }

    }
}
