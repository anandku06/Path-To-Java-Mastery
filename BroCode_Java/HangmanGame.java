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

        sc.close();
    }

    static String getHangamnArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    


                    """;
            case 1 -> """
                      o


                    """;
            case 2 -> """
                      o
                      |  

                    """;
            case 3 -> """
                      o
                     /|  

                    """;
            case 4 -> """
                      o
                     /|\\  

                    """;
            case 5 -> """
                      o
                     /|\\  
                     /   
                    """;
            case 6 -> """
                      o
                     /|\\  
                     / \\   
                    """;
            default -> "";                   
        }
    }
}
