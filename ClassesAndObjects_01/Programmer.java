package it.ClassesAndObjects_01;

public class Programmer {


     public String name;
     public Integer age;
     public boolean isAlive;
     public boolean wearsGlasses;


        public void DrinkCoffe(){
            System.out.println("Espresso is the secret!");
        }


        public void printDetails(){
            System.out.println("NameHere is a AgeHere-yo programmer" + "   " + name + " - " + age + "  " + "is alive?" + " - " + isAlive );
        }

        public void hasGlasses(){
            System.out.println("Is NameHere wearing glasses?" + "  " + wearsGlasses);
        }


}
