package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JatekTest {

    @Test
    public void felsosorkor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(0,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(1,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,0), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Felső sor nem csak kör.", Jatekos.KOR, result);
    }

    @Test
    public void kozepsosorkor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(1,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(2,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,2), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Középső sor nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void alsosorkor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(2,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(2,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,2), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(1,0), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Alsó sor nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void elsooszlopkor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,0), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(0,1), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Első oszlop nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void masodikoszlopkor() {

        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,1), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,1), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,2), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,2), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Második oszlop nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void harmadikoszlopkor() {

        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,2), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,2), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,2), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(1,0), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Harmadik oszlop nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void jobbatlokor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,2), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,2), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(1,0), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Jobb átló nem csak kör.", Jatekos.KOR, result);
    }
    @Test
    public void balatlokor() {
        Jatek myBoard = new Jatek();
        myBoard.setCell(new Kordi(0,0), Jatekos.KOR);
        myBoard.setCell(new Kordi(1,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(2,2), Jatekos.KOR);
        myBoard.setCell(new Kordi(2,1), Jatekos.KERESZT);
        myBoard.setCell(new Kordi(0,1), Jatekos.KOR);

        Jatekos result = myBoard.kinyer();

        assertEquals("Bal atló nem csak kör.", Jatekos.KOR, result);
    }
}

