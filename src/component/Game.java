package component;

import model.GameTable;

import java.util.Random;

public class Game {

    private final DataPrinter dataPrinter;
    private final ComputerMove computerMove;
    private final UserMove userMove;
    private final DrawVerifier drawVerifier;
    private final WinnerVerifier winnerVerifier;

    public Game(DataPrinter dataPrinter,
                ComputerMove computerMove,
                UserMove userMove,
                DrawVerifier drawVerifier,
                WinnerVerifier winnerVerifier) {
        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.drawVerifier = drawVerifier;
        this.winnerVerifier = winnerVerifier;
    }

    public void play() {
        System.out.println("тру ля ля");
        //dataPrinter.printMappingTable();

        final GameTable gameTable = new GameTable();

        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }

        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("Ты победил!");
                break;
            }

            if (drawVerifier.isDraw(gameTable)) {
                System.out.println("Ничья!");
                break;
            }

            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("Компьютер победил!");
                break;
            }

            if (drawVerifier.isDraw(gameTable)) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Конец игры");
    }

}
