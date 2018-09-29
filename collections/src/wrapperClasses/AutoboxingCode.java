package wrapperClasses;

import java.util.regex.Pattern;

public class AutoboxingCode {
public static void main(String args[]) {
 /* int a=10;                         //Autoboxing 
  Integer j=Integer.valueOf(a);
  System.out.println(j);
  
  Integer b=30;   //Unboxing
  int i=b.intValue();
  System.out.println(i);
  */
  System.out.println(Pattern.matches("[amn]?", "amn"));
  
}
}
