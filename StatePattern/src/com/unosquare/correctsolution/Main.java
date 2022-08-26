package com.unosquare.correctsolution;

import com.unosquare.correctsolution.model.SodaVendingMachine;

public class Main {
    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        System.out.println(sodaVendingMachine);
    }
}
