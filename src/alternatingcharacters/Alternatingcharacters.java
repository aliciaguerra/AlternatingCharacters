package alternatingcharacters;
import java.util.Scanner;
public class Alternatingcharacters{
       public static void main(String[] args) {
/*You can find this on Javadocs by looking up "Scanner.java".*/
              Scanner sc = new Scanner(System.in);
/*We scan in our number of test cases.*/
              int T = sc.nextInt();
/*We loop through the calculations for each test case.*/
              for (int count = 0; count < T; count++) {
/*We scan in the string of characters and store it in a character array.*/
                     char[] characters= sc.next().toCharArray();
                     int AlterCount=0;
/*We're going to loop through all the characters in the character array to see
if they're the same or different than the next character.*/
                     for(int i=0;i<characters.length-1;i++)
                     {
/*If the character is the same as the next character, we increase the number of
deletions by 1.*/
                           if(characters[i]==characters[i+1])
                           {
                                  AlterCount++;
                           }
                         }
/*We print out the number of deletions.*/
                     System.out.println(AlterCount);
/*We close the scanner.*/
              }
              sc.close();
}}
