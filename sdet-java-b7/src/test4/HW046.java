package test4;

import java.util.ArrayList;

public class HW046 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ax");
        list.add("bb");
        list.add("cx");

        ArrayList<String> res = noX(list);

        System.out.println(res);
    }

    public static ArrayList<String> noX(ArrayList<String> strings) {
        // your code goes here   
      for (int i=0; i<strings.size(); i++){
    	  if ((strings.get(i)).contains("x"))
    	  strings.set(i,strings.get(i).replace("x",""));
      }
      return strings;
    }
    }


