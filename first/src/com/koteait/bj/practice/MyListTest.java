package com.koteait.bj.practice;

public class MyListTest {

	public static void main(String args[]) {

		MyList list = new MyList();

		list.add(20);
		list.add(60);
		list.add(50);
		list.remove(0);

		list.print();

	}
}

class MyList {
	private int[] arr = new int[0];
	void add(int num) {
		int[] temp = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length - 1] = num;
		arr = temp;
	}

	void add(int index, int num) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				temp[i] = arr[i];
			} else {
				temp[i + 1] = arr[i];
			}
		}
		temp[index] = num;
		arr = temp;
	}

	void remove() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	void remove(int index) {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < index; i++) {
			temp[i] = arr[i];
		}
		for (int i = index; i < temp.length; i++) {
			temp[i] = arr[i+1];
		}
		arr = temp;
	}

	void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
