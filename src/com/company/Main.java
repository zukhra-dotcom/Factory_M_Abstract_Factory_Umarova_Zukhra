package com.company;

public class Main {

    public static void main(String[] args) {
        CrispsFactory factory = new PaprikaFavorFactory();

        Crisps crisps = factory.createCrisps();
        crisps.flavor();
    }
}