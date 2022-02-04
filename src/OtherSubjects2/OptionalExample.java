package OtherSubjects2;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> input = Optional.ofNullable(null);

        System.out.println(input.isPresent());
        System.out.println(input.isEmpty());

        String orElse = input
                .map(String::toUpperCase)
                .orElse("Empty"); //Input stringinin içi boş ise default olarak "empty" stringini atar

//        String orElseException = input
//                .map(String::toUpperCase)
//                .orElseThrow(IllegalAccessError::new);

        input.ifPresentOrElse(System.out::println, () -> System.out.println("World")); //Present true ise mevcut değeri degilse "world" u yazar
    }
}
