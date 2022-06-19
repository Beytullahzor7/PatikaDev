package Question1;

import java.util.Scanner;

public class FirstQuestion {
    int row = 10;
    int column = 10;
    int number = 1;
    int correctAnswer = 0;
    int firstRowTemp;
    int firstColumnTemp;
    Integer[][] gameBoard = new Integer[row][column];

    public void drawGameBoard() {
        for (int i = 0; i < this.row; i++) {
            this.gameBoard[i][0] = i + 1;
            System.out.print("  ");
        }
        for (int j = 0; j < this.column; j++) {
            this.gameBoard[0][j] = j + 1;
            System.out.print("  ");
        }
    }

    public void drawGameBoard2() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                this.gameBoard[i][j] = 0;
            }
        }
    }

    public void showGameBoard() {
        System.out.println("Start!");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(this.gameBoard[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void firstDraw() {
        Scanner firstInput = new Scanner(System.in);
        System.out.print("Input a FirstRow Number: ");
        int rowFirst = firstInput.nextInt();
        this.firstRowTemp = rowFirst;

        System.out.print("Input a FirstColumn Number: ");
        int colFirst = firstInput.nextInt();
        this.firstColumnTemp = colFirst;

        if (rowFirst < 0 || colFirst < 0 || rowFirst >= this.row || colFirst >= this.column) {
            System.out.println("Please input a valid number");
        } else {
            this.gameBoard[rowFirst][colFirst] = number;
            number++;
            showGameBoard();
        }
    }

    public void userDraw() {
        try {
            checkStatus(firstRowTemp, firstColumnTemp);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Your Score Is: " + (this.number - 1));
    }

    public void checkStatus(int rowNum, int column) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a way: ");
        System.out.println("1- [rowNum - 3][column]\n" +
                "2- [rowNum + 3][column]\n" +
                "3- [rowNum][column - 3]\n" +
                "4- [rowNum][column + 3]\n" +
                "5- [rowNum - 2][column - 2]\n" +
                "6- [rowNum - 2][column + 2]\n" +
                "7- [rowNum + 2][column + 2]\n" +
                "8- [rowNum + 2][column - 2]\n");

        int choose = input.nextInt();

        switch (choose) {
            case 1:
                if (this.gameBoard[rowNum - 3][column] == 0) {
                    this.gameBoard[rowNum - 3][column] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum - 3, column);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 2:
                if (this.gameBoard[rowNum + 3][column] == 0) {
                    this.gameBoard[rowNum + 3][column] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum + 3, column);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 3:
                if (this.gameBoard[rowNum][column - 3] == 0) {
                    this.gameBoard[rowNum][column - 3] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum, column - 3);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 4:
                if (this.gameBoard[rowNum][column + 3] == 0) {
                    this.gameBoard[rowNum][column + 3] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum, column + 3);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 5:
                if (this.gameBoard[rowNum - 2][column - 2] == 0) {
                    this.gameBoard[rowNum - 2][column - 2] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum - 2, column - 2);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 6:
                if (this.gameBoard[rowNum - 2][column + 2] == 0) {
                    this.gameBoard[rowNum - 2][column + 2] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum - 2, column + 2);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 7:
                if (this.gameBoard[rowNum + 2][column + 2] == 0) {
                    this.gameBoard[rowNum + 2][column + 2] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum + 2, column + 2);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
            case 8:
                if (this.gameBoard[rowNum + 2][column - 2] == 0) {
                    this.gameBoard[rowNum + 2][column - 2] = number;
                    number++;
                    showGameBoard();
                    checkStatus(rowNum + 2, column - 2);
                    break;
                } else {
                    System.out.println("Choose another way!");
                }
        }
    }
}
