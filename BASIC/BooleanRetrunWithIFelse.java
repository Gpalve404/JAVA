/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class BooleanRetrunWithIFelse
{
    
    int a=2;
    boolean dis()
    {
        return(a==2);
    }
    
    
    void display()
    
    {
        if(dis())
        {
            System.out.println("pass"+dis());
        }
        
        else{
            System.out.println("fail");
        }
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
	Main o = new Main();
	o.display();
	    
	    
	}
}
