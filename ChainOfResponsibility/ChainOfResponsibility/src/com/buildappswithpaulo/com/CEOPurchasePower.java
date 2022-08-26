package com.buildappswithpaulo.com;

public class CEOPurchasePower extends PurchasePower{
    @Override
    protected double getAllowable() {
        return BASE * 100000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
