package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //domeček
        domecek();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        domecek();

        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        domecek();




    }

    private void domecek() {
        zofka.turnRight(180);
        zofka.move(100);
        for (int i = 0; i <3; i++) {
            zofka.turnLeft(90);
            zofka.move(100);
        }
        zofka.turnRight(135);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(180);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
