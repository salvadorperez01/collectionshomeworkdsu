package sv.com.collections;

import java.io.IOException;
import java.util.*;

public class CollectionsTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * I created a list for every single collection containing the implementation there to avoid too much code on the main
		 * */
		
		/*
		 * HashSet Example String
		 * */
		//testingHashSet();
		Scanner sc = new Scanner(System.in);
		
		int opt = 0;
		int lc;
		
		do {
			System.out.println("Select an option : ");
			System.out.println("1 - testingHashSet()");
			System.out.println("2 - testingTreeset()");
			System.out.println("3 - testingLinkedHashSet()");
			System.out.println("4 - testingArrayList()");
			System.out.println("5 - testingVector()");
			System.out.println("6 - testingLinkedList()");
			System.out.println("7 - testingPriorityQueue()");
			System.out.println("8 - testingHashTable()");
			System.out.println("9 - testingHashMap()");
			System.out.println("10 - testingLinkedHashMap()");
			System.out.println("11 - testingTreeMap()");
			System.out.println("12 - Terminar programa");
			opt = sc.nextInt();
			switch(opt) {
			case 1:
				testingHashSet();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 2:
				testingTreeset();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 3:
				testingLinkedHashSet();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 4:
				testingArrayList();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 5:
				testingVector();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 6:
				testingLinkedList();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 7:
				testingPriorityQueue();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 8:
				testingHashTable();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 9:
				testingHashMap();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 10:
				testingLinkedHashMap();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 11:
				testingTreeMap();
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				System.out.println("Press enter to continue");
				lc = System.in.read();
				break;
			case 12:
				System.out.println("Terminando programa");
				break;
			default:
				System.out.println("Select a valid option");
				opt=10;
				System.out.println("----------------------------------------");
				System.out.println("----------------------------------------");
				break;
			}
		}while(opt != 12);
		
	}
	
	public static void testingHashSet() {
		Set<String> newHashSet = new HashSet<String>();
		System.out.println("Adding Salvador to the set : " + newHashSet.add("Salvador"));
		System.out.println("Adding Antonio to the set : " + newHashSet.add("Antonio"));
		System.out.println("Adding Maria to the set : " + newHashSet.add("Maria"));
		System.out.println("Adding Salvador to the set : " + newHashSet.add("Salvador")); // We print false since "Salvador" is already in the set
		System.out.println("----------------------------------------");
		System.out.println("Iterating the Hashset");
		Iterator<String> it = newHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing Salvador from the list : " + newHashSet.remove("Salvador"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the set after removal");
		it = newHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testingTreeset() {
		Set<Persona> newTreeSet = new TreeSet<Persona>();
		System.out.println("Adding Salvador obj to the set : " + newTreeSet.add(new Persona(2, "Salvador", 26)));
		System.out.println("Adding Salvador obj to the set : " + newTreeSet.add(new Persona(2, "Salvador", 26)));/* Would add only the first one since we have objects with the same attributes*/
		System.out.println("Adding Maria obj to the set : " + newTreeSet.add(new Persona(3, "Maria", 30)));
		System.out.println("Adding Mariano obj to the set : " + newTreeSet.add(new Persona(1, "Mariano", 28)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the TreeSet");
		for(Persona persona : newTreeSet) {
			System.out.println(persona);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing Maria from the list (Object with same attributes): " + newTreeSet.remove(new Persona(3, "Maria", 30)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the set after removal");
		for(Persona persona : newTreeSet) {
			System.out.println(persona);
		}
	}
	
	public static void testingLinkedHashSet() {
		Set<Persona> newLinkedHashSet = new LinkedHashSet<Persona>();
		System.out.println("Adding Salvador obj to the set : " + newLinkedHashSet.add(new Persona(2, "Salvador", 26)));
		System.out.println("Adding Salvador obj to the set : " + newLinkedHashSet.add(new Persona(2, "Salvador", 26)));/* Would add only the first one since we have objects with the same attributes*/
		System.out.println("Adding Maria obj to the set : " + newLinkedHashSet.add(new Persona(3, "Maria", 30)));
		System.out.println("Adding Mariano obj to the set : " + newLinkedHashSet.add(new Persona(1, "Mariano", 28)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedHashSet");
		for(Persona persona : newLinkedHashSet) {
			System.out.println(persona);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing Maria from the list (Object with same attributes): " + newLinkedHashSet.remove(new Persona(3, "Maria", 30)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the set after removal");
		for(Persona persona : newLinkedHashSet) {
			System.out.println(persona);
		}
	}
	
	public static void testingArrayList() {
		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
		System.out.println("Adding 1 to the list : " + newArrayList.add(1)); 
		System.out.println("Adding 1 to the list : " + newArrayList.add(1));// We can add as many duplicate values as we want
		System.out.println("Adding 1 to the list : " + newArrayList.add(1)); // We can add as many duplicate values as we want
		System.out.println("Adding 2 to the list : " + newArrayList.add(2));
		System.out.println("Adding 3 to the list : " + newArrayList.add(3));
		System.out.println("Adding 4 to the list : " + newArrayList.add(4));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the ArrayList");
		for(Integer num : newArrayList) {
			System.out.println(num);
		}
		System.out.println("----------------------------------------");
		System.out.println("Replacing the element at position 2 with value 8 " + "previous value : " + newArrayList.set(2, 8));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the ArrayList after replacing value");
		for(Integer num : newArrayList) {
			System.out.println(num);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the element at position 5 " + "value removed : " + newArrayList.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the ArrayList after removal");
		for(Integer num : newArrayList) {
			System.out.println(num);
		}
	}
	
	public static void testingVector() {
		Vector<Integer> newVector = new Vector<Integer>();
		System.out.println("Adding 1 to the list : " + newVector.add(1)); 
		System.out.println("Adding 1 to the list : " + newVector.add(1));// We can add as many duplicate values as we want
		System.out.println("Adding 1 to the list : " + newVector.add(1)); // We can add as many duplicate values as we want
		System.out.println("Adding 2 to the list : " + newVector.add(2));
		System.out.println("Adding 3 to the list : " + newVector.add(3));
		System.out.println("Adding 4 to the list : " + newVector.add(4));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the Vector");
		for(Integer num : newVector) {
			System.out.println(num);
		}
		System.out.println("----------------------------------------");
		System.out.println("Replacing the element at position 2 with value 8 " + "previous value : " + newVector.set(2, 8));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the Vector after replacing value");
		for(Integer num : newVector) {
			System.out.println(num);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the element at position 5 " + "value removed : " + newVector.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the Vector after removal");
		for(Integer num : newVector) {
			System.out.println(num);
		}
	}
	
	public static void testingLinkedList() {
		LinkedList<String> newLinkedList = new LinkedList<String>();
		System.out.println("Adding 1 to the list : " + newLinkedList.add("Salvador")); 
		System.out.println("Adding 1 to the list : " + newLinkedList.add("Salvador"));// We can add as many duplicate values as we want
		System.out.println("Adding 1 to the list : " + newLinkedList.add("Salvador")); // We can add as many duplicate values as we want
		System.out.println("Adding 2 to the list : " + newLinkedList.add("Lilian"));
		System.out.println("Adding 3 to the list : " + newLinkedList.add("Krissia"));
		System.out.println("Adding 4 to the list : " + newLinkedList.add("Alejandra"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedList");
		for(String string : newLinkedList) {
			System.out.println(string);
		}
		System.out.println("----------------------------------------");
		System.out.println("Replacing the element at position 2 with string Alemarpa " + "previous string : " + newLinkedList.set(2, "Alemarpa"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedList after replacing value");
		for(String string : newLinkedList) {
			System.out.println(string);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the element at position 5 " + "value removed : " + newLinkedList.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the Vector after removal");
		for(String string : newLinkedList) {
			System.out.println(string);
		}
	}
	
	public static void testingPriorityQueue() {
		PriorityQueue<Persona> newPriorityQueue = new PriorityQueue<Persona>();
		System.out.println("Adding Salvador obj to the queue : " + newPriorityQueue.add(new Persona(2, "Salvador", 26)));
		System.out.println("Adding Salvador obj to the queue : " + newPriorityQueue.add(new Persona(2, "Salvador", 26)));/* Would add as well this one since the queue allows duplicates*/
		System.out.println("Adding Maria obj to the queue : " + newPriorityQueue.add(new Persona(3, "Maria", 30)));
		System.out.println("Adding Mariano obj to the queue : " + newPriorityQueue.add(new Persona(1, "Mariano", 28)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the PriorityQueue");
		for(Persona persona : newPriorityQueue) {
			System.out.println(persona);
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the obj Salvador " + "value removed : " + newPriorityQueue.remove(new Persona(2, "Salvador", 26)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the PriorityQueue after removal");
		for(Persona persona : newPriorityQueue) {
			System.out.println(persona);
		}
	}
	
	public static void testingHashTable() {
		Hashtable<Integer, String> newHashTable = new Hashtable<Integer, String>();
		newHashTable.put(5, "Alejandro");
		newHashTable.put(0, "Salvador");
		newHashTable.put(1, "Salvador");
		newHashTable.put(2, "Salvador");
		Enumeration<Integer> newEnum = newHashTable.keys();
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashTable");
		while(newEnum.hasMoreElements()) {
			int currKey = newEnum.nextElement();
			System.out.println(currKey + " " + newHashTable.get(currKey));
		}
		System.out.println("Replacing the value of key 1 with string Alemarpa " + "previous value : " + newHashTable.replace(1, "Alemarpa"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashTable after the update");
		newEnum = newHashTable.keys();
		while(newEnum.hasMoreElements()) {
			int currKey = newEnum.nextElement();
			System.out.println(currKey + " " + newHashTable.get(currKey));
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the key 5 " + "with value removed : " + newHashTable.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashTable after removal");
		newEnum = newHashTable.keys();
		while(newEnum.hasMoreElements()) {
			int currKey = newEnum.nextElement();
			System.out.println(currKey + " " + newHashTable.get(currKey));
		}
	}
	
	public static void testingHashMap() {
		HashMap<Integer, String> newHashMap = new HashMap<Integer, String>();
		newHashMap.put(5, "Alejandro");
		newHashMap.put(0, "Salvador");
		newHashMap.put(1, "Salvador");
		newHashMap.put(2, "Salvador");
		Iterator<Integer> newIt= newHashMap.keySet().iterator();
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashMap");
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newHashMap.get(currKey));
		}
		System.out.println("Replacing the value of key 1 with string Alemarpa " + "previous value : " + newHashMap.replace(1, "Alemarpa"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashMap after the update");
		newIt= newHashMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newHashMap.get(currKey));
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the key 5 " + "with value removed : " + newHashMap.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the HashMap after removal");
		newIt= newHashMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newHashMap.get(currKey));
		}
	}
	public static void testingLinkedHashMap() {
		LinkedHashMap<Integer, String> testingLinkedHashMap = new LinkedHashMap<Integer, String>();
		testingLinkedHashMap.put(5, "Alejandro");
		testingLinkedHashMap.put(0, "Salvador");
		testingLinkedHashMap.put(1, "Salvador");
		testingLinkedHashMap.put(2, "Salvador");
		Iterator<Integer> newIt= testingLinkedHashMap.keySet().iterator();
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedHashMap");
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + testingLinkedHashMap.get(currKey));
		}
		System.out.println("Replacing the value of key 1 with string Alemarpa " + "previous value : " + testingLinkedHashMap.replace(1, "Alemarpa"));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedHashMap after the update");
		newIt= testingLinkedHashMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + testingLinkedHashMap.get(currKey));
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the key 5 " + "with value removed : " + testingLinkedHashMap.remove(5));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the LinkedHashMap after removal");
		newIt= testingLinkedHashMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + testingLinkedHashMap.get(currKey));
		}
	}
	
	public static void testingTreeMap() {
		TreeMap<Integer, Persona> newTreeMap = new TreeMap<Integer, Persona>();
		Persona persona1 = new Persona(2, "Salvador" , 26);
		newTreeMap.put(persona1.getId(), persona1);
		Persona persona2 = new Persona(1, "Pablo" , 30); 
		newTreeMap.put(persona2.getId(), persona2);
		Persona persona3 = new Persona(2, "Henry" , 21); // It won't add this record since the key has been used already
		newTreeMap.put(persona3.getId(), persona3);
		Persona persona4 = new Persona(4, "Cristina" , 22);
		newTreeMap.put(persona4.getId(), persona4);
		Iterator<Integer> newIt= newTreeMap.keySet().iterator();
		System.out.println("----------------------------------------");
		System.out.println("Iterating the TreeMap");
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newTreeMap.get(currKey));
		}
		System.out.println("Replacing the value of key 1 with a new object " + "previous value : " + newTreeMap.replace(1, new Persona(1, "Andrea", 28)));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the TreeMap after the update");
		newIt= newTreeMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newTreeMap.get(currKey));
		}
		System.out.println("----------------------------------------");
		System.out.println("Removing the key 5 " + "with value removed : " + newTreeMap.remove(4));
		System.out.println("----------------------------------------");
		System.out.println("Iterating the TreeMap after removal");
		newIt= newTreeMap.keySet().iterator();
		while(newIt.hasNext()) {
			int currKey = newIt.next();
			System.out.println(currKey + " " + newTreeMap.get(currKey));
		}
	}

}
