package com.example.Alfa29;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class linkStart extends AppCompatActivity {
    public Player[] player;
    public boolean[][] cardmark;
    public ImageView cardPics[];
    public int currentBidder;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_link);
        ImageView card1 = findViewById(R.id.card1);
        ImageView card2 = findViewById(R.id.card2);
        ImageView card3 = findViewById(R.id.card3);
        ImageView card4 = findViewById(R.id.card4);
        ImageView card5 = findViewById(R.id.card5);
        ImageView card6 = findViewById(R.id.card6);
        ImageView card7 = findViewById(R.id.card7);
        ImageView card8 = findViewById(R.id.card8);
        player = new Player[4];
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        player[0] = p1;
        player[1] = p2;
        player[2] = p3;
        player[3] = p4;
        currentBidder = 0;
        cardmark = new boolean[4][8];
        cardPics = new ImageView[8];
        cardPics[0] = card1;
        cardPics[1] = card2;
        cardPics[2] = card3;
        cardPics[3] = card4;
        cardPics[4] = card5;
        cardPics[5] = card6;
        cardPics[6] = card7;
        cardPics[7] = card8;
    }
    public static int GetRandomNumber(int min,int max)
    {
       Random random=new Random();
       return random.ints(min,(max+1)).findFirst().getAsInt();
    }
    public int GetSuit(){
       int suit;
       while(true){
           suit=GetRandomNumber(0,3);
           if(!isgiven(suit)){
               break;
           }
       }
       return suit;
    }
    public boolean isgiven(int suit){
       int i;
       for(i=0;i<8;i++){
           if(!cardmark[suit][i]){
               return false;
           }
       }
       return true;
    }
    public int GetCard(int suit){
       int card;
       while(true){
           card = GetRandomNumber(0,7);
           if(!cardmark[suit][card]){
               break;
           }
       }
       cardmark[suit][card]=true;
       return card;
    }
    public void FirstHand(){
       int i,j;
       for(i=0;i<4;i++){
           for(j=0;j<4;j++){
               int suit=GetSuit();
               int number=GetCard(suit);
               Cards card=new Cards(suit,number);
               System.out.println(card.suit+" "+card.number);
               player[i].insert(card);
           }
       }
    }

    public void startBidding(){

    }

    public void dealStart(View view) {
        ConstraintLayout layout = findViewById(R.id.alertLayer);
        layout.setVisibility(View.INVISIBLE);
        FirstHand();
        int k=0;
        for(int i=0;i<4;i++){
            if(player[0].cards[i].suit==0){
                if(player[0].cards[i].number==0){
                    cardPics[k].setImageResource(R.drawable.d11);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==1){
                    cardPics[k].setImageResource(R.drawable.d09);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==2){
                    cardPics[k].setImageResource(R.drawable.d01);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==3){
                    cardPics[k].setImageResource(R.drawable.d10);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==4){
                    cardPics[k].setImageResource(R.drawable.d13);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==5){
                    cardPics[k].setImageResource(R.drawable.d12);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==6){
                    cardPics[k].setImageResource(R.drawable.d08);
                    k++;
                    continue;
                }else if(player[0].cards[i].number==7) {
                    cardPics[k].setImageResource(R.drawable.d07);
                    k++;
                    continue;
                }
            }else if(player[0].cards[i].suit==1){
                    if(player[0].cards[i].number==0){
                        cardPics[k].setImageResource(R.drawable.h11);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==1){
                        cardPics[k].setImageResource(R.drawable.h09);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==2){
                        cardPics[k].setImageResource(R.drawable.h01);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==3){
                        cardPics[k].setImageResource(R.drawable.h10);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==4){
                        cardPics[k].setImageResource(R.drawable.h13);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==5){
                        cardPics[k].setImageResource(R.drawable.h12);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==6){
                        cardPics[k].setImageResource(R.drawable.h08);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==7) {
                        cardPics[k].setImageResource(R.drawable.h07);
                        k++;
                        continue;
                    }
                }else if(player[0].cards[i].suit==2){
                    if(player[0].cards[i].number==0){
                        cardPics[k].setImageResource(R.drawable.c11);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==1){
                        cardPics[k].setImageResource(R.drawable.c09);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==2){
                        cardPics[k].setImageResource(R.drawable.c01);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==3){
                        cardPics[k].setImageResource(R.drawable.c10);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==4){
                        cardPics[k].setImageResource(R.drawable.c13);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==5){
                        cardPics[k].setImageResource(R.drawable.c12);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==6){
                        cardPics[k].setImageResource(R.drawable.c08);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==7) {
                        cardPics[k].setImageResource(R.drawable.c07);
                        k++;
                        continue;
                    }
                }else if(player[0].cards[i].suit==3){
                    if(player[0].cards[i].number==0){
                        cardPics[k].setImageResource(R.drawable.s11);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==1){
                        cardPics[k].setImageResource(R.drawable.s09);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==2){
                        cardPics[k].setImageResource(R.drawable.s01);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==3){
                        cardPics[k].setImageResource(R.drawable.s10);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==4){
                        cardPics[k].setImageResource(R.drawable.s13);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==5){
                        cardPics[k].setImageResource(R.drawable.s12);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==6){
                        cardPics[k].setImageResource(R.drawable.s08);
                        k++;
                        continue;
                    }else if(player[0].cards[i].number==7) {
                        cardPics[k].setImageResource(R.drawable.s07);
                        k++;
                        continue;
                    }
                }
            }
        }
    }
