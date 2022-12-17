package test4;

import java.util.HashMap;
import java.util.Map;

public class HW051 {
	public static void main(String[] args) {
		Map<String, String> input = new HashMap<>();
		input.put("a", "candy");
		input.put("b", "dirt");

		Map<String, String> res = mapBully(input);
		System.out.println(res);
	}

	public static Map<String, String> mapBully(Map<String, String> map) {
		// your code goes here
		Map<String, String> m = new HashMap<String, String>(map);
		if (map.get("a") != null) {
			m.put("b", map.get("a"));
			m.put("a", "");
		}

		return m; 
	}
}
