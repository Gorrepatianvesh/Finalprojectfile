import java.util.Scanner;

public class Job {
	private ParttimeJob partime ;
	private FullTimejob fulltime;
	String description = "";
	  
	public String getDescription() {
		return description;
	}
	
	public Job() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void type()
	{
		int number;
		System.out.println("Which type of job do you want?");
		System.out.println("1. part time");
		System.out.println("2. full time");

	    Scanner in = new Scanner(System.in);
		number=in.nextInt();

		if(number == 1)
		{
			// Decorator pattern
			home h  = new home(partime);
			System.out.println(h.getjob());
		}
		else if(number == 2)
		{
			// Decorator pattern
			office o=new office(fulltime);
			System.out.println(o.getjob());
	    }

		else
		{
	          System.out.println("Please enter the valid choice!!!");

		}
	}

}
