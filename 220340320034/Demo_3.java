import java.util.*;
class Two_Stacks{
	int [] arr;
	int size;
	int top1, top2;
	
	Two_Stacks(int n)
	{
		size = n;
		arr = new int[n];
		top1 = n/2+1;
		top2 = n/2;
	}
	
	void push1(int x)
	{
		if(top1 > 0)
		{
			top1--;
			arr[top1]=x;
		}
		else{
			System.out.println("Stack Overflow " + " By element!!" +x +"\n");
			
			return;
		}
		
	}
	void push2(int x)
	{
		if(top2 < size -1){
			
			top2++;
			arr[top2] =x;
			
			
		}
	
	else
	{
		System.out.println("Stack Underflow!!!" +"By element:" + x + "\n");
		return;
	}
	
	
	}
	int pop1(){
		if(top1<= size/2){
			int x = arr[top1];
			top1++;
			return x;
		}
		else{
			System.out.print("Stack Underflow");
			System.exit(1);
		}
		return 0;
	} 
	
	int pop2(){
		if(top2 >= size/2+1){
			int x=arr[top2];
			top2--;
			return x;
		}
		else{
			System.out.println("Stack Underflow!!!");
			System.exit(1);
		}
		return 1;
	}
	
	}
	class Demo_3{
		public static void main(String args[]){
			Two_Stacks t = new Two_Stacks(5);
			t.push1(5);
			t.push2(10);
			t.push2(15);
			t.push1(11);
			t.push2(7);
			
			System.out.println("Popped element from stack1 is "+":"+ t.pop1()+"\n");
			t.push2(40);
			System.out.print("Popped element from stack2 is "+":"+ t.pop2()+"\n");
		}
	}
	