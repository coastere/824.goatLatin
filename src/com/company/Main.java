package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String S="The quick brown fox jumped over the lazy dog";
        S="HZ sg L a x";
        StringBuilder stringBuilder = new StringBuilder();
        char[] schars = S.toCharArray();
        List<Character> chars = Arrays.asList(new Character[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});
        HashSet<Character> firstletter = new HashSet<>();
        firstletter.addAll(chars);

        int wordi=0;
        boolean newword=true;
        int i=0;
        while( i <S.length() ) {
            if (newword) {
                newword=false;
                wordi++;
                char c = schars[i];
                if (!firstletter.contains(c)) {
                    if (i < S.length() - 1) {
                        i++;
                        char r = schars[i];
                        while (i < S.length() && schars[i] != ' ') {
                            r = schars[i];
                            stringBuilder.append(r);
                            i++;
                        }
                    }
                    stringBuilder.append(c);

                } else {
                    while ( i < S.length() && schars[i] != ' ') {
                        char r = schars[i];
                        stringBuilder.append(r);
                        i++;
                    }
                }
                stringBuilder.append("ma");
                for (int j = 0; j <wordi ; j++) {
                    stringBuilder.append("a");
                }
                i++;
                newword=true;
                if(i<S.length()) stringBuilder.append(' ');

            }
        }
        System.out.println(stringBuilder.toString());


    }

}
