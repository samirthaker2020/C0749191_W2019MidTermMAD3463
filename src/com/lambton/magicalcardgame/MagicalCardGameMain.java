package com.lambton.magicalcardgame;
import java.util.*;
public class MagicalCardGameMain {

    public static void main (String args[])
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
       
        String [][]cards = {{"1","9","k"},{"A","7","3"},{"3","6","D"}};
        System.out.println("Please Select Any One::");
        for (int i=0;i<cards.length;i++){
            for (int j=0;j<cards.length;j++){
                System.out.print(cards[i][j]);
                System.out.print(" , ");
            }
            System.out.println(" ");
        }


        magicalCardGameModel.setCardList(cards);
        Scanner scanner = new Scanner(System. in);
        String FirstShuffleColPos = scanner. nextLine();
        magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);
    }
}
