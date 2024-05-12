package com.example.mypackage;

public class LinkedList {

	public static void main(String[] args) {
		DataNode<Integer> node2=new DataNode<Integer>(20,null);
		DataNode<Integer> node1=new DataNode<Integer>(35,node2);
		DataNode<Double> node5=new DataNode<Double>(54.55,null);
		DataNode<Double> node3=new DataNode<Double>(14.32,node5);
		DataNode<Number> node4=new DataNode<>(Double.valueOf(45.3),null);		
		System.out.println(node1.toString());
		System.out.println(node3.toString());
	}

}
