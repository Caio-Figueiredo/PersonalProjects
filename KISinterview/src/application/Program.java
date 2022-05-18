package application;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        String stem = null;
        String prefix = null;
        int val = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("-->");
        String userInput = sc.nextLine();
        String[] result = new String[userInput.length()];


        //This part looks for spaces and commas to split the different parts of the phrase
        //And them it stores it in a result variable to reuse it
        for (int x = 0; x < userInput.length(); x++) {
            if (userInput.charAt(x) == ' ') {
                result = userInput.split(" ");
                val = 1;
            } else if (userInput.charAt(x) == ',') {
                result = userInput.split(", ");
                val = 1;
            }
        }

        if (val == 0) {
            result = new String[1];
            result[0] = userInput;
        }




            //This part is responsible for recognizing a vowel and them separate the word into stem and prefix
            //So it stores stem and prefix in some pre declared variables to show it
            for (String wordN : result) {
                    for (int i = 0; i < wordN.length(); i++) {
                        if (wordN.charAt(i) == 'a' || 'i' == wordN.charAt(i) || 'e' == wordN.charAt(i) || 'y' == wordN.charAt(i) || 'o' == wordN.charAt(i) || 'u' == wordN.charAt(i)) {
                            stem = wordN.substring(i);
                            prefix = wordN.substring(0, i);
                            break;
                        }
                    }
                word.add(stem + prefix + "ay");
                }


            System.out.print(word);

            sc.close();
        }
    }




