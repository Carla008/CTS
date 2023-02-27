package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixDataHandler {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;

    public MatrixDataHandler(int height, int width, String filename) throws IOException {
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][width];
        saveMatrixToFile();
    }

    public int getValueFromPosition(int positionHeight, int positionWidth) throws IOException {
        readMatrixFromFile();
        return matrix[positionHeight][positionWidth];
    }

    public void modifyValueAndUpdateFile(int positionHeight, int positionWidth, int value) throws IOException {
        readMatrixFromFile();
        matrix[positionHeight][positionWidth] = value;
        saveMatrixToFile();
    }

    private void saveMatrixToFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            writeMatrixDimensions(fileWriter);
            writeMatrixElements(fileWriter);
        } catch (IOException e) {
            System.err.println("Eroare la salvarea matricei în fișier: " + e.getMessage());
            throw e;
        }
    }

    private void writeMatrixDimensions(FileWriter fileWriter) throws IOException {
        fileWriter.write(height + " " + width + "\n");
    }

    private void writeMatrixElements(FileWriter fileWriter) throws IOException {
        for (int[] row : matrix) {
            for (int element : row) {
                fileWriter.write(element + " ");
            }
            fileWriter.write("\n");
        }
    }

    private void readMatrixFromFile() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            readMatrixDimensions(bufferedReader.readLine());
            readMatrixElements(bufferedReader);
        } catch (IOException e) {
            System.err.println("Eroare la citirea matricei din fișier: " + e.getMessage());
            throw e;
        }
    }

    private void readMatrixDimensions(String firstLine) throws IOException {
        try {
            String[] dimensionTokens = firstLine.split(" ");
            height = Integer.parseInt(dimensionTokens[0]);
            width = Integer.parseInt(dimensionTokens[1]);
            matrix = new int[height][width];
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.err.println("Eroare la citirea dimensiunilor matricei din fișier: " + e.getMessage());
            throw new IOException("Dimensiuni ale matricei nevalide");
        }
    }

    private void readMatrixElements(BufferedReader bufferedReader) throws IOException {
        for (int i = 0; i < height; i++) {
            String[] rowTokens = bufferedReader.readLine().split(" ");
            for (int j = 0; j < width; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(rowTokens[j]);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.err.println("Eroare la citirea elementului matricei din fișier: " + e.getMessage());
                    throw new IOException("Element de matrice nevalid");
                }
            }
        }
    }
}
