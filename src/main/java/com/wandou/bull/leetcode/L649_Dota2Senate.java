package com.wandou.bull.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liming
 * @date 2020/12/11
 * @description
 */
public class L649_Dota2Senate {

    public static void main(String[] args) {
        String senate = "RD";
        String senate1 = "RDD";

        String target = new L649_Dota2Senate().predictPartyVictory(senate);
        System.out.println("target = " + target);
        String target1 = new L649_Dota2Senate().predictPartyVictory(senate1);
        System.out.println("target1 = " + target1);
    }

    public String predictPartyVictory(String senate) {
        int len = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                radiant.offer(r + len);
            } else {
                dire.offer(d + len);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
