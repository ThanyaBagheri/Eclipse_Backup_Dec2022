package test2;

public class HW018 {
    public static void main(String args[]){
        // calling first method
        System.out.println(max(1, 2));

        // calling second method
        System.out.println(max(6, 8, 5));

        // calling third method
        System.out.println(max(1.5, 4.2));
    }
  
  	public static int max(int a, int b ){
      	if (a>=b){
        return a;
        }else{
          return b;
    }
    }
      
    public static int max(int a, int b, int c){
      	int ab = max(a,b);
      	int bc = max(b,c);
      	return max(ab,bc);
    }
    
    
    public static double max(double a, double b){
      	if (a>=b){
          return a;
        }else{
          return b;
        }
    } 
      
}

