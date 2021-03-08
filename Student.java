package project1;

public class Student {

    String name;
    int id;
    double percentage;
    String[] skills;

    public Student (String name, int id, double percentage, String[] skills)
    {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
        this.skills = skills;

    }
    public String getName()
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


    public void setName(String name)
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


