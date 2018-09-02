import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    // ***************** In this lesson we are learning about case statements instead of if/else if statements. *****************
    // ***************** Create a translator which converts a user inputted number to a translation in italian. *****************
    // ***********************************************************************************************************
        Scanner user_INPUT = new Scanner(System.in);
        System.out.println("Enter any number 1-10 to get the Italian translation: ");
        int user_PICK = user_INPUT.nextInt(); // from tutorialspoint: The java.util.Scanner.nextInt() method Scans the next token of // the input as an int
        String user_selection;

            switch (user_PICK) {
                case 1: user_selection = "UNO";
                    break;
                case 2: user_selection = "DUE";
                    break;
                case 3: user_selection = "TRE";
                    break;
                case 4: user_selection = "QUATTRO";
                    break;
                case 5: user_selection = "CINQUE";
                    break;
                case 6: user_selection = "SEI";
                    break;
                case 7: user_selection = "SETTE";
                    break;
                case 8: user_selection = "OTTO";
                    break;
                case 9: user_selection = "NOVE";
                    break;
                case 10: user_selection = "DIECE";
                    break;

                default: user_selection = "ERROR, INVALID ENTRY";

            }
            System.out.println(user_PICK + " in Italian is: " + user_selection);
    }
}

