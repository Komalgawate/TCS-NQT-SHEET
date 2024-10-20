//1.Check if a number is palindrome or not
public class Numbersque {
    public static void main(String[] args) {
        int num=138;
        System.out.println(findpalindrome(num));
    }
    public static boolean findpalindrome(int num){
        int rev=0;
        int temp=num;
        while (num>0) {
            int ld=num%10;
            rev=(rev*10)+ld;
            num/=10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }

    }
}
//2.Find all Palindrome numbers in a given range
public class Numbersque {

    public static void main(String[] args) {
        int min=100,max=150;
        palindromeinrange(min,max);
    }
    public static boolean isPalindrome(int num){
        int rev=0;
        int temp=num;
        while (num>0) {
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        if(temp==rev){
            return true;
        }
        return false;
    }
    public static void palindromeinrange(int min,int max){
        for(int i=min;i<=max;i++){
            if(isPalindrome(i)){
                System.out.println(i+" ");
            }
        }
    }
}
//3.Check if a number is prime or not
public class Numbersque {
    public static void main(String[] args) {
        int n=5;
        primecheck(n);
    }
    public static void primecheck(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
       }
        }
        if(cnt==2){
            System.out.println(n+ "no is prime");
        }
        else{
            System.out.println(n+ "no is not  prime");
        }
    }
}
//4.Prime numbers in a given range
public class Numbersque {

    public static void main(String[] args) {
       printprimerange(2, 10);
    }
    public static boolean isprime(int n){
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }
    public static void printprimerange(int min,int max){
        for(int i=min;i<=max;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
//5.Check if a number is armstrong number of not
//Input:N = 153
// Output:True
// Explanation: 13+53+33 = 1 + 125 + 27 = 153
public class Numbersque {

    public static void main(String[] args) {
        int num=153;
        System.out.println(checkarmstrong(num));
    }
    public static boolean checkarmstrong(int num){
        int sum=0;
        int temp=num;
        while (num>0) {
            int rem=num%10;
            sum+=rem*rem*rem;
            num/=10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
}
//6.Check if a number is perfect number
// Example 3:
// Input: n=28
// Output: 28 is a perfect number
// Reason:
// For 6 and 28 ,the sum of their proper divisors (1+2+3) 
//and (1+4+7+14) is equal to the respective 
//numbers and for 15 it is not.
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findperfectnum(6));
    }
    public static boolean findperfectnum(int n){
        int sum=0;
        for(int i=1;i<=n-1;i++){
            if(n%10==0) 
            sum+=i;
        }
        if (sum == n)
        return true;
      else return false;
    }
}
//7.Even or Odd
public class Numbersque {

    public static void main(String[] args) {
        int n=5;
        if(remainder(n)==0){
          System.out.println("no is even");
        }else{
            System.out.println("no is odd");
        }
    }
    public static int remainder(int n){
        return (n%10);
    }
}
//8.Check weather a given number is positive or negative
public class Numbersque {

    public static void main(String[] args) {
        int num=-5;
        checknum(num);
    }
    public static void checknum(int num){
        if(num>0){
           System.out.println("no os positive");
        }
        else{
            System.out.println("no is negative");
        }
    }
}
//9.Sum of first N natural numbers
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findsum(5));
    }
    public static int findsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    } 
}
//10.Find Sum of AP Series
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(checkAp(2, 4, 5));
    }
    public static int checkAp(int a,int d,int n){
        double sum=(n/2.0)*(2.0*a+(n-1)*d);
        return (int) sum;
    }
}
//11.Program to find sum of GP Series
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findgp(2, 2, 4));
    }
    public static double findgp(double a,double r,double n ){
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=a;
          a=a*r;
        }
        return sum;
    }
}
//12.Greatest of two numbers
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findgreatest(6, 7));
    }
    public static int findgreatest(int num1,int num2){
       if(num1>num2){
        return num1;
       }
       return num2;
    }
}
//13.Greatest of three numbers
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findgreatest(9, 7,0));
    }
    public static int findgreatest(int num1,int num2,int num3){
       if(num1>num2){
        return num1;
       }
       else if(num2>num3){
        return num2;
       }
       return num3;
    }
 }
//14.Leap Year or not
// The year is divisible by 400
// The year is divisible by 4 but not by 100
public class Numbersque {

    public static void main(String[] args) {
        int year=1996;
        if(yyear(year)==true){
            System.out.println("YES");
        }else{
            System.out.println("no");
        }
    }
    public static boolean yyear(int year)
  {
    if(year % 400 == 0)
    return true;
    if(year % 100 == 0)
    return false;
    if(year % 4 == 0)
    return true;
    return false;
  }
}
 //15.Reverse digits of a number
public class Numbersque {

    public static void main(String[] args) {
        int n=234;
        System.out.println(findreverse(n));
    }
    public static int findreverse(int n){
       int rev=0;
       while (n!=0) 
       {
        int rem=n%10;
        rev=(rev*10)+rem;
        n/=10;
       }
        return rev;
    }
}
//16.Maximum and Minimum digit in a number
public class Numbersque {

    public static void MinMax(int n)
{
	int d;
	int mini = Integer.MAX_VALUE;
	int maxi = Integer.MIN_VALUE;
	while (n != 0)
	{
		d = n % 10;
		mini = Math.min(mini,d);
		maxi = Math.max(maxi,d);
		n = n / 10;
	}

	System.out.println("The minimum number is: "+mini);
	System.out.print("The maximum number is: "+maxi);
}
public static void main(String[] args)
{
	int n = 4726;
	MinMax(n);
}
}
//17.Print Fibonacci upto Nth Term
public class Numbersque {

    public static void main(String[] args) {
        int n=5;
        if(n==0){
            System.out.println(0);
         }
         else{
             int fib[]=new int[n+1];
             fib[0]=0;
             fib[1]=1;
             for(int i=2;i<=n;i++){
                  fib[i]=fib[i-1]+fib[i-2];
             }
             for(int i=0;i<=n;i++){
                 System.out.println(fib[i]+" ");
             }
         }

    }
}
//18.Factorial of a number
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findfactors(5));
    }
    public static int findfactors(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
//19.Power of a number
public class Numbersque {

    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=1;
        for(int i=0;i<n;i++){
           ans=ans*x;
        }
        System.out.println(ans);
    }
}
//20.Factors of a given number
public class Numbersque {
    public static void main(String[] args) {
        findNum(14);
    }
    public static void findNum(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
//optimized approach
public class Numbersque {
        public static void main(String[] args) {
            findNum(14);
        }
        public static void findNum(int num){
            for(int i=1;i<Math.sqrt(num);i++){
                if(num%i==0){
                    if(num/i==i)
                       System.out.println(i+" ");
                    else
                      System.out.println(i+" "+num/i+" ");
                }
            }
        }
    }
//21.Print all prime factors of the given number
import java.util.ArrayList;
public class Numbersque {
    public static void main(String[] args) {
        ArrayList<Integer> ans=getprime(160);
        System.out.println("prime factors");
        for(int factor:ans){
            System.out.println(factor);
        }
    }
    public static ArrayList<Integer> getprime(int n){
            ArrayList<Integer> primefactor=new ArrayList<>();
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    primefactor.add(i);
                }
                while (n%i==0) {
                    n/=i;
                }
            }
            return primefactor;
    }

}
//22.Check if a number is a strong number or not
// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples:

// Examples 1:
// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number
public class Numbersque {

    public static void main(String[] args) {
        int num=45;
        int ans=strong_no(num);
        if(num==ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
          fact*=i;
        }
        return fact;
    }
    public static int strong_no(int num){
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum+=fact(digit);
            num/=10;
        }
        return sum;
    }
}
//23.Check if a Number is Automorphic
// Example 1:Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(Automorphic(76));
    }
    public static boolean Automorphic(int n){
        
        int sq=n*n;
        while (n>0) {
        if(n%10!=sq%10)
        return false;
        n/=10;
        sq/=10; 
        }
    
    return true;
}
}
//24.GCD of two numbers
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findgcd(9, 12));
    }
    public static int findgcd(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
//25.LCM of two numbers
//26.Check if a number is Harshad number
public class Numbersque {
    public static void main(String[] args) {
        System.out.println(harshad(18));
    }
    public static int harshad(int x){
        int sum=0;
        int temp=x;
        while (temp!=0) {
            sum+=temp%10;
            temp/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}
//27.Check if the number is abundant number or not
// Example 1:Input: 18,Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, 
// Since 21 is greater than 18, 18 is an abundant number.
public class Solution {

       public static void main(String[] args) {
              checkabundant(21);
       }
       public static void checkabundant(int n){
              int sum=0;
              for(int i=1;i<=n;i++){
                     if(n%i==0){
                            sum+=i;
                     }
              }
              sum-=n;
         if(sum>n){
              System.out.println("Yes");
         }
         else{
              System.out.println("no");
         }
       }
}
//28.Sum of digits of a number
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(sumdigit(345));
    }
    public static int sumdigit(int n){
        int sum=0;
        while (n>0) {
            int ld=n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
}
//29.Sum of numbers in the given range
public class Numbersque {

    public static void main(String[] args) {
        System.out.println(findsumrange(1, 5));
    }
    public static int findsumrange(int min,int max){
        int sum=0;
        for(int i=min;i<=max;i++){
          sum+=i;
        }
        return sum;
    }
}
//30.Permutations in which N people can occupy R seats in a classroom
public class Numbersque {

    public static void main(String[] args) {
        int n=5,r=3;
        int num=fact(n);
        int den=fact(n-r);
        System.out.println(num/den);
    }
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

 }
//31.Program to add two fractions
//32.Replace all 0s with 1s in a given integer
//33.Can a number be expressed as a sum of two prime numbers
public class Solution {
       public static boolean prime(int n) {
              if (n <= 1)
                     return false;
              for (int i = 2; i * i <= n; i++) {
                     if (n % i == 0) {
                            return false;
                     }
              }
              return true;
       }
       static boolean isPrime(int n) {
              if (prime(n) && prime(n - 2)) {
                     return true;
              } else {
                     return false;
              }
       }
            public static void main(String[] args) {
              int n = 19;
              if (isPrime(n)) {
                     System.out.println("Yes");
              } else if (isPrime(n)) {
                     System.out.println("No");
                     }   
                  }
} 
//34.Calculate the area of circle
 public class Numbersque {

    public static void main(String[] args) {
        int r=5;
        findarea(r);
    }
    public static void findarea(int r){
        double area=Math.PI*r*r;
        System.out.println(area+"of circle");
    }
}
//35.Program to find roots of a Quadratic Equation

// Problems on Number System
// 1.Convert Binary to Decimal
public class Solution {
        public static void main(String[] args) {
        String s="1011";
        int n=s.length();
        int base=1;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans+=base;
            }
            base*=2;
        }
        System.out.println(ans);
    }
}
// 2.Convert binary to octal

// 3.Decimal to Binary conversion
// Input: num = 5
// Output: 2,Explanation: The binary representation of 5 is 101 
// (no leading zero bits), and its complement is 010. So you need to output 2.
public class Solution {
    public static void main(String[] args) {
        System.out.println(dectobin(5));
    }
    public static int dectobin(int n){
        if(n==0) return 1;
        int bitlength=Integer.toBinaryString(n).length();
        int mask=(1<<bitlength)-1;
        return n^mask;
    }
}
public class Solution {

    public static void main(String[] args) {
        int n=21;
        int binary[]=new int[32];
        int pow=1;
        int i=0;
        while (n>0) {
          binary[i]=n%2;
          i++;
          n/=2;         
        }
        for(int idx=i-1;idx>=0;idx--){
            System.out.print(binary[idx]);
        }
    }
}
// 4.Convert decimal to octal
public class Solution {
    public static void main(String[] args) {
        System.out.println(dectooctal(136));
    }
    public static int dectooctal(int dec){
       int i=0;
       int octal=0;
       while (dec!=0) {
         int rem=dec%8;
         octal+=rem*Math.pow(10, i);
         i++;
          dec/=8;
       }
    return octal;
    }
}
// 5.Convert octal to binary
import java.util.*;
public class Solution {
  public static int DecimaltoBinary(int decimal) {
    int Binary = 0;
    int i = 0;
    while (decimal != 0) {
      int rem = decimal % 2;
      Binary += (rem * Math.pow(10, i));
      i++;
      decimal = decimal / 2;
    }
    return Binary;
  }
  public static int OctaltoDecimal(int Octal) {
    int Decimal = 0;
    int i = 0;
    while (Octal != 0) {
      int rem = Octal % 10;
      Decimal += rem * Math.pow(8, i);
      i++;
      Octal /= 10;
    }
    return Decimal;
  }
  public static void main(String[] args) {
    int Octal = 345;
    int Decimal = OctaltoDecimal(Octal);
    System.out.println("The binary conversion of the given octal number is"+DecimaltoBinary(Decimal));
  }
 
}
 
// 6.Convert octal to decimal
public class Solution {

  public static void main(String[] args) {
    System.out.println(octaltodecimal(345));
  }
  public static int octaltodecimal(int octal){
    int decimal=0;
    int i=0;
    while (octal!=0) {
      int rem=octal%10;
      decimal+=rem*Math.pow(8, i);
      i++;
      octal/=10;
    }
    return decimal;
  }
}
// 7.Convert digits/numbers to words
public class Solution{
public static void main(String[] args) {
  System.out.println(NumtoWords(125987));
}
  
  public static String NumtoWords(int num){
    String belowten[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String belotwenty[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String belowhundred[]={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    if(num==0){
      return "Zero";
    }
    if(num<10){
      return belowten[num];
    }
    if(num<20){
      return belotwenty[num-10];
    }
    if(num<100){
      return belowhundred[num/10]+(num%10!=0 ? " "+belowten[num%10]:"");
    }
    if(num<1000){
      return belowten[num/100]+" Hundred"+(num%100!=0 ? " "+NumtoWords(num%100):"");
    }
    if(num<1000000){
      return NumtoWords(num/1000)+" Thousand"+(num%1000!=0 ? " "+NumtoWords(num%1000):"");
    }
    if(num<1000000000){
      return NumtoWords(num/1000000)+" Million"+(num%1000000!=0 ? " "+NumtoWords(num%1000000):"");
    }
    return NumtoWords(num/1000000000)+" Billion"+(num%1000000000!=0 ? " "+NumtoWords(num%1000000000):"");
  }
}