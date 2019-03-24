public class Palindrome {			
private static boolean isPalindrome ( String string ) { 
       if(string.equalsIgnoreCase(StringUtils.reverse(string)))
           return true;
       else
           return false;
       
   }
   public static void palindromes ( String string ) { 
       System . out . println ("\nStarting palindromes\n" ) ; 
       String[] split = string.split("\\.");
       for(String s:split)
       {
           String newstr = s.replaceAll("[^A-Za-z0-9]+", "");
           if(isPalindrome(newstr))
           {
            System . out . println ("\""+s+"\""+" is a palindrome" ) ; 

           }
           else
               System . out . println ("\""+s+"\""+" is not a palindrome" ) ; 
       }
   }						
						
public static void main (String  [  ] args ){	
String input ="a. 0110. madam .  Call  it  a  day.  nURSes ,  RUN !!!."+ "	A	man ,  a  plan ,  a  canal ,  Panama.  Was  it  a  car  or  a  cat  "+ "	I	saw.  No  ’x’  in  Nixon.  Break  a	leg.	Was  it  Eliot ’s  "+ "toilet  I  saw?" ;					
palindromes(input);						
}						
}	

