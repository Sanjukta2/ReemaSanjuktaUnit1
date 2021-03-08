package project1;

public class Student {  // Student class declared

    String name;            // instance variables   created
    int id;
    double percentage;
    String[] skills;

    public Student (String name, int id, double percentage, String[] skills) // constructor
    {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        this.skills = skills;

    }
    public String getName()           //getters
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

    public double getPercentage()
    {
        return percentage;
    }

    public String[] getSkills()
    {
        return skills;
    }


    public void setName(String name)       // setters
    {
        this.name = name;
    }

    public void setId(int id)
    {
       this.id = id;
    }

    public void setPercentage(double percentage)
    {
       this.percentage = percentage;
    }

    public void setSkills(String[] skills)
    {
        this.skills = skills;
    }

}


