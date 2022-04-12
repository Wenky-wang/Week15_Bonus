package inClass;

import java.util.ArrayList;

// right-click the java file > New > JUnit Test Case
public class ArrayListDemo {

	ArrayList<Integer> list = null;
	
	public ArrayListDemo() {
		list = new ArrayList<>();
	}
	
	public ArrayListDemo(int value) {
		list  = new ArrayList<>();
		list.add(value);
	}
	
	public void add(int value) {
		list.add(value);
	}
	
	public void add(int position, int value) {
		list.add(position, value);
	}
	
	public void remove(int position) {
		list.remove(position);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int indexOf(int value) {
		return list.indexOf(value);
	}
	
	public int get(int position) {
		return list.get(position);
	}
	
	public int size() {
		return list.size();
	}
	
}