class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
       long[] ans = new long[n];
       
       ArrayDeque<Integer> stack= new ArrayDeque<>();
       
       ans[0]=-1;
       stack.push(0);
       
        for(int i = 1; i< n;i++){
            
            while( stack.isEmpty()==false && arr[i]>=arr[stack.peek()] ){
                stack.pop();
            }
            
            
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[stack.peek()];
            }
            
            stack.push(i);
            
        }
        
        return ans;
    } 
}