package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

		int i = 10;

        String s = "hii";

		//bug-201
		static{
			System.out.println("hii");
		}

        System.out.println("Hello World!");

		System.out.println("Good morning!..");
    }
}
