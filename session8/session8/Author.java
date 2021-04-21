package hocjava.fpt.session8;

public class Author {
//     the private instance variables
    private String name;
    private String email;
    private char gender;

    // constructor a author instance with the given inputs
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    // the pulic getters and setters for the private varibles
    // no setters for name genders as they not designed to be chaining
    // return the name
    public String getName(){
        return name;
    }
    // return get gender
    public char getGender(){
     return gender;
    }

    // return get email
    public String getEmail(){
        return email;
    }

//    set the email

    public void setEmail(String email){
        this.email = email;
    }

    // return a self-descriptive String
    public String toString(){
        return name + "("+gender+") at" + email;
    }

}
