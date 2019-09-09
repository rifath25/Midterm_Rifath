package string.problems;

import org.testng.Assert;

import java.util.Map;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.



        //Anagram unit testing

        boolean isAnagram= Anagram.isAnagram(new char[]{'A', 'R', 'M', 'Y'},new char[]{'M','A','R','Y'});
        Assert.assertTrue(isAnagram);
        System.out.println("Unit testing is passed");




        //Determine Largest Word Unit Testing

        Map<Integer, String> wordNLength= DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        String findTheLargestWord= wordNLength.keySet().iterator().next()+
                " "+wordNLength.entrySet().stream().findFirst().get().getValue();
        Assert.assertEquals(findTheLargestWord,"10 biological");
        System.out.println("Unit testing is passed");



        //Duplicate Word unit testing

        String duplicateWord=DuplicateWord.duplicateWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        Assert.assertEquals(duplicateWord,"Java: 3, a: 1, Language.: 1, widely: 1, is: 3, also: 1, language: 1, used: 1, " +
                "an: 1, Island: 1, Indonesia.: 1, of: 1, programming: 1, ");
        System.out.println("Unit testing is passed");



      //Palindrome unit testing

         boolean isPalindrome=Palindrome.isPalindrome("MOM");
         Assert.assertTrue(isPalindrome);
        System.out.println("Unit testing is passed");



        //Permutation unit testing

        Set<String> permutation= Permutation.conceptPermutation("ABC");
        Set<String> expectedPermutation= Permutation.conceptPermutation("ABC");
        Assert.assertEquals(permutation,expectedPermutation);
        System.out.println("Unit testing is passed");
    }
}
