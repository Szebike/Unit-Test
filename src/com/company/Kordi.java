package com.company;


public class Kordi {

    public int col;
    public int row;

    public Kordi(int col, int row) {
        if (col > 2 || row > 2) {
            throw new IllegalArgumentException("Egyik oszlop sem" + col +
                    " vagy sor " + row + " lehet 2 felett.");
        }
        this.col = col;
        this.row = row;
    }

}
