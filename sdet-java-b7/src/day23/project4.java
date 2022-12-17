package day23;

public class project4 {
	public static void main(String[] args) {
		makePyramid(3);
    }
	
	public static void makePyramid(int num) {
		String hash = "#";
      String empty = "       ";
      int emptyNum = num;
      
      if(num>0&&num<=8){
        for (int i=1; i<=num; i++){
          System.out.print(empty.substring(0,emptyNum-1)+hash+"  "+hash);
          hash = hash + "#";
          
          System.out.println();
          emptyNum--;
        }
      }else{
        System.out.println("INVALID INPUT");
      }
   }
}