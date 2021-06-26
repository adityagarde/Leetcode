package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0929 {

    public static class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> strSet = new HashSet<>();
            for (String email : emails) {
                StringBuilder sbr = new StringBuilder(email);
                for (int i = 0; i < sbr.length(); i++) {
                    if (sbr.charAt(i) == '+')
                        sbr.delete(i, sbr.indexOf("@"));
                    else if (sbr.charAt(i) == '.') {
                        sbr.deleteCharAt(i);
                    }
                    if (sbr.charAt(i) == '@')
                        break;
                }
                strSet.add(sbr.toString());
            }
            return strSet.size();
        }
    }

    public static class Solution_1 {
        public int numUniqueEmails(String[] emails) {
            Set<String> strSet = new HashSet<>();
            for (int i = 0; i < emails.length; i++) {
                emails[i] = emails[i].contains("+") ? emails[i].substring(0, emails[i].indexOf('+')) + emails[i].substring(emails[i].indexOf('@')) : emails[i];
                emails[i] = String.join("", emails[i].substring(0, emails[i].indexOf('@')).split("\\.")) + emails[i].substring(emails[i].indexOf('@'));
                strSet.add(emails[i]);
            }
            return strSet.size();
        }
    }
}
