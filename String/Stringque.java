//Problems on String
// 1.Check if a given string is palindrome or not
public class stringque {

    public static void main(String[] args) {

        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);

        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }
        return true;
    }
}
// 2.Count number of vowels, consonants, spaces in String
public class stringque {

    public static void main(String[] args) {
        String str="i am komal gawate";
        int n=str.length();
        counting(str, n);
    }
    public static void counting(String str,int n){
        str=str.toLowerCase();
        int vowel=0,consonant=0,whitespace=0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vowel++;
            else if(ch>='a' && ch<='z')
            consonant++;
            else if(ch==' ')
            whitespace++;
        }
        System.out.println(vowel+" vowel in this string");
        System.out.println(consonant+"consonant in this string");
        System.out.println(whitespace+" whitespace in this string");
    }
}
// 3.Find the ASCII value of a character
public class stringque {

    public static void main(String[] args) {
        ascii();
    }
    public static void ascii(){
        char c='a';
        int ascii=c;
        System.out.println("ascii val of " +c+" "+"is "+ascii);
    }
}
// 4.Remove all vowels from the string
public class stringque {

    public static void main(String[] args) {
        String str="take u forward";
        System.out.println(removevowel(str));
    }
    public static String removevowel(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str=str.substring(0,i)+str.substring(i+1);
                    i--;
            }
        }
        return str;
    }
}
// 5.Remove spaces from a string
public class stringque {

    public static void main(String[] args) {
        char[] str="take u forward".toCharArray();
        int count=removespace(str);
        System.out.println(String.valueOf(str).subSequence(0,count));
    }
    public static int removespace(char[] str){
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i]!=' '){
                str[count]=str[i];
                count++;
            }
        }
        return count;
    }
}
// 6.Remove characters from a string except alphabets
public class stringque {
    public static void main(String[] args) {
      String str = "take12% *&u ^$#forward";
      int n = str.length();
      System.out.println("Resultant string:");
      System.out.println(solve(str, n));
    }
    public static String solve(String str,int n){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<n;i++){
            int ascii=(int)str.charAt(i);
            if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
// 7.Reverse a String
public class stringque {

    public static void main(String[] args) {
        char[] str="komal".toCharArray();
        reverse(str);
        System.out.println(str);
    }
    public static void reverse(char[] str){
        int n=str.length;
       for(int i=0;i<n/2;i++){
           char temp=str[i];
           str[i]=str[n-i-1];
           str[n-i-1]=temp;
       }
    }
}
// 8.Remove brackets from an algebraic expression
public class stringque {

    public static void main(String[] args) {
        String input="a+b(c-d)";
        System.out.println(solve(input));
    }
    public static String solve(String input){
        StringBuilder ans=new StringBuilder();
        int n=input.length();
        for(int i=0;i<n;i++){
            if(input.charAt(i)!='(' && input.charAt(i)!=')'){
                ans.append(input.charAt(i));
            }
        }
        return ans.toString();
    }
 }
// 9.Sum of the numbers in a String
public class stringque {

    public static void main(String[] args) {
        String str="arf4a5v4";
        System.out.println(findsum(str));
    }
    public static int findsum(String str){
        int sum=0;
        String tempsum="0";
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(Character.isDigit(s))
              tempsum+=s;
              else{
                sum+=Integer.parseInt(tempsum);
                tempsum="0";
              }
        }
        return sum+Integer.parseInt(tempsum);
    }
}
// 10.Capitalize first and last character of each word
public class stringque {

    public static void main(String[] args) {
        String str="i am komal gawate";
        int size=str.length();
        System.out.println(capitilize(str, size));
    }
    public static String capitilize(String str,int size){
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<size;i++){
            if(i==0 || i==(size-1)){//convertin 1st and last char to uppercase
               sb.setCharAt(i,Character.toUpperCase((char)(int) str.charAt(i)));
            }
// Converting characters present before and after space to uppercase
            else if(str.charAt(i)==' '){
              sb.setCharAt(i-1,Character.toUpperCase((char)(int) str.charAt(i-1)));
              sb.setCharAt(i+1,Character.toUpperCase((char)(int) str.charAt(i+1)));
            }
        }
        return sb.toString();
    }
}
//capitalize the 1st char in a string if 
//word length less than 2 then it's lowercase
public class stringque {

    public static void main(String[] args) {
        String str="i am komal gawate";
        System.out.println(capital(str));
    }
    public static String capital(String title){
        String[] str=title.split(" ");
        String res=" ";
        for(int i=0;i<str.length;i++){
            if(str[i].length()>2)
            {
              for(int j=0;j<str[i].length();j++){
                if(j==0){
                    res+=String.valueOf(str[i].charAt(j)).toUpperCase();
                }else
                    res+=String.valueOf(str[i].charAt(j)).toLowerCase();
                
                
              }
              res+=" ";
            }
            else res+=str[i].toLowerCase()+" ";
            
        }
        return res.substring(0,res.length()-1);
    }
}

// 11.Calculate frequency of characters in a string
public class stringque {

    public static void main(String[] args) {
        String str = "takeuforward";
        printfreq(str);
    }
    public static void printfreq(String str){
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.print((char)(i+'a'));
                System.out.print(freq[i]+" ");
            }
        }
    }
}
// 12.Find Non-repeating characters of a String
public class stringque {

    public static void main(String[] args) {
        String str="google";
        isnonrepeated(str);
    }
    public static void isnonrepeated(String str){
        int freq[]=new int[200];
        char s[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
             continue;
            else
             freq[(int)str.charAt(i)]++;
        }
        //print the non repeat elements;
        for(int i=0;i<str.length();i++){
            if(freq[(int) str.charAt(i)]==1&& s[i]!=' '){
                System.out.println(s[i]+" ");
            }
        }
    }
}
//find 1st unique chracter index in string
public class stringque {

    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(findnonrepeatindex(str));
    }
    public static int findnonrepeatindex(String str){
         char c[]=str.toCharArray();
         for(int i=0;i<str.length();i++){
            boolean isunique=true;
            for(int j=0;j<str.length();j++){
                if(i!=j && c[i]==c[j]){
                    isunique=false;
                    break;
                }
            }
            if(isunique){
                return i;
            }
         }
         return -1;
    }
}

// 13.Check if two strings are anagram of each other

import java.lang.reflect.Array;
import java.util.Arrays;

public class stringque {

    public static void main(String[] args) {
        String str1="geeks for geeks";
        String str2="for Geeks geeks";
        System.out.println(isanagram(str1, str2));
    }
    public static boolean isanagram(String str1,String str2){
        str1=str1.trim();
        str2=str2.trim();
        if(str1.length()!=str2.length()){
            return false;
        }
        char arr1[]=str1.toLowerCase().toCharArray();
        char arr2[]=str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
// 14.Count common sub-sequence in two strings
// 15.Check if two strings match where one string contains wildcard characters

// 16.Return maximum occurring character in the input string
import java.util.Arrays;
public class Main {
   //Function to find Maximum Occurring Character
   static char maxOccurringChar(String str) {
      char ans = str.charAt(0);
      int i, curr_freq = 0, max_freq = 0, n = str.length();
      for (i = 1; i < n; i++) {
         if (str.charAt(i) == str.charAt(i - 1)) {
            curr_freq++;
         } 
         else {
            if (max_freq < curr_freq) {
               max_freq = curr_freq;
               ans = str.charAt(i - 1);
            }
            curr_freq = 0;
         }
      }
      if (max_freq < curr_freq) {
         max_freq = curr_freq;
         ans = str.charAt(i - 1);
      }
      return ans;
   }

   public static void main(String[] args) {
      String str = "takeuforward";
      //convert to character array
      char charArr[] = str.toCharArray();
      //sort the character array
      Arrays.sort(charArr);
      //sorted character array converted back to string
      str = new String(charArr);
      System.out.println("Maximum Occurring Character is " + maxOccurringChar(str));
   }
}
// 17.Remove all duplicates from the input string.
public class Stringque {

    public static void main(String[] args) {
        String str="aabcd";
        System.out.println(removeduplicates(str));
    }
    public static String removeduplicates(String str){
        String ans="";
        boolean map[]=new boolean[26];
        for(int i=0;i<str.length();i++){
            if(map[str.charAt(i)-'a']==false){
                ans+=str.charAt(i);
                map[str.charAt(i)-'a']=true;
            }

        }
        return ans;
    }
}
// 18.Print all the duplicates in the input string.
public class Stringque {

    public static void main(String[] args) {
          String str="abbcs";
        int count[]=new int[26];
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)-'a']++;
        
        for(int i=0;i<26;i++){
            if(count[i]>1){
              System.out.println((char)(i+'a'));
            }
        }
    }
}
// 19.Remove characters from first string present in the second string
public class Stringque {

    public static void main(String[] args) {
        String s1="komal";
        String s2="kajal";
        System.out.println(removeduplicates(s1, s2));
    }
    public static String removeduplicates(String s1,String s2){
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<s1.length();i++){
            int flag=0;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    flag=1;
                }
            }
            if(flag!=1){
                ans.append(s1.charAt(i));
            }
        }
        return ans.toString();
    }
}
// 20.Change every letter with the nextlexicographic alphabet in the given string.
// Example 1:Input: string str = “abcdxyz”
// Output: bcdeyza
public class Stringque {

    public static void main(String[] args) {
        String str="abcde";
        System.out.println(solve(str));
    }
    public static String solve(String str){
        StringBuffer ans=new StringBuffer();
        
        for(int i=0;i<str.length();i++){
            int ascii=(int)(str.charAt(i));
            if(ascii==90){
                ans.insert(i,(char)(65));
            }
            else if(ascii==122){
                ans.insert(i,(char)(97));
            }
            else if(ascii>=65 && ascii<90 || ascii>=97&&ascii<122){
                ans.insert(i, (char)(ascii+1));
            }
        }
        return ans.toString();
    }
}
// 21.Write a program to find the largest word in a given string.

// 22.Write a program to sort characters in a string
public class Stringque {

    public static void main(String[] args) {
        String str="gfarc";
        int n=str.length();
        System.out.println(solve(str, n));
    }
    public static String solve(String str,int n){
        char[] arr=str.toCharArray();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        String ans=new String(arr);
        return ans;
    }
}
//using sort() function
import java.util.Arrays;
public class Stringque {
    public static void main(String[] args) {
        String str="hdsuaet";
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        String ans=new String(arr);
        System.out.println(ans);
    }
}
// 23.Count number of words in a given string
public class Stringque {
    public static void main(String[] args) {
        String str="i am komal gawate";
        int spaces=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                  spaces+=1;
            }
        }
        System.out.println(spaces+1);
    }
}
// 24.Write a program to find a word in a given string which has the highest number of repeated letters.
// 25.Change case of each character in a string
// 26.Concatenate one string to another
// 27.Write a program to find a substring within a string. If found display its starting position
// 28. Reverse words in a string
