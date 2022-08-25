 public class Student9{
	private String name;
	private String grade;
	private int age;
	  public Boolean isPassed(double grade){
		  return null;
		  
	 }
	 public String setname(){
		 return  name;
	 }
	 public String setgrade(){
		 return grade;
	 }
	 public int setage(){
		 return age;
	 }
	 public void getname(String name){
		 this.name=name;
	 }
		 public void getgrade(String grade){
			 this.grade=garde;
		 }
		 public void getage(int age){
			 this.age=age;
		 }
 class Undergraduate extends Student{
	 public Boolean  is passed(double grade){
		 if(grade>70.0)
			 return true;
		 return false;
	 }
	 class Grad extends Student{
		  public Boolean  is passed(double grade){
		 if(grade>80.0)
			 return true;
		 return false;
	 }
	 public class Ques8{
		 public static void main(string args[]){
			 undergraduate ug=new Undergraduate();
			 Grad g=new Grad();
			 ug.setname("tanuja");
			 ug.setgrade("A");
			 ug.setage=20;
			 System.out.println("ug.getname()"+id.getid()+"ug.age+"ug.grad);
			 if(ug.isPassed(ug.grade))
			 {
				 
				 System.out.println("passed");
			 }
			 else{
				 System.out.println("fail");
			 }
			 g.setname("tanvi");
			 g.setgrade("b");
			 g.setage=78.8;
			 System.out.println("ug.getname()"+id.getid()+"ug.age+"ug.grad);
			 if(g.isPassed(g.grade))
			 {
				 
				 System.out.println("passed");
			 }
			 else{
				 System.out.println("fail");
			 }
		 }
	 }
	 }
 }