import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String word = "Pizza";

        Scanner sc = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        System.out.println("Welcome to JavaHangMan!!");

        while (wrongGuesses <= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();
        
            System.out.print("Enter your guess -> ");
            char guess = sc.next().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct Guess");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess); // Replaces the element at the specified position in this list with the specified element
                    }
                }
            }
            else{
                wrongGuesses++;
                System.out.println("Wrong Guess!!");
            }
        }

        if(wrongGuesses > 6){
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game Over!!");
            System.out.println("The word was " + word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 6 -> """



                    """;
            case 5 -> """
                      o


                    """;
            case 4 -> """
                      o
                      |

                    """;
            case 3 -> """
                      o
                     /|

                    """;
            case 2 -> """
                      o
                     /|\\

                    """;
            case 1 -> """
                      o
                     /|\\
                     /
                    """;
            case 0 -> """
                      o
                     /|\\
                     / \\
                    """;
            default -> "";
        };
    }
}
