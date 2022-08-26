package com.unosquare.ovioussolution;

public class SodaMachine {

    //STATES
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;

        if (count > 0) {
            state = NO_MONEY;
            System.out.println("Welcome to our soda vending machine");
            System.out.println("Inventory is " + count + " Sodas");
            System.out.println("Insert a dollar bill to get started...");
        }
    }

    //ACTIONS
    public  void insertMoney() {
        System.out.println(state);
        if (state == HAS_MONEY) {
            System.out.println("You can't insert another dollar bill");
        } else if (state == NO_MONEY) {
            state = HAS_MONEY;
            System.out.println("You inserted a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is sold out.");
        } else if (state == SOLD) {
            System.out.println("Please wait! We are already giving you soda!");
        }
    }

    public void ejectMoney() {
        if (state == HAS_MONEY) {
            System.out.println("Returning dollar bill");
            state = NO_MONEY;
        } else if (state == NO_MONEY) {
            System.out.println("You haven;t insert a dollar bill");
        } else if (state == SOLD) {
            System.out.println("Already selected soda!");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine sold out!");
        }
    }

    public void selectSoda() {
        if (state == HAS_MONEY) {
            System.out.println("You selected a soda...");
            state = SOLD;
            dispense();
        } else if (state == NO_MONEY) {
            System.out.println("You selected soda, but money first, buddy");
        } else if (state == SOLD) {
            System.out.println("Dispensing your Soda as we speak... Enjoy!");
        } else if (state == SOLD_OUT) {
            System.out.println("You're outta luck - No sodas left");
        }
    }

    public void dispense () {
        if (state == HAS_MONEY) {
            System.out.println("No soda dispensed");
        } else if (state == NO_MONEY) {
            System.out.println("You selected soda, but money first, buddy");
        } else if (state == SOLD) {
            System.out.println("Dispensing your Soda as we speak... Enjoy!");
            count = count - 1;

            if (count == 0) {
                System.out.println("Sorry, out of sodas!");
                state = SOLD_OUT;
            } else state = NO_MONEY;
        } else if (state == SOLD_OUT) {
            System.out.println("You're outta luck - No sodas left");
        }
    }
}
