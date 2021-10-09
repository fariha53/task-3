package fariha;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket(String matchType,int over,Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;

    }
    void display(){
        System.out.println("Match type :"+matchType);
        System.out.println("Over of the match :"+over);
        System.out.println("Name of the player :"+player.playerName);
        System.out.println("Jersey number of a player :"+player.jerseyNumber);
    }
}
/*
Name = Fariha Chowdhury
ID = 2012020053
SEC = B
EMAIL = cse_2012020053@lus.ac.bd
DATE = 11.09.21
 */
