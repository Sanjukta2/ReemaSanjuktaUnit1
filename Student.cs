using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnitTestProject3
{
    class Student                                         // Student Class created
    {
        String name;                                               // instance variables are declared
        int id;
        double percentage;
        String[] skills;

        public Student (String name, int id, double percentage, String[] skills)         // constructor for Student class created for object creation and instance variable initialization
        {
            this.name = name;
            this.id = id;
            this.percentage = percentage;
            this.skills = skills;

        }
        public String getName()                         //getter to get the name of a student class object 
        {
            return this.name;
        }
        public int getId()                                   // getter to get the id of a student class object 
        {
            return this.id;
        }

        public double getPercentage()                           //getter to get the percentage of a student class object 
        {
            return this.percentage;
        }

        public String[] getSkills()                        // getter to get the array of Skills of a student class object 
        {
            return this.skills;
        }


        public void setName(String name)         //  setter to set the name of a student class object
        {
            this.name = name;
        }

        public void setId(int id)                   //   setter to set the id of a student class object 
        {
           this.id = id;
        }

        public void setPercentage(double percentage)                //  setter to  set the percentage of a student class object       
        {
           this.percentage = percentage;
        }

        public void setSkills(String[] skills)                               //  setter to set the array of Skills of a student class object 
        {
            this.skills = skills;
        }

    }
}
