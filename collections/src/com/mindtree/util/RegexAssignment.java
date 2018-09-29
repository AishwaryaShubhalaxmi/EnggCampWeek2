package com.mindtree.util;

import java.util.regex.Pattern;

public class RegexAssignment {
 public static void main(String[] args) {
System.out.println(Pattern.matches("[A-Z]{1}[a-z]{8}", "Aishwarya"));
System.out.println(Pattern.matches("[A-Z]{1}[0-9]{7}", "M1046926"));
System.out.println(Pattern.matches("[a-z]{20}[0-9]{1}[@]{1}[a-z]{5}[.]{1}[a-z]{3}", "aishwaryashubhalaxmi8@gmail.com"));
 System.out.println(Pattern.matches("", ""));
 
 
 
 }
}
