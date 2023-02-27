package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * Această metodă calculează suma dintre x ridicat la puterea a-5a si y ridicat la putearea a-7a.
     * @return Returnează rezultatul calculat.
     * @throws IOException Aruncă excepție dacă datele introduse nu au formatul corect.
     */
    public double calculateX5PlusY7() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduceți o valoare pentru X:");
        double x;
        try {
            x = Double.parseDouble(reader.readLine());
            if (x <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            throw new IOException("Introducere nevalidă pentru X. Vă rugăm să introduceți un număr pozitiv.");
        }

        System.out.println("Introduceți o valoare pentru Y:");
        double y;
        try {
            y = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException("Introducere nevalidă pentru Y. Vă rugăm să introduceți un număr valid.");
        }

        double x5 = power(x, 5);
        double y7 = power(y, 7);

        return x5 + y7;
    }

    /**
     * Calculează puterea unui număr.
     * @param base baza.
     * @param exponent exponentul.
     * @return rezultatul calculului.
     */
    private double power(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
