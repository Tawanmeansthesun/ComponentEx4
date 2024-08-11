/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4boundproperty;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Ex4BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean lsb = new LiveScoreBean();
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        lsb.addPropertyChangeListener(s1);
        lsb.addPropertyChangeListener(s2);
        Scanner sc = new Scanner(System.in);
        String scoreLine;
        System.out.print("Enter Score ");
        scoreLine = sc.nextLine();
        while(!scoreLine.equals("")){
            lsb.setScoreLine(scoreLine);
            System.out.print("Enter Score ");
            scoreLine = sc.nextLine();
        }
        sc.close();
    }
    
}
