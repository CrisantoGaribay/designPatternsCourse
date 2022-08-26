package com.unosquare.ovioussolution;

public class Main {

    public static void main(String[] args) {
        SodaMachine sodaMachine = new SodaMachine(10);

        sodaMachine.insertMoney();
        sodaMachine.selectSoda();

        System.out.println("Inventory: " + sodaMachine.count);
        System.out.println("----------");

        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
        sodaMachine.selectSoda();

        System.out.println("Inventory: " + sodaMachine.count);
        System.out.println("----------");

        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.ejectMoney();

        System.out.println("Inventory: " + sodaMachine.count);
        System.out.println("----------");
    }
}
