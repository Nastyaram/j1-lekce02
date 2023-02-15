package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        nakresliCtverec();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliCtverec();

        //TODO tady bude kód
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
