package collections.streamsempty;



import collections.streamsempty.helperclasses.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOp {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23,"India"));
        list.add(new Person("Joe", 18,"USA"));
        list.add(new Person("Ryan", 54,"Canada"));
        list.add(new Person("Iyan", 5,"India"));
        list.add(new Person("Ray", 63,"China"));
        //1. printeaza prima persoana gasita din lista care este din India

        Optional<Person> personOptional = list.stream()
                .filter(person -> person.getCountry().equals("India"))
                .findFirst();
        if(personOptional.isPresent()){
            System.out.println(personOptional.get());
        }

    }

}
