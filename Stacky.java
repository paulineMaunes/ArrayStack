
 
public class Stacky{ 

        private int size; 
        private int[] Stacks; 
        private int top; 
        public Stacky (int size){ 

                Stacks = new int[size]; 
       
	System.out.println("current stack size: " + size); 


        this.size = size;

        top = 0; 
} 



        public void push(int num){ 

           if (!is_full()){ 
              

	   Stacks[top]=num; 

        System.out.println("pushed:" + num); 
                        
	    top++; 
}	
	
	else{ 
        
	System.out.println("STACK is already full!"); 

}
 
} 
        public int peek(){ 

                return Stacks[top]; 

} 
        public boolean is_full(){ 

                return (size==top);
 
} 
        public boolean is_empty(){ 

                return (top == 0);

} 
        public int pop(){ 
                
		if(!is_empty()){ 
                
	        int value = Stacks[--top]; 
                
        System.out.println("popped:" + value); 
                       
		 Stacks[top] = 0; 
                 return value; 

} 

                return 0; 

} 

        public static void main(String [] args){ 

                Stacky pauline = new Stacky(6);
 
                pauline.push(2); 
                pauline.push(4); 
                pauline.push(6); 
                pauline.push(8); 
                pauline.push(10); 
                pauline.push(12); 
                pauline.pop(); 
                
        } 
} 