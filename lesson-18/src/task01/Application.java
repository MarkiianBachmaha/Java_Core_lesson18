package task01;

import java.util.ArrayList;
import java.util.List;

public class Application {

	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		list.add(26);

		addToList(list);

		System.out.println(list);

	}

	/*
	 * Yes, it is possible. When using parameterization, any type information is
	 * lost. Therefore, when compiling Integer i String is essentially one type,
	 * because they become a 'low-level' List type.
	 */

	public static <T> void addToList(List<T> list) {
		list.add((T) "String");
	}

}