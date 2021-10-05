import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringDemo {

	int count = 1;

	Map<Character, Integer> map = new HashMap<Character, Integer>();

	public Character getMaxOccurance(String s) {

		Character maxChar = null;

		for (int i = 0; i < s.length(); i++) {

			Character c = s.charAt(i);
			if (map.get(c) == null) {
				map.put(c, 1);
			}

			else {
				map.put(c, map.get(c) + 1);
			}

		}

		Iterator<Entry<Character, Integer>> it = map.entrySet().stream().iterator();

		while (it.hasNext()) {
			Character ch = it.next().getKey();
			int charCount = map.get(ch);
			if (charCount > count) {
				count = charCount;
				maxChar = ch;

			}
		}
		return maxChar;

	}
	public static void main(String[] args) {
		StringDemo sd= new StringDemo();
		System.out.println(sd.getMaxOccurance("sarthak"));
	}

}
