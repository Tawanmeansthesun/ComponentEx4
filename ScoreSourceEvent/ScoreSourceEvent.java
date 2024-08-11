/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoresourceevent;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ScoreSourceEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource s = new ScoreSource();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        s.addScoreListener(s1);
        s.addScoreListener(s2);
        Scanner sc = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while(!scoreLine.equals("")){
            s.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
        sc.close();
    }     
}
