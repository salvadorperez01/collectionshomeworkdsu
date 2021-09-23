package sv.com.collections;

import java.util.*;

public class HashSetImplementation {
	private Set<String> newHashSet;
	
	public HashSetImplementation() {
		this.newHashSet = new HashSet<String>();
	}
	
	public void add(String string) {
		this.newHashSet.add(string);
	}
	
	public void remove(String string) {
		this.newHashSet.remove(string);
	}
	
	public void iterate() {
		Iterator<String> it = this.newHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
