import java.util.ArrayList;
import java.util.Scanner;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class Grade {
 
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> scores;
    int[] grades;
 
    public Grade(Scanner reader) {
        this.grades = new int[6];
        scores = new ArrayList<Integer>();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 0;
        }
 
    }
 
    public void getScores() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
 
            if (score == -1) {
                break;
            }
        }
 
    }
 
    public int grader(int score) {
 
        if (score <= 29) {
            return 0;
        }
 
        if (score <= 34) {
            return 1;
        }
        if (score <= 39) {
            return 2;
        }
 
        if (score <= 44) {
            return 3;
        }
 
        if (score <= 49) {
            return 4;
        }
 
        return 5;
 
    }
 
    public void gradeGiver() {
        for (Integer score : scores) {
            int grade = grader(score);
            for (int i = 0; i < grades.length; i++) {
                if (grade == i) {
                    this.grades[i]++;
                }
            }
 
        }
    }
 
    public void gradePrint() {
 
        System.out.println("Grade distribution:");
 
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
 
            System.out.println("");
        }
 
        System.out.println("Acceptance Percentage: " + accPercentage());
    }
     
    public double accPercentage(){
         
        double numOfScores = scores.size()-grades[0];
        
         
        return numOfScores*100/scores.size();
         
    }
}