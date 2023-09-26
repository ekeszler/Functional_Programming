package collections.streamsempty.mapoperations;

import collections.streamsempty.helperclasses.Book;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOp {

    public static void main(String[] args) {
        //1. returneaza o lista formata din toate caracterele din lista de liste
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("a","b","c"));
        list.add(Arrays.asList("d","e","f"));
        list.add(Arrays.asList("g","h","i"));
        list.add(Arrays.asList("j","k","l"));

        System.out.println(list);

        List<String> allCharacters = list.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
        System.out.println(allCharacters);

//        Stream<List<String>> stream1 = list.stream();
//        Stream<String> stream2 = stream1.flatMap(l -> l.stream());





        //2. returneaza o lista cu toti autorii care incep cu o anumita litera, din lista de carti
        List<Book> javaBooks = List.of(
                new Book("Java EE 7 Essentials", List.of("Arun Gupta")),
                new Book("Algorithms",  List.of("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", List.of("Robert Martin"))
        );
        System.out.println(findAuthorsWhoStartWith(javaBooks, "R"));


    }

    public static Set<String> findAuthorsWhoStartWith (List<Book> books, String letter){
        return books.stream()
                .flatMap(book -> book.getAuthors().stream())
                .filter(author -> author.startsWith(letter))
                .collect(Collectors.toSet());
    }
}
