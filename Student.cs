using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UnitTestProject3
{
    class Student                                         // Class creation
    {
        String name;                                               // instance variables 
        int id;
        double percentage;
        String[] skills;

        public Student (String name, int id, double percentage, String[] skills)             // constructor 
        {
            this.name = name;
            this.id = id;
            this.percentage = percentage;
            this.skills = skills;

        }
        public String getName()                         //getter 
        {
            return name;
        }
        public int getId()                                   // getter
        {
            return id;
        }

        public double getPercentage()                           //getter
        {
            return percentage;
        }

        public String[] getSkills()                        // getter
        {
            return skills;
        }


        public void setName(String name)         //  setter
        {
            this.name = name;
        }

        public void setId(int id)                   //   setter
        {
           this.id = id;
        }

        public void setPercentage(double percentage)                //  setter        
        {
           this.percentage = percentage;
        }

        public void setSkills(String[] skills)                               //  setter
        {
            this.skills = skills;
        }

    }
}
