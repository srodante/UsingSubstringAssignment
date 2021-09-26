import java.util.Scanner;

public class UsingSubstringAssignment {
    public static void main (String[]args){
/* Have the user enter a string and then an index
   The program will display the length of the string
   and then print the characters back from 0 to the index provided.
 */
    //Setup the keyboard
    Scanner kybd = new Scanner(System.in);

    //Declare the variables
    String answer;
    Integer index;

    //Ask user for the string and an index
    System.out.print("Enter a word: ");
    answer =  kybd.nextLine();
    System.out.print("Enter a number as an index: ");
    index = kybd.nextInt();

    //Display the input and results
    System.out.println("You entered:\n" + answer + "\nAn index of: " + index);
    System.out.println("The length of " + answer + " is: " + answer.length());
//    System.out.println("The substring from 0 to " + index + " is: " +
//            answer.substring(0,index));

    //Play with the if statement
    if (index > answer.length()) {
        System.out.println("Invalid index entered. Index must be less then or " +
                "equal to: " + answer.length());}
    else{
        System.out.println("The substring from 0 to " + index + " is: " +
                answer.substring(0,index));
        }
    }

}
