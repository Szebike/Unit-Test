package com.company;

public enum Jatekos {

    KOR("O"),
    KERESZT("X");

    private String symbol;

    Jatekos(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
