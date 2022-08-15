package com.string.programs;

import java.util.Locale;
import java.util.StringTokenizer;

public class StringChars {

    public void CharFind() {
        String str = "Hello Gopi, How Are You?";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void StringTokenMethod(String str) {
        System.out.println("---------- Get words from string using StringTokenizer Class ---------");
        str = "Hello all, how are you?";
        StringTokenizer st = new StringTokenizer(str, ", ");
        while (st.hasMoreElements()) {
            String w = st.nextToken();
            System.out.println(w);
        }
    }

    public void getCharAtPosition() {
        String str = "In the box";
        String w = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("Character at " + i + " is : " + c);
        }
    }

    public void getCharFromString() {
        System.out.println("---------- Q1. Get words from string ---------");
        String string = "In the box";
        String word = "";
        string += " ";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.println(word);
                word = "";
            }
        }
    }

    public void getFirstCharInWord() {
        System.out.println("---------- Q2. Get first character from each word ---------");
        String string = "I want golden shoes for running";
        String word = "";
        string += " ";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.print(word.charAt(0) + " ");
                word = "";
            }
        }
        System.out.println();
    }

    public void getLastCharInWord() {
        System.out.println("---------- Q3. Get last character from each word ---------");
        String string = "I want golden shoes for running";
        String word = "";
        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.print(word.charAt(word.length() - 1));
                word = " ";
            }
        }
        System.out.println();
    }

    public void getFirstTwoCharactersInWord() {
        System.out.println("---------- Q4. Get first two characters from word ----------");
        String str = "In the box";
        String word = "";
        str += " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                System.out.println(word.substring(0, 2));
                word = "";
            }
        }
    }

    public void printWordStartsWith_R() {
        System.out.println("---------- Q5. Print word only starts with R ----------");
        String s = "A RED SEED robin goes grey";
        String w = "";
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                w += c;
            } else {
                if (w.toUpperCase(Locale.ROOT).startsWith("R"))
                    System.out.println(w);
                w = "";
            }
        }
    }

    public void printWordOnlyEndWith_ED() {
        System.out.println("---------- Q6. Print word only ends with ED/ ed ----------");
        String string = "A RED SEED going bed of floor";
        String w = "";
        string += " ";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.toUpperCase(Locale.ROOT).endsWith("ED"))
                    System.out.println(w);
                w = "";
            }
        }
    }

    public void printWordContains_E() {
        System.out.println("---------- Q7. Print word contains E ----------");
        String s = "A RED SEED";
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.contains("E"))
                    System.out.println(w);
                w = "";
            }
        }
    }

    public void printWOrdHavingOnlyThreeChars() {
        System.out.println("---------- Q8. Print word having only three characters ----------");
        String sentence = "A RED SEED got here";
        String word = "";
        sentence += " ";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ')
                word += ch;
            else {
                if (word.toUpperCase().length() == 3)
                    System.out.println(word);
                word = "";
            }
        }
    }

    public void printSpecialWords() {
        System.out.println("----------- Q9. Print special words lower/upper in string -----------");
        String s = "MOM OR DAD also SoOS Lool blahhh! @#@ 20202";
        String w = "";
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                char first = w.toLowerCase().charAt(0);
                char last = w.toLowerCase().charAt(w.length() - 1);
                if (first == last)
                    System.out.println(w);
                w = "";
            }
        }
    }

    public void printLongestWord() {
        System.out.println("----------- Q10. Print longest word in string / sentence -----------");
        String s = "A RED SEED";
        String w = "";
        s += " ";
        String longWord = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.length() > longWord.length())
                    longWord = w;
                w = "";
            }
        }
        System.out.println("Longest Word : " + longWord);
    }

    public String findWordInString() {
        System.out.println("----------- Q11. Find specific word in string / sentence -----------");
        String s = "MOM OR DAD";
        String w = "";
        s += " ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.equalsIgnoreCase("DAD"))   //w.equals also used
                    count++;
                w = "";
            }
        }
        if (count == 0)
            System.out.println("Not found");
        else {
            System.out.println("Found");
        }
        return w;
    }

    public void countNoOfWordsInSentence() {
        System.out.println("----------- Q12. Count no of word in string / sentence -----------");
        String s = "A RED SEED";
        String w = "";
        s += " ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.length() > count) {
                    count++;
                } else {
                    System.out.println("No Words");
                }
            }
        }
        System.out.println("No of Words : " + count);
    }

    public void countWordEndingWith_D() {
        System.out.println("----------- Q13. Count no of word ending with D -----------");
        String s = "A RED SEED";
        String w = "";
        s += " ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.endsWith("D"))
                    count++;
                w = "";
            }
        }
        System.out.println("No of Words ends with D : " + count);
    }

    public void changeWordRED_to_BLUE() {
        System.out.println("");
        System.out.println("********************** STRING PROGRAMS **********************");
        System.out.println("----------- Q14. Change RED with BLUE in a sentence -----------");
        String s = "A RED SEED";
        String w = ""; s += " ";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (w.equals("RED"))
                    ns = ns + "BLUE" + " ";
                else
                    ns = ns + w + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }

    public void deleteWordFromSentence() {
        System.out.println("----------- Q15. Delete word RED from a sentence -----------");
        String s = "A RED SEED";
        String w = ""; s += " "; String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (!w.equals("RED"))
                    ns = ns + w + " ";
                w = "";
            }
        }
        System.out.println("After deleting RED from sentence : " + ns);
    }

    public void changeCaseAlternateWord() {
        System.out.println("----------- Q16. Take sentence and change case of each alternate word -----------");
        String s = "I am going to see Avengers:Endgame this Weekend";
        int count = 0;
        String w = ""; s += " "; String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (count++%2 == 0)
                    ns = ns + w.toLowerCase() + " ";
                else ns = ns + w.toUpperCase() + " ";
                w = " ";
            }
        }
        System.out.println(ns);
    }

    public void capitalEachWordOfSentence() {
        System.out.println("----------- Q17. Capitalize each word from string -----------");
        String s = "a red seed";
        String w = ""; s += " "; String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                char f = w.charAt(0);
                f = Character.toUpperCase(f);
                ns = ns + f + w.substring(1) + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }

    public void swapFirstAndLastLetterOfWord() {
        System.out.println("----------- Q18. Swap first and last letter of each word of a sentence -----------");
        String s = "In the box";
        String w = ""; s += " "; String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                char f = w.charAt(0);
                char l = w.charAt(w.length() - 1);
                String m = w.substring(1, w.length() - 1);
                ns = ns + l + m + f + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }
}