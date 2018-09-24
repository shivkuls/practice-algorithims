import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class imcCodility {
    public String solution(int N, String S, String T){
        if(N==0)
            return "invalid";

        char[] shipPlacements = S.toCharArray();
        char[] allHits = T.toCharArray();

        List<Integer> ships = new ArrayList<>();
        List<Integer> hits = new ArrayList<>();

        HashMap<Character,Integer>  map = new HashMap<>();
        map.put('A',1);

        for(int i=0;i<shipPlacements.length;i++){
            for(int j = i+1;j<shipPlacements.length;j++){
                if(shipPlacements[i]!=',' && shipPlacements[j]!=',' && Integer.valueOf(shipPlacements[i]) instanceof Integer &&
                        Character.isAlphabetic(shipPlacements[j])){
                    String s = "";
                    s = s + shipPlacements[i];
                    int x = Integer.getInteger(s);
                    int y = map.get(shipPlacements[j]);
                    ships.add(x);
                    ships.add(y);
                    s = "";
                }
            }
        }
        char[][] board = new char[N][N];
        for (int i = 0; i < ships.size(); i++) {
            for(int j = 0; j < ships.size();j++){
                board[i][j] = 'x';
                if(board[i+1][j+1] == 'x' ){
                    board[i][j+1] = 'x';
                    board[i+1][j] = 'x';
                }
                else if(board[i-1][j-1]=='x'){
                    board[i-1][j] = 'x';
                    board[i][j+1] = 'x';
                }
                else if(board[i][j+2] == 'x' ){
                    board[i][j+1] = 'x';
                }
                else if(board[i][j-2] =='x'){
                    board[i][j-1] = 'x';
                }
                else if(board[i-2][j] == 'x' ){
                    board[i-1][j] = 'x';
                }
                else if(board[i+2][j] == 'x'){
                    board[i+1][j] = 'x';
                }
            }
        }
        int hit=0;
        int sunk=0;
        for(int i=0;i<allHits.length;i++){
            for(int j = i+1;j<allHits.length;j++){
                if(allHits[i]!=',' && allHits[j]!=',' && Integer.valueOf(allHits[i]) instanceof Integer &&
                        Character.isAlphabetic(allHits[j])){
                    String s = "";
                    s = s + allHits[i];
                    int x = Integer.getInteger(s);
                    int y = map.get(allHits[j]);
                    hits.add(x);
                    hits.add(y);
                    s = "";
                }
            }
        }

        for (int i = 0; i < hits.size(); i++) {
            for(int j = 0; j < hits.size();j++){
                if(board[i][j] == 'x') {
                    board[i][j] = 'A';
                    hit++;
                    if((board[i][j]=='A' && board[i+1][j+1]=='A' && board[i+1][j]=='A'&& board[i][j+1]=='A') ||
                            (board[i][j]=='A' && board[i-1][j-1]=='A' && board[i-1][j]=='A'&& board[i][j-1]=='A') ||
                            (board[i][j]=='A' && board[i+2][j]=='A' && board[i+1][j]=='A') ||
                            (board[i][j]=='A' && board[i-2][j]=='A' && board[i-1][j]=='A')){
                        sunk++;
                    }
                }
            }
        }
        String solution ="";
        solution = solution + hit + sunk;

        return solution;
    }
}
