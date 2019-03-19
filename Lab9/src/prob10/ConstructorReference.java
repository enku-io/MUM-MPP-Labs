package prob10;

import prob7b.TriFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human {
    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {
    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};

        // Query 1  : Print only Female canditates names
        Arrays.asList(list).stream()
                .filter(h->h.getGender().equalsIgnoreCase("female"))
                .forEach(System.out::println);

        // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status
        Function<String,Human> constructor1 = Human::new;
        System.out.println(constructor1.apply("Enkusellasie"));
        BiFunction<String,Integer,Human> constructor2 = Human::new;
        System.out.println(constructor2.apply("Enkusellasie",24));
        TriFunction<String,Integer,String,Human>constructor3 = Human::new;
        System.out.println(constructor3.apply("Enkusellasie",24,"M"));
        // Query 3 : Count the male candidates whose age is more than 30
        Arrays.asList(list).stream()
                .filter(h->h.getGender().equalsIgnoreCase("male"))
                .filter(h->h.getAge()>30)
                .count();


    }


}
