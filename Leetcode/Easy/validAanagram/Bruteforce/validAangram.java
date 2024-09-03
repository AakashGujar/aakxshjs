// 242. Valid Anagram
// Solved
// Easy
// Topics
// Companies
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?


import java.util.*;
class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char sChar[] = s.toCharArray();
        char tChar[] = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        if (Arrays.equals(sChar, tChar)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s,t);
    }
}