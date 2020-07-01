package jatek;

public class TicTacToe {

    public int boardWidth() {
        return 3;
    }


    public int boardHeight() {
        return 3;
    }

    public int boardSize() {
        return boardWidth() * boardHeight();
    }

    public char[][] table = new char[boardWidth()][boardHeight()];
    public int count = 0;

    public int freeFields() {
        return boardSize()-count;
    }

    public boolean isFree(int x, int y) {
        return table[x][y] == '\0';
    }

    public boolean put(int x, int y, char symbol) {
        if (isFree(x,y)){
            if (count % 2 == 0 && symbol == 'X'){
                count++;
                table[x][y] = 'X';
                return true;
            }else if(count % 2 == 1 && symbol == 'O') {
                count++;
                table[x][y] = 'O';
                return true;
            }
        }
        return false;
    }

    public char getWinner() {
        //függöleges
        for (int x = 0; x < boardWidth(); x++){
            int countX = 0;
            int countO = 0;
            for (int y = 0; y < boardHeight(); y++){
                if (table[x][y] == 'X'){
                    countX++;
                }else if (table[x][y] == 'O'){
                    countO++;
                }
            }
            if (countX == 3){ return 'X'; }
            else if (countO == 3) { return 'O'; }
        }
        //vízszintes
        for (int y = 0; y < boardHeight(); y++){
            int countX = 0;
            int countO = 0;
            for (int x = 0; x < boardWidth(); x++){
                if (table[x][y] == 'X'){
                    countX++;
                }else if (table[x][y] == 'O'){
                    countO++;
                }
            }
            if (countX == 3){ return 'X'; }
            else if (countO == 3) { return 'O'; }
        }
        //átlós
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < 3; i++){
            if (table[i][i] == 'X'){
                countX++;
            }else if (table[i][i] == 'O'){
                countO++;
            }
        }
        if (countX == 3){ return 'X'; }
        else if (countO == 3) { return 'O'; }

        return '\0';
    }
}
