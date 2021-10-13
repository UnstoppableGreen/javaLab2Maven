package com.java_lab2task1;
import com.package1.TestStr;
import com.helloWorldLocal.LocalTestStr;

import org.joda.time.LocalTime;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = new LocalTime();
		System.out.println("Hello, world! (from current app) "+LocalTestStr.str+' '+ " Current Time: "+currentTime);
	}

}
