package collections.streamsempty;

import java.util.List;
import java.util.stream.Collectors;

public class Examples {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,5,7,6,2,9,7,8);
        int count = 0;
        for(Integer number : numbers){
            if (number > 5){
                count++;
            }
        }
        System.out.println(count);

        long countNumbers = numbers.stream()
                .filter(number -> number > 5)
                .count();
        System.out.println(countNumbers);

        List<String> companies = List.of("Google" , "Amazon" , "Samsung", "GOOGLE" , "amazon" , "Oracle");

        List<String> filterCompanies = companies.stream()
                .map(company -> company.toUpperCase())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(filterCompanies);
    }
}
