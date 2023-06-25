public class Battleship {
    int [][] computerBoard = new int[3][3];
    int [][] userBoard = new int[3][3];
    

    public void computerShipGrid() {
        int row = (int)Math.floor(Math.random() * (2 - 0 + 1) + 1);
        int col = (int)Math.floor(Math.random() * (2 - 0 + 1) + 1);
        computerBoard[row-1][col-1]=1;
    }

    public void userShipGrid(String row, int col) {
        switch(row){
            case "a":
                userBoard[0][col-1]=1;
            case "b":
                userBoard[1][col-1]=1;
            case "c":
                userBoard[2][col-1]=1;
        }
    }

    public boolean userFire(String row, int col) {
        switch(row){
            case "a":
                return computerBoard[0][col-1]==1;
            case "b":
                return computerBoard[1][col-1]==1;
            case "c":
                return computerBoard[2][col-1]==1;
            default:
                return false;
        }
    }

    public boolean computerFire() {
        int row = (int)Math.floor(Math.random() * (2 - 0 + 1) + 1);
        int col = (int)Math.floor(Math.random() * (2 - 0 + 1) + 1);

        return userBoard[row-1][col-1]==1;
    }

    public void resetGame() {
        for(int i=0;i<computerBoard.length;i++){
            for(int x=0;x<computerBoard.length;x++){
                computerBoard[i][x]=0;
            }
        }
        for(int i=0;i<userBoard.length;i++){
            for(int x=0;x<userBoard.length;x++){
                userBoard[i][x]=0;
            }
        }
    }
}
