package SeleniumSession;

import java.util.HashMap;
import java.util.Map;

public class SeleniumWithHashMap {

	public static void main(String[] args) {

		// HashMap K,V
		
		Map<String,Object> m1 = new HashMap<String,Object>();
		
		m1.put("name", "Tom");
		m1.put("age", 10);
		m1.put("gender", "M");
		
		m1.put("name", "peter");
		m1.put("name", "Kevin");
		
		System.out.println(m1.get("name"));
		System.out.println(m1.get("gender"));

	}

}
