import java.lang.*;
import java.util.*;
public class Case_Change {
    public static void main(String[] args) {

        //String str1="Great Power";
        StringBuffer newStr=new StringBuffer();
        Scanner sc = new Scanner(System.in);
        newStr.append(sc.nextLine());
        System.out.println("Before case conversion "+ newStr);


        for(int i = 0; i < newStr.length(); i++) {

            //Checks for lower case character
            if(Character.isLowerCase(newStr.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr.setCharAt(i, Character.toUpperCase(newStr.charAt(i)));
            }
            //Checks for upper case character
            else if(Character.isUpperCase(newStr.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(newStr.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}
