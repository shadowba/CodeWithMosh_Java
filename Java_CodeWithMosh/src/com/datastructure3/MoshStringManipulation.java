package com.datastructure3;

import com.datastructure.Array;

import java.util.*;

public class MoshStringManipulation {
    public static int findNumOfVowels(String str) {
        if (str == null)
            return 0;

        String vowels = "aeiou";
        int i = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(Character.toString(ch)) != -1)
                i++;
        }
        return i;
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);

//        StringBuilder reversed=new StringBuilder();
//        for(int i=words.length-1;i>=0;i--)
//            reversed.append(words[i]+" ");
//
//        return reversed.toString().trim();
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null)
            return false;

        if (str1.length() != str1.length())
            return false;

        return (str1 + str2).contains(str2) ? true : false;

    }

    public static String removeDulicates(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static char getMaxOccuringChar(String str) {
//        Map<Character, Integer> frequencies = new HashMap<>();
//        for (var ch : str.toCharArray()) {
//            if (frequencies.containsKey(ch))
//                frequencies.replace(ch, frequencies.get(ch) + 1);
//            else
//                frequencies.put(ch, 1);
//        }
        if (str.isEmpty() || str == null)
            throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (var ch : str.toCharArray())
            frequencies[ch]++;

        int max = 0;
        char result = ' ';
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static String capitalize(String sentence) {
        if (sentence.trim() == "" || sentence == null)
            return "";

        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");
        for (var i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null)
            return false;

        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (int i = 0; i < first.length(); i++) {
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();
        int index = 0;
        for (int i = 0; i < second.length(); i++) {
            index = second.charAt(i) - 'a';
            if (frequencies[index] == 0)
                return false;

            frequencies[index]--;
        }

        return true;
    }

    public static boolean isPalindrome(String word) {
        if (word == null)
            return false;

        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }
        return true;
    }
}
