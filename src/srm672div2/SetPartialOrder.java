/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srm672div2;

import java.util.HashSet;

/**
 *
 * @author mazenbadr
 */
public class SetPartialOrder {

    public String compareSets(int[] a, int[] b) {
        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        for (int num : a) {
            x.add(num);
        }
        for (int num : b) {
            y.add(num);
        }
        if (x.size() > y.size()) {
            for (Integer num : y) {
                if (!x.contains(num)) {
                    return "INCOMPARABLE";
                }
            }
            return "GREATER";
        } else if (x.size() < y.size()) {
            for (Integer num : x) {
                if (!y.contains(num)) {
                    return "INCOMPARABLE";
                }
            }
            return "LESS";
        } else if (x.size() == y.size()) {
            for (Integer num : x) {
                if (!y.contains(num)) {
                    return "INCOMPARABLE";
                }
            }
            return "EQUAL";
        } else {
            return "INCOMPARABLE";
        }
    }

}
