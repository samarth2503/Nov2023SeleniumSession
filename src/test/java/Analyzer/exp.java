package Analyzer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class exp {

	public static void main(String[] args) {
		
		  String txt = "TestMe";
	      Map<Character,Integer> hm = new HashMap<Character,Integer>();

	      for (int i=0;i<txt.length();i++)
	      {
	          if(hm.containsKey(txt.charAt(i)))
	          {
	              hm.put(txt.charAt(i),hm.get(txt.charAt(i))+1);
	          }
	          else{
	              hm.put(txt.charAt(i),1);
	          }
	      }
	      
	      Iterator<Entry<Character,Integer>> it = hm.entrySet().iterator();
	      
	      while(it.hasNext())
	      {
	          Entry<Character, Integer> e = (Entry<Character, Integer>) it.next();
	          
	          System.out.println(e.getKey()+" "+e.getValue());
	      }

	}

}
