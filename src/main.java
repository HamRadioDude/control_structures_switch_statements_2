import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    // ***************** In this lesson we are learning about case statements instead of if/else if statements. *****************
    // ***************** Create a translator which converts a user inputted number to a translation in italian. *****************
    // ***********************************************************************************************************
        Scanner user_INPUT = new Scanner(System.in);
        System.out.println("Enter any number 1-10 to get the Italian translation: ");
        int user_PICK = user_INPUT.nextInt(); // from tutorialspoint: The java.util.Scanner.nextInt() method Scans the next token of
                                              // the input as an int
       // SK - 09/02/2017 - Really right here, in future development, I need to make sure the input nextint is actually a number.. if not, it would prompt an error.

        if (user_PICK > 0 && user_PICK <= 10) {
            switch (user_PICK) {
                case 1:
                    System.out.println(user_PICK + " in Italian is: UNO ");
                    break;
                case 2:
                    System.out.println(user_PICK + " in Italian is: DUE ");
                    break;
                case 3:
                    System.out.println(user_PICK + " in Italian is: TRE ");
                    break;
                case 4:
                    System.out.println(user_PICK + " in Italian is: QUATTRO ");
                    break;
                case 5:
                    System.out.println(user_PICK + " in Italian is: CINQUE ");
                    break;
                case 6:
                    System.out.println(user_PICK + " in Italian is: SEI ");
                    break;
                case 7:
                    System.out.println(user_PICK + " in Italian is: SETTE ");
                    break;
                case 8:
                    System.out.println(user_PICK + " in Italian is: OTTO ");
                    break;
                case 9:
                    System.out.println(user_PICK + " in Italian is: NOVE ");
                    break;
                case 10:
                    System.out.println(user_PICK + " in Italian is: DIECI ");
                    break;
            }
        } else
            System.out.println("You did not enter a number 1 - 10");
    }
}

