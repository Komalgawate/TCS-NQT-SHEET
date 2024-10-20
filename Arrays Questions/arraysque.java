// package TCS NQT SHEET;
//TCS NQT SHEET LINK-
//https://takeuforward.org/interviews/tcs-nqt-coding-sheet-tcs-coding-questions/

// 1. Find the smallest number in an array
public class arraysque {
    public static void main(String[] args) {
        int arr[]={2,4,7,8,8};
      System.out.println(findarr(arr));
    }
    public static int findarr(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            
          if(arr[i]<min){
            min=arr[i];
          }
        }
        return min;
    }
}

// 2.Find the largest number in an array

public class arraysque {
    public static void main(String[] args) {
        int arr[]={3,5,6,8,0};
        System.out.println(findmax(arr));
    }
    public static int findmax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

// 3.Second Smallest and Second Largest element in an array
//brute force approach
import java.lang.reflect.Array;
import java.util.Arrays;
public class arraysque {
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9};
        int n=arr.length;
        findele(arr, n);
    }
    public static void findele(int arr[],int n){
        if(n==0||n==1)
        {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small=arr[1];
        int large=arr[n-2];
        System.out.println("2nd smallest element is"+small);
        System.out.println("2nd largest element is "+large);
    }
}
//optimizes approach 
//algorithm 1)here we need 4 variable small,second_small,large,second_large,
//small second_small initialize int max,and large and second_large initialize int min
//to find second small element approach
//1.check the current element is smaller than the 'small' then update second_small,small var
//2.else if check the current element is smaller then the second_small and current element
//not equal to small then update second_small 
//similarly we can find second_large
public class arraysque {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n=arr.length;
        System.out.println("smallest element in array "+findsmallest(arr, n));
        System.out.println("largest element in array "+findlargest(arr, n));
    }
    public static int findsmallest(int arr[],int n){
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        if(n<2){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
        return second_small;
    }
    public static int findlargest(int arr[],int n){
        if(n<2){
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        return second_large;
     
    }
}
// 4.Reverse a given array
public class arraysque {

    public static void main(String[] args) {
        int arr[]={3,6,1,9,2,2};
       reverseArray(arr, 0, arr.length-1);
       printarray(arr);

    }
    public static void printarray(int arr[]){
       for(int i=0;i<arr.length;i++){
        System.out.print(+arr[i]);
       }
    }
    public static void reverseArray(int arr[],int start,int end){
       if(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr, start+1, end-1);
       }
    }
}
// 5.Count frequency of each element in an array
  public class arraysque {
  
   public static void main(String[] args) {
      int arr[]={4,5,7,2,9,9};
      int n=arr.length;
      findfrequency(arr, n);
   }
   public static void findfrequency(int arr[],int n){
      boolean visited[]=new boolean[n];
     
      for(int i=0;i<n;i++){
         if(visited[i]==true)
         continue;
         int count=1;
         for(int j=i+1;j<n;j++){
            
            if(arr[i]==arr[j]){
               visited[j]=true;
               count++;
            }
         }
         System.out.println(arr[i]+" "+"occur "+count+" "+"times");
      }
   }
  }
// 6.Rearrange array in increasing-decreasing order
// Input: 8 7 1 6 5 9
// Output: 1 5 6 9 8 7
//approach
//Sort the given array.
// Print the first half of the array i.e from 0 to (n/2 -1)th
// index,to print the first half in the ascending order.
//Then print elements from n-1 to n/2th index to get the 
//second half in the descending order

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysque {
   public static void main(String[] args) {
      int arr[]={8 ,7, 1, 6, 5, 9};
      int n=arr.length;
      Arrays.sort(arr);
      for(int i=0;i<n/2;i++){
       System.out.print(arr[i]+" ");
      }
      for(int i=n-1;i>=n/2;i--){
         System.out.print(arr[i]+" ");
      }
   }
}
// 7.Calculate sum of the elements of the array
public class arraysque {

    public static void main(String[] args) {
        int arr[]={4,2,3,4};
        System.out.println(findsum(arr));
    }
    public static int findsum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
        return sum;
    }
}
// 8.Rotate array by K elements - Block Swap Algorithm
// 9.Average of all elements in an array
public class arraysque {
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int n=arr.length;
     double sum=0;
     for(int i=0;i<n;i++){
       sum+=(double)arr[i];
     }
     double avg=sum/n;
     System.out.println("average element of the array "+avg);
 }
}
// 10.Find the median of the given array

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysque {

    public static void main(String[] args) {
        int arr[]={2,3,1,4,7,9};
        int n=arr.length;
        findmedian(arr, n);
    }
    public static void findmedian(int arr[],int n){
    Arrays.sort(arr);
    int idx1=(n/2)-1;
    int idx2=(n/2);
    if(n%2==0){
        System.out.println((double)(arr[idx1]+arr[idx2]/2));
    }else
    {
    System.out.println(arr[n/2]);
    }
    }
}
// 11.Remove duplicates from a sorted array
public class arraysque {

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        int k=finduplicate(arr);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static int finduplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}

// 12.Remove duplicates from unsorted array
// > We can use an array to store non-duplicate and will return this array
// -> This array will be a boolean array. Corresponding to each index, true means element is Unique else it's duplicate.
// Approach: 
// -> We will place true from i to  n-1 in the mark array
// -> We will use a nested loop. In the outer loop, we will iterate the given array. Let the current number be ‘x’.
// Now in the inner loop, we will iterate from the given ‘x’ to the end of the array.
// -> If we find ‘x’, we will mark x as false
//-> Same can be done throughout for each element of the array
public class arraysque {

    public static void main(String[] args) {
        int arr[] = { 4, 3, 9,9, 2, 4, 1, 3,3};
         int n=arr.length;
        duplicate(arr, n);
    }
    public static void duplicate(int arr[],int n){
        int mark[]=new int[n];
        for(int i=0;i<n;i++){
           mark[i]=1;
        }
        for(int i=0;i<n;i++){
            if(mark[i]==1){
              for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    mark[j]=0;
                }
              }
            }
        }
        for(int i=0;i<n;i++){
            if(mark[i]==1){
                System.out.print(arr[i]+",");
            }
        }
    }
}
// 13.Adding Element in an array
//Example:
// Input: N = 5, array[] = {1,2,3,4,5}
// insertbeginning(6)
// insertending(7)
// insertatpos(8,4)
// Output: 6,1,2,8,3,4,5,7
// Explanation: 6 is added at the beginning and 7 
//is added at the end and 8 is added at position 4 
public class arraysque {
    public static void main(String[] args) {

    int arr[]={10,9,14,8,20,48,16,9,0};
    int n=8;
    int val=0;
    int pos=2;
  specificpos(arr, n, val, pos);
    for(int i=0;i<=n;i++){
        System.out.print(arr[i]+" ");
      }
    }
    public static void inserbeg(int arr[],int n,int val){
        for(int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=val;
    }

    public static void inserlast(int arr[],int n,int val){
        for(int i=n-1;i>=0;i--){
           arr[n]=val;
        }
    }
    public static void specificpos(int arr[],int n,int val,int pos){
        for(int i=n;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=val;
    }
}
// 14.Find all repeating elements in an array

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysque {

    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,5};
        findduplicate(arr);
    }
    public static void findduplicate(int arr[]){
       Arrays.sort(arr);
       for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            System.out.print(arr[i]+" ");
        }
       }

    }
}
//brute force approach
public class arraysque {

    public static void main(String[] args) {
        int arr[]={1,4,1,3,4,8};
        nonrepeat(arr);
    }
    public static void nonrepeat(int arr[]){
        int cnt=0;
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dup[cnt++]=arr[i];
                }
            }
        }
        System.out.println("the repeaating elements are");
        for(int i=0;i<cnt;i++){
            if(dup[i]!=dup[i+1]){
                System.out.print(dup[i]+" ");
            }
        }
    }
}
// 15.Find all non-repeating elements in an array

import java.util.Arrays;

public class arraysque {

    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 1, 3, 1};
        findnonrepeat(arr);
    }

    public static void findnonrepeat(int arr[]) {
        Arrays.sort(arr); // Sort the array first

        // Check for the first element if it's non-repeating
        if (arr[0] != arr[1]) {
            System.out.print(arr[0] + " ");
        }

        // Loop from the second element to the second last element
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        // Check the last element
        if (arr[arr.length - 2] != arr[arr.length - 1]) {
            System.out.print(arr[arr.length - 1] + " ");
        }
    }
}

// 16.Find all symmetric pairs in array
// Input: (1,2),(2,1),(3,4),(4,5),(5,4)
// Output: (2,1) (5,4)
// Explanation: Since (1,2) and (2,1) are 
//symmetric pairs and (4,5) and (5,4) are symmetric pairs.
//First use a for loop and traverse through every pair in the vector.
// Then use another for loop and check if the symmetric pair of that pair is present in the rest of the vector or not.
// If the symmetric pair is present print the pair and break from the second for loop.so as to avoid repetitive printing of answers in case of duplicate pair.
// If the symmetric pair is not present,move to the next pair.
public class arraysque {

    public static void main(String[] args) {
        int arr[][]={{2,4},{4,2},{5,1},{6,7}};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0]){
                    System.out.print("{"+arr[i][1]+" "+arr[i][0]+"}"+" ");
                }
            }
        }

    }
}
// 17.Maximum product subarray in an array
public class arraysque {

    public static void main(String[] args) {
        int arr[]={ 1,2,-3,0,-4,-5};
        int n=arr.length;
        System.out.println(findmaxpro(arr, n));
       
    }
    public static int findmaxpro(int arr[],int n){
       int prefix=1,suffix=1;
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(prefix==0) prefix=1;
        if(suffix==0) suffix=1;
        prefix=prefix*arr[i];
        suffix=suffix*arr[n-1-i];
        ans=Math.max(ans,Math.max(prefix,suffix));
       }
        return ans;
    }
}
// 18.each element of the array by its rank in the array
// 19.Sorting elements of an array by frequency

// 20.Rotation of elements of array- left and right
// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position 
public class arraysque {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
    moveright(arr, k, n);
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
    }
    }
    public static void reverse(int arr[],int start,int end){
        while (start<=end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
    }
    public static void moveright(int arr[],int k,int n){
        //reverse 1st n-k elements
        reverse(arr, 0, n-k-1);
        //reverse last k elements
        reverse(arr, n-k, n-1);
        //reverse whole array
        reverse(arr, 0, n-1);
    }
}
// 21.Finding equilibrium index of an array
// Solution 2: Using Total Sum
// Calculate the sum = total sum of all the integers in the array.
// Keep leftSum = 0, rightSum = sum.
// leftSum = sum of all the integers to its left 
// rightSum = sum of all the integers to it’s right.
// At every index i rightSum would be rightSum excluding the 
// current index value.now we will is Check if(leftSum == rightSum)
// If yes then return that index else keep moving forward.while moving
// forward it can be seen that we are considering that current index value
// to be on left so update the leftSum value. leftSum = leftSum + nums[i].
public class arraysque {

    public static void main(String[] args) {
        int arr[]={2,3,-1,8,4};
        int n=arr.length;
        System.out.println(findequilibriumindex(arr,n));
    }
    public static int findequilibriumindex(int arr[],int n){
        int totalsum=0;
        for(int i=0;i<n;i++){
          totalsum+=arr[i];
        }
        int leftsum=0,rightsum=totalsum;
        for(int i=0;i<n;i++){
            rightsum-=arr[i];
            if(leftsum==rightsum){
                return i;
            }
            else{
                leftsum+=arr[i];
            }
           
        }
        return-1;
        
    }
}
// 22.Finding Circular rotation of an array by K positions
// 23.Sort an array according to the order defined by another array
// 24.Search an element in an array

public class arraysque {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,2};
        System.out.println(searchele(arr, 7));
    }
    public static int searchele(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
//TC-O(N),SC=O(1)
//optimized approach
public class arraysque {

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 8, 2};
        System.out.println(findele(arr, 8)); // Now it will print the result
    }

    public static int findele(int arr[], int k) { // Changed void to int
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                ans = mid;
                break; 
            }
        }
        return ans; 
    }
}

// 25.Check if Array is a subset of another array or not
// Example 1:
// Input: arr1[]= [1,3,4,5,2]
//        arr2[]= [2,4,3,1,7,5,15]
// Output: arr1[] is a subset of arr2[]
public class arraysque {

    public static void main(String[] args) {
        int arr1[]= {1,3,4,5,2};
       int  arr2[]= {2,1,3,1,7,5,15};
       int m=arr1.length;
       int n=arr2.length;
       System.out.println(isSubset(arr1, m, arr2, n));
    }
    public static boolean isSubset(int arr1[],int m,int arr2[],int n){
        if(m>n){
            return false;
        }
        for(int i=0;i<m;i++){
            boolean present=false;
            for(int j=0;j<n;j++){
             if(arr2[j]==arr1[i]){
                present=true;
                break;
             }
        }
        if(present==false)
        return false;
    }
    return true;
    }
}

//26.remove element
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).
public class arraysque {

    public static void main(String[] args) {
        int arr[]={2,2,1,4,5};
        System.out.println(remove(arr, 2));
    }
    public static int remove(int arr[],int val){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}