package project1;
import java.util.Scanner; 
public class Operations extends Student{          // derived class inheriting base class
	
	public Operations(String name, int id, double percentage, String[] skills)  // construtor created
        {
		super(name,id,percentage,skills);
       
        }
	
	public void changeName(String newName)      // method to change name through parameter
	{
		this.name = newName;
	}
	
	public void changeName()                     //method to change name through user input
	{
		 Scanner sc = new Scanner(System.in); 
		  
	        // String input 
	     String newName = sc.nextLine(); 
	     this.name = newName;
	     
	}
	public void addSkills(String Skill)               // method to add skills upto a count of 5
	{
		Scanner sc = new Scanner(System.in); 
		int count ;
		System.out.println("input number of skills");
		count = sc.nextInt();
		if(count<6)
		{
			for(int i = 0;i<count;i++)
			{
				skills[i] = sc.nextLine();
			}
		}
		else
		{
			System.out.println("input skills less than 6 ");
		}
	}
	
}
