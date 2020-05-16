package ua.example.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OrElseVsOrElseGetComparison {

    public static void main(String[] args) {
        Pocket pocket = new Pocket();

        for (int i = 0; i < 5; i++) {
            System.out.println("Step " + i);
            Phone phone = pocket.findPhoneById(i)
                                 .orElse(new Phone("Brand new & expensive"));
            System.out.println(phone);
        }
    }

    public static Phone buyNewPhone() {
        System.out.println("Buying new expensive phone");
        return new Phone("Brand new & expensive");
    }
}

class Pocket {
    private Map<Integer, Phone> phones;

    Pocket() {
        phones = new HashMap<>();
        phones.put(1, new Phone("Samsung"));
        phones.put(2, new Phone("iPhone"));
        phones.put(3, new Phone("The red one"));
    }

    Optional<Phone> findPhoneById(Integer id) {
        return Optional.ofNullable(phones.get(id));
    }
}


class Phone {
    private String name;

    Phone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                "}\n";
    }
}

















