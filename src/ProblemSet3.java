/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
       // ps.sign();          // executes Exercise 1
        //ps.parity();        // executes Exercise 2
       // ps.ordered();       // executes Exercise 3
        //ps.gpa();           // executes Exercise 4
        //ps.grade();         // executes Exercise 5
         ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        // ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.  
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {

        System.out.print("\nEnter an integer:  ");
        int number = in.nextInt();

        if(number < 0){
            System.out.println("\nNegative.");
        }else if(number > 0){
            System.out.println("\nPositive.");
        }else{
            System.out.println("\nZero.");
        }

    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {

        System.out.print("\nEnter an integer: ");
        int number = in.nextInt();

        if(number % 2 == 0){
            System.out.println("\nEven.");
        }else{
            System.out.println("\nOdd.");
        }

    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
        System.out.println("Enter three integers");

        System.out.print("\nEnter integer: ");
        int first = in.nextInt();
        System.out.print("Enter integer: ");
        int second = in.nextInt();
        System.out.print("Enter integer: ");
        int third = in.nextInt();

        if((first < second) && (second < third)){
            System.out.print("\nStrictly increasing.");
        }else if((first > second) && (second > third) ){
            System.out.print("\nStrictly decreasing.");
        }else if((first <= second) && (second <= third)){
            System.out.print("\nIncreasing.");
        }else if((first >= second) && (second >= first)){
            System.out.print("\nDecreasing.");
        }else{
            System.out.print("\nUnordered");
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt t he user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
        System.out.print("\nEnter a letter grade: ");
        String input = in.next();
        
        char letter = input.charAt(0);


        final double A = 4.00;
        final double B = 3.00;
        final double C = 2.00;
        final double D = 1.00;
        final double F = 0;
        final double EXTRA = 0.33;
        
        double grade = 0;

        switch (letter){
            case 'A':
                grade = A;
                break;
            case 'B':
                grade = B;
                break;
            case 'C':
                grade = C;
                break;
            case 'D':
                grade = D;
                break;
            case 'F':
                grade = F;
                break;
            default:
                System.out.print("\nInvalid input");                     
        }
        

        grade += (input.contains("+") && !input.contains("A+") && !input.contains("F+"))? EXTRA : 0;
        grade -= (input.contains("-") && !input.contains("F-")) ? EXTRA : 0;
            
        System.out.print("\nYour GPA is " + grade + ".\n");
        
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
        System.out.print("\nEnter a grade: ");
        int input = in.nextInt();
        String error;

        final int GRADE_A_PLUS = 100;
        final int GRADE_A = 90;
        final int GRADE_B = 80;
        final int GRADE_C = 70;
        final int GRADE_D = 60;
        final int GRADE_F = 0;

        if(input >= GRADE_A && input <= GRADE_A_PLUS){
            System.out.println("\nYou received an A.");
        }else if(input >= GRADE_B && input < GRADE_A){
            System.out.println("\nYou received a B.");
        }else if(input >= GRADE_C && input < GRADE_B){
            System.out.println("\nYou received a C.");
        }else if(input >= GRADE_D && input < GRADE_C ){
            System.out.println("\nYou received a D.");
        }else if(input >= GRADE_F && input < GRADE_D){
            System.out.println("\nYou received an F.");
        }else{
            error = (input > 100) 
            ? "\nGrades above 100 are invalid."
            : "\nGrades below 0 are invalid.";
            
            System.out.print(error);
        }       
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {
        System.out.print("\nEnter a card: ");

        String input = in.next();
        String cardRank = null;
        String cardSuit = null;

        char rank = input.charAt(0);
        char suit = input.charAt(1);

        switch(rank){
            case 'A': 
                cardRank = "Ace";
                break;
            case '2':
                cardRank = "Two";
                break;
            case '3':
                cardRank = "Three";
                break;
            case '4': 
                cardRank = "Four";
                break;
            case '5':
                cardRank = "Five";
                break;
            case '6':
                cardRank = "Six";
                break;
            case '7':
                cardRank = "Seven";
                break;
            case '8': 
                cardRank = "Eight";
                break;
            case '9':
                cardRank = "Nine";
                break;
            case 'T':
                cardRank = "Ten";
                break;
            case 'J':
                cardRank = "Jack";
                break;
            case 'Q':
                cardRank = "Queen";
                break;
            case 'K':
                cardRank = "King";
                break;
            default: 
                System.out.println("\nThat's not a valid rank");            
        }
        switch(suit){
            case 'C':
                cardSuit = "Clubs";
                break;
            case 'D':
                cardSuit = "Diamonds";
                break;
            case 'H':
                cardSuit = "Hearts";
                break;
            case 'S':
                cardSuit = "Spades";
                break;
            default:
                System.out.println("\nThat's not a valid suit.");
                break;
        }

        if(cardRank != null && cardSuit != null){
            System.out.println("\n" + cardRank + " of " + cardSuit + ".");          
        }
     

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
        System.out.println("Enter a year: ");

        int year = in.nextInt();

        

    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {

    }
}