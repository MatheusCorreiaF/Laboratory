package br.com.cod3r.factory.realfactory.apple;

import br.com.cod3r.factory.realfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.realfactory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.realfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.realfactory.apple.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.realfactory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("### Ordering an iPhone 11");
		IPhone iPhone = new IPhone11Factory().orderIPhone();
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhone 11 Pro");
		iPhone = new IPhone11ProFactory().orderIPhone();
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhoneX");
		iPhone = new IPhoneXFactory().orderIPhone();
		System.out.println(iPhone);
		System.out.println("### Ordering an iPhone XS Max");
		iPhone = new IPhoneXSMaxFactory().orderIPhone();
		System.out.println(iPhone);

	}
}
