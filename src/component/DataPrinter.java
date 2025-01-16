package component;

import model.Cell;
import model.GameTable;

public class DataPrinter {

    public void printMappingTable() {

        System.out.println("   a   b   c   d   e   f   g   h  ");
        System.out.println(" ---------------------------------");
        System.out.println("1|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("2|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("3|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("4|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("5|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("6|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("7|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");
        System.out.println("8|   |   |   |   |   |   |   |   |");
        System.out.println(" ---------------------------------");

    }

    public void printGameTable(GameTable gameTable) {

        System.out.println("   a   b   c   d   e   f   g   h  ");
        for (int i = 0; i < 8; i++) {
            System.out.println(" ---------------------------------");
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < 8; j++) {
                System.out.print(gameTable.getSign(new Cell(i, j)) + " | ");
            }
            System.out.println();

        }
        System.out.println(" ---------------------------------");

    }
}
