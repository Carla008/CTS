package ro.ase.cts.s02;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        double result = calculator.calculateX5PlusY7();
        System.out.println("Rezultatul este: " + result);

        int height = 5;
        int width = 7;
        String filename = "matrix.txt";

        // creați un nou manipulator de date matriceale
        MatrixDataHandler handler = new MatrixDataHandler(height, width, filename);

        // modificați o valoare din matrice și actualizați fișierul
        int positionHeight = 3;
        int positionWidth = 4;
        int modifiedValue = 345;
        handler.modifyValueAndUpdateFile(positionHeight, positionWidth, modifiedValue);

        // preluați o valoare din matrice
        int positionHeight2 = 2;
        int positionWidth2 = 3;
        int receivedValue = handler.getValueFromPosition(positionHeight2, positionWidth2);
        System.out.println("Valoarea la poziția (" + positionHeight2 + ", " + positionWidth2 + ") este: " + receivedValue);
        System.out.println("Matricea este: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(handler.getValueFromPosition(i, j) + " ");
            }
            System.out.println();
        }
    }

}