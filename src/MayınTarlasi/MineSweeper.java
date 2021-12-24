package MayınTarlasi;

import java.util.Scanner;

public class MineSweeper {
    int row;
    int column;
    String[][] answerMatrix;
    String[][] gameMatrix;

    int mineNum;
    int mineCount = 0;
    int correctAnswer = 0;

    Scanner input = new Scanner(System.in);

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.answerMatrix = new String[row][column];
        this.gameMatrix = new String[row][column];
        this.mineNum = (row*column)/4; //mayın sayısı toplam elemanın çeyreğine eşittir
    }

    public void drawMatrix(){
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.column; j++){
                this.gameMatrix[i][j] = " - ";
                this.answerMatrix[i][j] = " - ";
            }
        }
    }

    public void createMines(){
        for(int i=0; i<mineNum; i++){
            double rowNum = Math.random() * this.row;
            double colNum = Math.random() * this.column;
            if(this.answerMatrix[(int) rowNum][(int) colNum].equals(" * ")){
                i--;
            }
            this.answerMatrix[(int) rowNum][(int) colNum] = " * ";
        }
    }

    public void showAnswerMatrix(){
        System.out.println("Answer Board For Admin");
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.column; j++){
                System.out.print(this.answerMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void showGameMatrix(){
        System.out.println("Start the Game");
        for(int i=0; i<this.row; i++){
            for(int j=0; j<this.column; j++){
                System.out.print(this.gameMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void checkMine(){
        System.out.println("=============");

        while (correctAnswer != -1){
            showGameMatrix();
            System.out.print("Enter a row number: ");
            int xRow = input.nextInt();

            System.out.print("Enter a column number:");
            int yColumn = input.nextInt();

            if(xRow<0 || yColumn<0 || xRow>=this.row || yColumn>= this.column){
                System.out.println("Please input a valid number");
            }else{
                if(answerMatrix[xRow][yColumn].equals(" * ")){
                    System.out.println("Game Over");
                    correctAnswer = -1;
                    for (int i = 0; i < answerMatrix.length; i++) {
                        for (int j = 0; j < answerMatrix.length; j++) {
                            System.out.print(answerMatrix[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    mineCount = 0;
                    if ((yColumn < this.column - 1) && (answerMatrix[xRow][yColumn + 1].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((yColumn > 0) && (answerMatrix[xRow][yColumn - 1].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow < this.row - 1) && (answerMatrix[xRow + 1][yColumn].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow > 0) && (answerMatrix[xRow - 1][yColumn].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow < this.row - 1) && (yColumn < this.column - 1) && (answerMatrix[xRow + 1][yColumn + 1].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow < this.row - 1) && (yColumn > 0) && (answerMatrix[xRow + 1][yColumn - 1].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow > 0) && (yColumn > 0) && (answerMatrix[xRow - 1][yColumn - 1].equals(" * "))) {
                        correctAnswer++;
                    }
                    if ((xRow > 0) && (yColumn < this.column - 1) && (answerMatrix[xRow - 1][yColumn + 1].equals(" * "))) {
                        correctAnswer++;
                    }
                }
                mineNum--;

                System.out.println("----*----*----");
                String n = Integer.toString(correctAnswer);
                gameMatrix[xRow][yColumn] = n;
                for (int i = 0; i < this.gameMatrix.length; i++) {
                    for (int j = 0; j < this.gameMatrix[i].length; j++) {
                        System.out.print(this.gameMatrix[i][j]);
                    }
                    System.out.println();
                }
                if (mineNum == 0) {
                    System.out.println("YOU WON! CONGRATS!");
                    break;
                }
            }
        }
    }
    void run() {
        drawMatrix();
        createMines();
        showAnswerMatrix();
        checkMine();
    }
}
