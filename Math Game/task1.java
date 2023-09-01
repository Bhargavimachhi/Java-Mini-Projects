import java.util.*;
class task1{
    static int score=0;
    public static void main(String[] args){
        int n1=(int)(Math.random()*100);
        int attempt=1;
        System.out.println("\nWe have generated random number Between 1 to 100");
        System.out.print("Try to guess The number\nYou have 10 Change to Guess the Number");
        System.out.print("\n<--Guess The Number-->");
        Scanner sc=new Scanner(System.in);
        int guess;
        do{
            System.out.print("\nAttempt "+attempt+" :- ");
            guess=sc.nextInt();
            attempt++;
            if(guess==n1){
                System.out.println("Your Guess The correct Number");
                score++;
            }
            else if(guess<n1)
            System.out.println("Your Number is small");
            else
            System.out.println("Your Number is big");
            if(attempt>10){
                System.out.println("\nYou have no chance left to guess\n<--Better Luck Next Time-->");
                System.out.println("Correct Answer was "+n1);
            }
        }while(attempt<=10 && guess!=n1);
        System.out.println("\nPress 1 to Play Again");
        System.out.println("Press Any Other Number to Exit");
        int again=sc.nextInt();
        if(again==1)
        main(args);
        else
        System.out.println("Your Score is "+score);
        sc.close();
    } 
}