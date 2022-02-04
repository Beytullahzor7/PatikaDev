package OtherSubjects2;

import java.util.Optional;

public class AvoidNullPointer {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmet", null);
//        String email = p1.getEmail()
//                .map(String::toUpperCase)
//                .orElse("email not provided");
//
//        System.out.println(email);

        if(p1.getEmail().isPresent()){
            String email =  p1.getEmail().get();
            System.out.println(email.toLowerCase());
        }else{
            System.out.println("Email Not Provided");
        }
    }
}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String > getEmail() { //By doing this we allowed that email might be null
        return Optional.ofNullable(email);
    }
}
