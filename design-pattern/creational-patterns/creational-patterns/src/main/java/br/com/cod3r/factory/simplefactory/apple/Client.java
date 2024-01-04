package br.com.cod3r.factory.simplefactory.apple;

import br.com.cod3r.factory.simplefactory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.simplefactory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {


		System.out.println("### Ordering an iPhone 11");
		IPhone iPhone = new IPhoneFactory().orderIPhone("11","C");
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhone 11 Pro");
		iPhone = new IPhoneFactory().orderIPhone("11","E");
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhoneX");
		iPhone = new IPhoneFactory().orderIPhone("X","C");
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhone XS Max");
		iPhone = new IPhoneFactory().orderIPhone("X","E");
		System.out.println(iPhone);
	}
}
