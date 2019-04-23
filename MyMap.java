import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static boolean isUnique(Map < String, String > m) {
		int count = 0;
		Set st = m.entrySet();
		Iterator itr2 = st.iterator();
		Iterator itr1 = st.iterator();
		while (itr1.hasNext()) {
		Map.Entry map1 = (Map.Entry) itr1.next();
		count = 0;
		while (itr2.hasNext()) {
		Map.Entry map2 = (Map.Entry) itr2.next();
		if (map1.getValue().equals(map2.getValue())) {
		count++;
		}
		if (count > 1)
		return false;
		}
		}
		return true;
		}

}
