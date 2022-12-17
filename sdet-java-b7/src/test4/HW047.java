package test4;

import java.util.ArrayList;
import java.util.List;

public class HW047 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> res = noYY(list);
        System.out.println(res);
    }

    public static List<String> noYY(List<String> strings) {
		// your code goes here
      if (strings.size()<=0){
        strings.add("y");
        return strings;
      }
    
      for (int i=strings.size()-1; i>=0 ; i--){
      //if (strings.get(i).length()<=0){ 
      //    strings.set(i,strings.get(i)+"y");
      if (strings.get(i).charAt((strings.get(i).length()-1))==('y')||strings.get(i).contains("yy")){
          strings.remove(strings.get(i));
        }else{
          strings.set(i,(strings.get(i))+"y");
        }
      }
        return strings;
    }
}
