package session13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
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


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("rajeev",25));
        users.add(new User("johjn",34));
        users.add(new User("steve",29));

        users.forEach(user -> {
            System.out.println("name:" +user.getName()+",age:"+user.getAge());
        });

    }


}
