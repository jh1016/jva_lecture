package com.urdomain.ch10;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		chageDog(dog);
		
		Cat cat = new Cat();
		chageDog(cat);
	}
	
	public static void chageDog(Animal aniaml) {
		/*if(animal instanceof Dog{
			Dod dog = (Dog) animal;	//ClassCastException 발생 가능
		*/}
	}

	class Animal{}
	class Dog extends Animal{}
	class Cat extends Animal{}
