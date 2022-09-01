abstract class Shape{
	 String color;
	 boolean filled;
	 Shape()
	{
	    color="green";
		filled=true;
	}
	Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getcolor(){
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public boolean filled(){
		return filled;
	}
	public void setfilled(boolean filled){
		this.filled=filled;
	}
	public String toString(){
		if(this.filled==true){
			return "Shape with color "+this.color+"and"this. filled;
		}else{
		       return "Shape with color"+this.color+" and "this.not filled";
		}
	}
    abstract double getArea();
	
	public static void main(String args[]){
		Shape shape=new Shape();
	}
}
//it is not possible with abstract class 
    public	class circle extends shape{
       double getArea(){
		   return 0;
	   }		
	}
	final class rectangle extends shape{
		int length;
		int width;
		Rectangle(int length,int width){
			this.length=length;
			this.width=width;
		}
		double getArea(){
			return 0;
		}
		
	}
//as the rectangle class is final so it can not be inherited.
public class Square extends Rectangle{
	Square(){
		suoer(10,10);
		System.out.println("length :" +super.length);
		System.out.println("width :" +super.width);
	}
	public static void main(String args[])
	{
		Square square=new Square();
		if(square.length==square.width){
			System.out.println("The rectangle class is square");
		}
	}
}