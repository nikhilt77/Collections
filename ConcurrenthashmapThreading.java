package com.example.mypackage;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrenthashmapThreading extends Thread{
	static ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
	public static void main(String args[]) throws InterruptedException {
		ConcurrenthashmapThreading con=new ConcurrenthashmapThreading();
		map.put(1,"Js");
		map.put(2,"React");
		map.put(3,"CSS");
		map.put(4,"Bootstrap");
		con.start();
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry=(Entry) itr.next();
			System.out.println("Key="+entry.getKey()+" Value="+entry.getValue());
			Thread.sleep(1000);
		}
	}
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		map.put(5,"HTML");
	}

}
