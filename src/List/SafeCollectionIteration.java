package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SafeCollectionIteration {
	public static void main(String args[]){
		List list = Collections.synchronizedList(new ArrayList());
		list.add("xiaohui");
		list.add("shushu");
		synchronized (list){
			Iterator iter = list.iterator();
			while(iter.hasNext()){
				String s = (String) iter.next();
				System.out.println(s);
			}
		}
	}
}
