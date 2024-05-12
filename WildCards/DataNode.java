package com.example.mypackage;

public class DataNode <E>{
	private E data;
	private DataNode<? extends Number> next;
	public DataNode(E data,DataNode<E> next) {
		this.data=data;
		this.next=(DataNode<? extends Number>) next;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public DataNode<? extends Number> getNext() {
		return next;
	}
	public void setNext(DataNode<? extends Number> next) {
		this.next = next;
	}

	public String toString() {
		return "DataNode[data=" +data+",next= "+next +"]";
	}
}
//extends is used so that only Number and it's subtypes can be used
