//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here -
        int ones = 0;
        int twos = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                ones++;
            }
            else if(arr[i]==2){
                twos++;
            }
        }
        
        for(int i = 0; i < n; i++){
            if(i < (n - ones - twos)){
                arr[i] = 0;
            }
            else if(i < (n - twos)){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends