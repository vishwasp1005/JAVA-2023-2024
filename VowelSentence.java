//(3) Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences.

import java.util.Scanner;

public class VowelSentence {
    public static void main(String[] args) {
        Sentence s = new Sentence();
        s.checkVowel();
    }
}

class Sentence {
    void checkVowel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence here: ");
        String s1 = sc.nextLine();
        s1.toLowerCase();
        // int count = 0;
        int ac=0,ec=0,ic=0,oc=0,uc = 0;
        // boolean mann = true;

        while (true) {
            if (s1.equals("quit")) {
                break;
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    // char ch = s1.charAt(i);
                    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    //     count++;
                    // }
                    if(s1.charAt(i) == 'a'){
                        ac++;
                    }
                    else if(s1.charAt(i) == 'e'){
                        ec++;
                    }
                    else if(s1.charAt(i) == 'i'){
                        ic++;
                    }
                    else if(s1.charAt(i) == 'o'){
                        oc++;
                    }
                    else if(s1.charAt(i) == 'u'){
                        uc++;
                    }
                }
            }

            System.out.println("There are " + ac + " a in this sentence");
            System.out.println("There are " + ec + " e in this sentence");
            System.out.println("There are " + ic + " i in this sentence");
            System.out.println("There are " + oc + " o in this sentence");
            System.out.println("There are " + uc + " u in this sentence");
        }
        sc.close();
    }
    
}
