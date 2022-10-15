import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        ArrayList <Player> players = main.createPlayers();
        for (Player player : players){
            System.out.println(player);
        }
        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
       // System.out.println("The player 1 name is " + whitePlayer.getName() + " , id " + whitePlayer.getEmail() + "color " + whitePlayer.isWhite() + " rank " + whitePlayer.getRank() + " age " + whitePlayer.getAge() );
       // System.out.println("The player 1 name is " + blackPlayer.getName() + " , id " + blackPlayer.getEmail() + "color " + blackPlayer.isWhite() + " rank " + blackPlayer.getRank() + " age " + blackPlayer.getAge() );
     //   System.out.println(whitePlayer);
   //     System.out.println(blackPlayer);
       // try {
     //       whitePlayer.setRank(10000);
       // }
//        catch (IllegalArgumentException err){
  //          System.out.println("please update rank to valid");
    //    }

      //  try {
        //    whitePlayer.setAge(10);
//        }
  //      catch (IllegalArgumentException err){
    //        System.out.println("please update age to valid");
      //  }


        //blackPlayer.setRank(200);
// 4406 881 933   1513 562 583  
    }
    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Aidar Rysaliev", "rysapre@gmail.com", true, 100, 18);
        Player blackPlayer = new Player("Danis Almazov", "danisalmaz@gmail.com", false, 100, 9);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }
    public HashMap<String, Piece> createPieces(){
        King whiteKing = new King(new Spot("h", 7), "white_king", true );
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("g", 7), "white_rook_1", true);
        Rook whiteRook2 = new Rook(new Spot("a", 7), "white_rook_2", true);
        Knight blackKnight = new Knight(new Spot("d", 6), "black_knight", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight.getId(), blackKing);
        return pieceHashMap;
    }
    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap){
        try {
            players.get(0).movePiece(hashMap.get("white_rook_2"), new Spot("a", 8));

        }catch (IllegalArgumentException error){
            System.out.println("The move is incorrect, please try again!");
        }
        players.get(1).movePiece(hashMap.get("black_knight"), new Spot("c", 8));
    }
}
