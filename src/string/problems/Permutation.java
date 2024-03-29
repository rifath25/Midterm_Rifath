package string.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String string = "ABC";
        System.out.println("String " + string + " Permutations: " + conceptPermutation(string));

    }



    public static Set<String> conceptPermutation(String str) {

        Set<String> permutation = new HashSet<String>();

        if (str == null) {

            return null;

        } else if (str.length() == 0) {

            permutation.add("");

            return permutation;

        }



        char firstChar = str.charAt(0);

        String rem = str.substring(1);

        Set<String> words = conceptPermutation(rem);

        for (String newString : words) {

            for (int i = 0; i <= newString.length(); i++) {

                permutation.add(permutationCharAdd(newString, firstChar, i));

            }

        }

        return permutation;

    }



    public static String permutationCharAdd(String str, char c, int j) {

        String first = str.substring(0, j);

        String last = str.substring(j);

        return first + c + last;

    }



}

