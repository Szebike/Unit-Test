package com.company;

import java.util.ArrayList;

public class Jatek {

    private Jatekos[][] Palya = new Jatekos[3][3];

    public Jatekos getCell(Kordi cell) {
        return Palya[cell.col][cell.row];
    }


    public void setCell(Kordi cell, Jatekos jatekos) {
        if (Palya[cell.col][cell.row] != null) {
            throw new IllegalArgumentException("Az a mező már foglalt.");
        }
        if (kinyer() != null) {
            throw new IllegalArgumentException("Vége már a játéknak.");
        }
        if (jatekos != kovetkezojatek()) {
            throw new IllegalArgumentException("Ez nem a te köröd.");
        }
        Palya[cell.col][cell.row] = jatekos;
    }

    private Jatekos kovetkezojatek() {
        int countO = 0;
        int countX = 0;
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (Palya[col][row] == Jatekos.KOR) {
                    countO++;
                } else if (Palya[col][row] == Jatekos.KERESZT) {
                    countX++;
                }
            }
        }
        if (countO > countX) {
            return Jatekos.KERESZT;
        }
        return Jatekos.KOR;
    }

    public Jatekos kinyer() {
        ArrayList<Kordi[]> nyeropozik = new ArrayList<>();
        // sor
        nyeropozik.add(new Kordi[]{new Kordi(0, 0), new Kordi(1, 0), new Kordi(2, 0)});
        nyeropozik.add(new Kordi[]{new Kordi(0, 1), new Kordi(1, 1), new Kordi(2, 1)});
        nyeropozik.add(new Kordi[]{new Kordi(0, 2), new Kordi(1, 2), new Kordi(2, 2)});
        // oszlop
        nyeropozik.add(new Kordi[]{new Kordi(0, 0), new Kordi(0, 1), new Kordi(0, 2)});
        nyeropozik.add(new Kordi[]{new Kordi(1, 0), new Kordi(1, 1), new Kordi(1, 2)});
        nyeropozik.add(new Kordi[]{new Kordi(2, 0), new Kordi(2, 1), new Kordi(2, 2)});
        // átloba
        nyeropozik.add(new Kordi[]{new Kordi(0, 0), new Kordi(1, 1), new Kordi(2, 2)});
        nyeropozik.add(new Kordi[]{new Kordi(2, 0), new Kordi(1, 1), new Kordi(0, 2)});

        for (Kordi[] nyeropozi : nyeropozik) {
            if (getCell(nyeropozi[0]) == getCell(nyeropozi[1])
                    && getCell(nyeropozi[1]) == getCell(nyeropozi[2])) {
                if (getCell(nyeropozi[0]) != null) {
                    return getCell(nyeropozi[0]);
                }
            }
        }
        return null;
    }

}
