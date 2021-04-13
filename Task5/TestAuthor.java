package session6.Task5;

public class TestAuthor {
    public static void main(String[] args) {
        // test constructor and toString()
        Author ahTeck = new Author("Tan Ah Teck ", "teck@nowhere.com", 'm');
        System.out.println(ahTeck); // toString()
         // tan ah teck (m) at teck@nowwhere.com

        //  test setters and getters
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck); // toString()
        //  tan ah teck (m) at teck@somewhere.com
        System.out.println("name is " + ahTeck.getName());
        // name is tan ah teck
        System.out.println("gender is " + ahTeck.getGender());
//        gender is:m
        System.out.println("email is " + ahTeck.getEmail());
        // email is:teck@somewhere.com

    }

}
