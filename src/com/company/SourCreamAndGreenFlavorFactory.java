package com.company;

public class SourCreamAndGreenFlavorFactory implements CrispsFactory{ //Concrete Creator A

    @Override
    public Crisps createCrisps() {
        return new SourCreamAndGreensFlavor();
    }
}
