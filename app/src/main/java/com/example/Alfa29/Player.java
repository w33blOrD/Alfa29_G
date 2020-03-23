package com.example.Alfa29;

public class Player {
    public Cards[] cards;
    public String name;
    public int currentcards;
    Player(){
        cards = new Cards[8];
        currentcards=0;
    }
    Player(String name)
    {
        cards = new Cards[8];
        this.name=name;
        currentcards=0;
    }
    public void insert(Cards card){
        this.cards[currentcards++]=card;
    }
    ///public Cards play(){
        //implement this method for 100 marks
    ///}
}
