package test4;
	import java.util.ArrayList;
	import java.util.List;
	
	public class HW049 {
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("ya");
	        list.add("by");
	        list.add("c");

	        List<String> res = noYY(list);
	        System.out.println(res);
	    }

	    public static List<String> noYY(List<String> strings) {
			List<String> res = new ArrayList<>();
	      
	      for (String str : strings){
	        str += "y";
	        if(!str.contains("yy")){
	        res.add(str);
	      }
	    }
	  	return res;
	    }
	}
