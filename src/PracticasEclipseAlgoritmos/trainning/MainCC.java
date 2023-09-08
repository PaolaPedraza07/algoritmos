package PracticasEclipseAlgoritmos.trainning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MainCC {

    public static void main(String[] args) {

        System.out.println("COMPARABLE TESTING");
        //Implementing Comparable
        LifeForm lf1 = new LifeForm(25, "Jose");
        LifeForm lf2 = new LifeForm(13, "Sebastian");
        LifeForm lf3 = new LifeForm(30, "Marisol");

        ArrayList<LifeForm> list = new ArrayList<>();
        list.add(lf1);
        list.add(lf2);
        list.add(lf3);
        System.out.println("LifeForm List BEFORE sorting: ");

        for (LifeForm var: list)
        {
            System.out.println(var.toString());
        }
        System.out.println("--------------------");

        Collections.sort(list);
        System.out.println("LifeForm List AFTER sorting: ");
        for (LifeForm var: list)
        {
            System.out.println(var.toString());
        }
        System.out.println("--------------------");


        //Implementing Comparator

        System.out.println("COMPARATOR TESTING");

        Person person1 = new Person(1.8,15);
        Person person2 = new Person(1.6,20);
        Person person3 = new Person(1.4,28);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println("Person List BEFORE Sorting: ");
        System.out.println(Arrays.toString(personList.toArray()));
        System.out.println("-----------------------------");


        Comparator<Person> compHeight = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getHeight() > o2.getHeight())
                    return +1;
                else
                    return -1;
            }
        };

        Collections.sort(personList, compHeight);
        System.out.println("Person List AFTER Sorting by Height:");
        System.out.println(Arrays.toString(personList.toArray()));
        System.out.println("-----------------------------");



        Comparator<Person> compAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge())
                    return +1;
                else
                    return -1;
            }
        };
        Collections.sort(personList, compAge);
        System.out.println("Person List AFTER Sorting by Age:");
        System.out.println(Arrays.toString(personList.toArray()));
        System.out.println("-----------------------------");


    }
}

class LifeForm implements Comparable<LifeForm> {

    public int age;
    public String name;

    public LifeForm(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LifeForm{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(LifeForm other) {
        if (this.getAge() > other.getAge())
            return +1;
        else
            return -1;
    }
}

class Person
{
    public double height;
    public int age;

    public Person(double height, int age) {
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", age=" + age +
                "}";
    }
}
