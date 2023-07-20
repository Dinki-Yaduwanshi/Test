
	import java.util.*;
	public class HelloWorld {
	     int c; 
	     int top;
	    int arr[];
	         HelloWorld(int capacity){
	               top=-1;
	              c= capacity;
	              arr=new int[c]; 
	         }
	    
	         void push(int element){
	             if(isFull()){
	                 System.out.println ("Full stack");
	             }else{
	                 top++;
	                 arr[top]=element;
	                 System.out.println(element+"is pushed");
	             }
	         }
	    
	    
	        boolean isFull(){
	            if(top==c-1){
	                return true;
	            }else{
	                return false;
	            }
	        }
	        
	        int size(){
	            if(isEmpty()){
	                return 0;
	            }else{
	                return top+1;
	            }
	        }
	    
	    
	         int  pop(){
	             int ele;
	             if(isEmpty()){
	                 System.out.println("Empty stack");
	                 return 0;
	             }else{
	                 ele= arr[top];
	                top--;
	             }
	             System.out.println(ele +"popped");
	             return ele;
	         }
	         
	         int  peek(){
	             if(isEmpty()){
	                 System.out.println("Empty stack");
	                 return 0;
	             }
	             return arr[top];
	         }
	    
	    boolean isEmpty(){
	        if(top==-1){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	        System.out.println("Enter capacity");
	        Scanner sc= new Scanner(System.in);
	        int n = sc.nextInt();
	        
	     HelloWorld stack = new HelloWorld(n);
	   int choice;
	    while(true){
	     System.out.println("Select Operation");
	     System.out.println(" 1. push");
	     System.out.println(" 2. pop");
	     System.out.println(" 3. peek");
	     System.out.println(" 4. size");
	     System.out.println(" 5. isFull");
	     System.out.println(" 6. isEmpty");
	     System.out.println( "7. Exit");
	     
	     choice=sc.nextInt();
	     
	      switch(choice){
	          
	          case 1: System.out.println("Enter element :");
	                  int ele= sc.nextInt();
	                  stack.push(ele);
	          break;
	           case 2: stack.pop();
	           break;
	           case 3: System.out.println(stack.peek());
	           break;
	           case 4:System.out.println(stack.size());
	           break;
	           case 5:System.out.println(stack.isFull());
	           break;
	           case 6:System.out.println(stack.isEmpty());
	           break;
	          case 7:System.exit(0);
	          break;
	          default:System.out.println("Wrong value");
	         
	          
	      }
	    }
	      
	     
	      
	      
	    }
	}

