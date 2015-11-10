/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srm672div2;

import java.util.Hashtable;

/**
 *
 * @author mazenbadr
 */
public class SubstitutionCipher {

    public String decode(String a, String b, String x) {
        for (Character c : x.toCharArray()) {
            if (!b.contains(c.toString())) {
                return "";
            }
        }
        Hashtable<Character, Character> permutationTable = new Hashtable<>();
        for (int i = 0; i < b.length(); i++) {
            permutationTable.put(b.charAt(i), a.charAt(i));
        }
        StringBuffer newString = new StringBuffer();
        for (Character c : x.toCharArray()) {
            newString.append(permutationTable.get(c));
        }
        return newString.toString();
    }
}
