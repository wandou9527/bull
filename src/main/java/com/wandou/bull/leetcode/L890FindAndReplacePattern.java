package com.wandou.bull.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liming
 * @date 2022/6/12 21:05
 */
public class L890FindAndReplacePattern {

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> list = new L890FindAndReplacePattern().findAndReplacePattern(words, pattern);
        System.out.println("list = " + list);
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (match(word, pattern) && match(pattern, word)) {
                ans.add(word);
            }
        }
        return ans;
    }

    private boolean match(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            char y = pattern.charAt(i);
            if (!map.containsKey(x)) {
                map.put(x, y);
            } else {
                if (map.get(x) != y) {
                    return false;
                }
            }
        }
        return true;
    }
}
