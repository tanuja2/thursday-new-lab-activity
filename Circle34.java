package com.LabTest;
public class Circle34{
	private static int count;
	float centre ,radius;
	public Circle34(float c,float r){
		this.centre=c;
		this.radius=r;
		count++;
	}
	Circle34 (){
		System.out.println("this a default constructor");
		count++;
	}
	void display(){
		System.out.println("centre:"+centre+" " +"+radius"+radius);
	}
	public static void main(String args[]){
		circle34 c1=new Circle34(12,4f,23,7f);
		circle34 c2=new Circle34(22,4f,24,9f);
		c1.display();
		c2.display();
		Circle34 c3=new Circle34();
		System.out.println("total no. of Instance:"+Circle.count);
	}
}