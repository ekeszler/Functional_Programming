package collections.streamsempty.mapoperations;

import collections.streamsempty.helperclasses.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOp {
    public static void main(String[] args) {
        //1. genereaza o noua lista, cu numerele din lista initiala impartite la 2
        List<Integer> numbers = List.of(2, 4, 6, 8);

        List<Integer> newList = numbers.stream()
                .map(number -> number/2)
                .collect(Collectors.toList());
        System.out.println(newList);



        //2. printeaza elementele din lista cu litere mari
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");
        // map() is used to convert each name to upper case.
        // Note: The map() method does not modify the original list.

        list.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());


        //3. printeaza lungimile fiecarui String din lista

        list.stream()
                .map(name -> name.length())
                .forEach(name -> System.out.println(name));

        System.out.println(list);

        //4. genereaza o lista cu numele job-urilor din lista de job-uri
        List<Job> jobs = Arrays.asList(
                new Job("programator", "programeaza aplicatii", 12000),
                new Job("contabil", "tine contabilitatea", 5000));

        System.out.println(getJobNames(jobs));
        }
    public static List<String> getJobNames (List<Job> jobs){
        return jobs.stream()
                .map(job -> job.getTitle())
                .collect(Collectors.toList());

    }


}
