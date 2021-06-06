package StackAndQueue;

import java.util.LinkedList;

enum AnimalType{
	DOG, CAT;
}

abstract class Animal{
	AnimalType type;
	String name;
	int order;
	Animal(AnimalType type, String name){
		this.type = type;
		this.name = name;
	}
	void setOrder(int order) {
		this.order= order;
	}
	int getOrder() {
		return order;
	}
	String info() {
		return order +") type : " + type + ", name : " + name;
	}
}

class Dog extends Animal{
	Dog(String name){
		super(AnimalType.DOG, name);
	}
}

class Cat extends Animal{
	Cat(String name){
		super(AnimalType.CAT, name);
	}
}

class AnimalShelter{
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	int order;
	AnimalShelter(){
		order =1; 
	}
}
public class Test03 {
	public static void main(String[] args) {

	}
}
