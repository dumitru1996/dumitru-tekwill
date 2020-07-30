package module1.homework.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Cells:  ");
        String s = scanner.nextLine();

        return s;
    }

    public static boolean validateInput(String inp){
        int countX = 0;
        int countO = 0;

        for(int i = 0; i<inp.length(); i++){

            if(inp.charAt(i) != 'X' && inp.charAt(i) != 'O' && inp.charAt(i) !='_') {
                System.out.println("String contains values different from X, O or _");
                return false;
            }
            if(inp.charAt(i)=='X'){
                countX++;
            }
            if (inp.charAt(i)=='O'){
                countO++;
            }
        }
        if(Math.abs(countO - countX)>1){
            System.out.println("Impossible!");
            return false;
        }

        return true;
    }

    public static boolean checkRows(char[][] inp, int k){
        char firstCell = inp[k][0];
        for (int i = 1; i < inp.length; i++) {
            if(firstCell!=inp[k][i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumns(char[][] inp, int k){
        char firstCell = inp[0][k];
        for (int i = 1; i < inp.length; i++) {
            if(firstCell!=inp[i][k]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonals(char[][] inp, boolean primary){
        int size = 3;

        if(primary){
            char diagonal = inp[0][0];
            for (int i = 1; i < size; i++) {
                if(diagonal!=inp[i][i]){
                    return false;
                }
            }
        } else {
            char diagonal = inp[0][size-1];
            int i = 1;
            while(i<size){
                if(diagonal!= inp[i][(size-1)-i]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static String checkGameState(char[][]inp){
        boolean isThereAWinner = false;
        char winner = ' ';
        int size = 3;

        for (int i = 0; i < size; i++) {
            boolean isWinner = checkRows(inp, i);
            if(isWinner){
                winner = inp[i][0];
            }
            if(isWinner && isThereAWinner){
                return "Impossible";
            }
            if(isWinner){
                isThereAWinner=true;
            }
            isWinner = checkColumns(inp,i);
            if(isWinner){
                winner = inp[0][i];
            }
            if(isWinner && isThereAWinner){
                return "Impossible";
            }
            if(isWinner){
                isThereAWinner=true;
            }
        }

        boolean isWinner = checkDiagonals(inp,true);
        if(isWinner){
            winner = inp[0][0];
        }
        if(isWinner && isThereAWinner){
            return "Impossible";
        }
        if(isWinner){
            isThereAWinner=true;
        }

        isWinner = checkDiagonals(inp,false);
        if(isWinner){
            winner = inp[0][size-1];
        }
        if(isWinner && isThereAWinner){
            return "Impossible";
        }

        if(winner=='X'){
            return "X wins";
        }
        if(winner=='O'){
            return "O wins";
        }

        for (int i = 0; i <inp.length ; i++) {
            for (int j = 0; j <inp.length ; j++) {
                if (inp[i][j] == '_') {
                    return "Game not finished";
                }
            }
        }

        return "Draw";
    }

    public static void ticTacTOe(){
        String inp = inputString().trim();

        int size = 3;
        int inputVal = 0;
        char[][] out = new char[size][size];

//        Populate out matrix
        if(inp.length()!=9){
            System.out.println("Wrong input size");
            ticTacTOe();
        }else  {
            for (int i = 0; i <size ; i++) {
                for (int j = 0; j <size ; j++) {
                    out[i][j]=inp.charAt(inputVal);
                    inputVal++;
                }
            }
        }

//        Display matrix
        System.out.println("---------");
        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j <size ; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

//        Validate input
        boolean validateInput = validateInput(inp);
        if(!validateInput){
            ticTacTOe();
        }

        System.out.println(checkGameState(out));
    }

    public static void main(String[] args) {
        ticTacTOe();
    }
}