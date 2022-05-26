package javaOOP.overriding;

public abstract class Person {
	public void eat () {
		System.out.println("Suat com 20000 VND");
	}
	
	public abstract void sleep();
	
	public final void walk() {
		System.out.println("Di bo");
	}

}
