package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public void sayHelloTo(String name) {
		System.out.println("Hello " + name);
	}

	public void sayGoodByeTo(String name) {
		System.out.println("GoodBye " + name);
	}

	public void sayThanksTo(String name) {
		System.out.println("Thanks " + name);
	}

	public void sayWelcomeTo(String name) {
		System.out.println("Welcome " + name);
	}

	public void sayNiceToMeetYouTo(String name) {
		System.out.println("Nice to meet you " + name);
	}

	public void sayBeetOffTo(String name) {
		System.out.println("Beet off " + name);
	}

	public String getName() {

		File f = new File("./config.prop");
		FileInputStream fis;
		String line = null;
		try {
			fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			line = br.readLine();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return line;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		String name = demo.getName();
		demo.sayHelloTo(name);
		demo.sayGoodByeTo(name);
		demo.sayThanksTo(name);
		demo.sayWelcomeTo(name);
		demo.sayNiceToMeetYouTo(name);
		demo.sayBeetOffTo(name);

	}

}
