package com.company;

public class PaprikaFavorFactory implements CrispsFactory{
    @Override
    public Crisps createCrisps() {
        return new PaprikaFavor();
    }
}
