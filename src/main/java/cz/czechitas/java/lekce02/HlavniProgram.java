package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }



        //TODO tady bude kód



    }

        public static void main (String[]args) {
            new HlavniProgram().start();
        }

    }

