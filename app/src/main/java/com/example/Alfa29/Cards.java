package com.example.Alfa29;

public class Cards {
    public int suit;
    public  int number;
    public boolean isPlayed;
    Cards(){
        this.suit=0;
        this.number=0;
        this.isPlayed=false;
    }
    Cards(int suit,int number) {
        this.suit = suit;
        this.number = number;
        isPlayed = false;
    }
}
