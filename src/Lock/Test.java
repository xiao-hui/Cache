package Lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
	Map<String,String> map = new HashMap<String,String>();
	ReentrantReadWriteLock rw = new ReentrantReadWriteLock();
	public Object getData(String key){

		rw.readLock().lock();
		Object result=null;
		try {
			result = map.get(key);
			if(result == null){
				rw.readLock().unlock();
				rw.writeLock().lock();
				if(result == null){
					try {
						result = "new";
					} finally{
						rw.writeLock().unlock();
					}
					rw.readLock().lock();
				}
			}
		} finally{
			rw.readLock().unlock();
		}
		
		return key;
		
	}
}
