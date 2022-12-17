package test4;
	import java.util.HashMap;
	import java.util.Map;

	public class HW052 {
	    public static void main(String[] args) {
	        Map<String, String> input = new HashMap<>();
	        input.put("a", "Hi");
	        input.put("b", "There");

	        Map<String, String> res = mapAB(input);
	        System.out.println(res);
	    }

	    public static Map<String, String> mapAB(Map<String, String> map) {
	        // your code goes here
	      Map<String, String> m = new HashMap<String, String>(map);
	      if (m.get("a")!=null&&m.get("b")!=null) {
	      m.put("ab",m.get("a")+m.get("b"));
	      }
	
	  return m;
	  }
	}
