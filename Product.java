class MyException extends Exception
{
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
public class Product
{
   void productCheck(int weight) throws MyException{
	if(weight<100){
		throw new MyException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	Product obj = new Product();
        try
        {
            obj.productCheck(60);
        }
        catch (MyException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}