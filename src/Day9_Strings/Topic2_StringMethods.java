package Day9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {
        String str = "Something";
        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */

        //charAt()	          Returns the character at the specified index (position)	        char

        String str1 = "Tanya"; // T ==> 0 , a ==> 1 , n ==> 2 , y ==> 3 , a==> 4
        char ch = str1.charAt(0);
        System.out.println("The Char at the position 0 ( or index 0): "+ch);
        System.out.println("The char at the position 2( or index 2): "+str1.charAt(2));

       // concat()	          Appends a string to the end of another string	                    String

        String FirstName = "Ziya";
        String LastName = "Yilmaz";
        String FullName= FirstName.concat(" "+LastName); // (str:" " is to give it a space in between a name.
        System.out.println("The Full Name is: "+FullName);

        //contains()	          Checks whether a string contains a sequence of characters	        boolean

        String str3 = "This is a Test";
        boolean con = str3.contains("Test"); //this checks see if that paragraph or word is contain any of testOR etc.
        System.out.println("Contains the test: "+con);

    //endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
        String str4 = "This is the String";
        boolean ends = str4.endsWith("String"); // this checks what the end doesnt matter what you put.
        System.out.println("Does String ends with ing: "+ends);

        //          equals()	          Compares two strings. Returns true if the strings are equal,
         //                                 and false if not	                                          boolean

        String str5 = "Hello";
        String str6 = "Hello";
        boolean eq = str5.equals(str6);
        System.out.println("Are they equal: "+eq);
        String str7 = new String("Hello");
        boolean eq1 = str5.equals(str7);
        System.out.println("Are they Equal in the new keyword as well: "+eq1);
        
    // equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean.

        String str8 = "Andy";
        String str9 = "andy";
        boolean eq3 = str8.equals(str9);
        System.out.println("Are they equal: "+eq3);
        boolean eq4 = str8.equalsIgnoreCase(str9); // this checks only to ignore the upper and lower case letters.
        System.out.println("Are they Equal when we ignore case: "+eq4);

     //indexOf()	    Returns the position of the first found occurrence
        // of specified characters in a string	         int

     String str10 ="eloise";
     int pos = str10.indexOf("i");// will check for that characters Positions your asking once gets it will count where.
     System.out.println("The index of e on the string: "+pos);

     //lastIndexOf()	      Returns the position of the last found occurrence of
     //                       specified characters in a string	                                int
       String str11 ="eloise";
       int pos1 = str11.lastIndexOf('e') ;// this will look for the last position of the character and count.
       System.out.println("The last index of e: "+pos1);


      //    isEmpty()	          Checks whether a string is empty or not	                        boolean
        String str12 = " ";
        System.out.println("is the String Empty: "+(str12.isEmpty()));// this will check if its empty.

     //length()	          Returns the length of a specified string	                        int

     String str13 = "Hrakaralkhidher";// this basically counts how many characters are there.
        System.out.println("the Length of the string is: "+str13.length());





    }//end main
}//end class
