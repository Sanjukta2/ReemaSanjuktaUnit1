package project1;
import java.util.Scanner; 
public class Operations extends Student{
	
	public Operations(String name, int id, double percentage, String[] skills) 
    {
		super(name,id,percentage,skills);
       
    }
	
	public void changeName(String newName)
	{
		this.name = newName;
	}
	
	public void changeName()
	{
		 Scanner sc = new Scanner(System.in); 
		  
	        // String input 
	     String newName = sc.nextLine(); 
	     this.name = newName;
	     
	}
	public void addSkills(String Skill)
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
