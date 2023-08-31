//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        
        if(arr.length==1)
        return 0;
        
        if(arr[0]==0)
        return -1;
        
        int jump=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            return -1;
            int range=arr[i];
            if(arr[i]+i>=arr.length-1){
                jump++;
                break;
            }else{
                int max=0,sum=0,idx=-1;
                for(int j=i+1;j<(i+1+range);j++){               
                    sum=arr[j]+j;
                    if(sum>=max){
                        idx=j;
                        max=sum;
                    }
                }
                i=idx-1;
                jump++;
            }
        }
        return jump;
    }
}