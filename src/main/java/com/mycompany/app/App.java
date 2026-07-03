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




        //bug -123
		public void m1(String t){
			System.out.println(t);
		}

       
		public void m2(String y){
		System.out.println(y);
		}

		public void m3(String u){
			System.out.println(u);
		}

			public void m3(String g){
			System.out.println(g);
		}


    }
}
