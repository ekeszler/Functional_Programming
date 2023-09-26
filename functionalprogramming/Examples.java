package collections.streamsempty.functionalprogramming;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {

//        (x,y) -> x % y == 0

        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        System.out.println(isDivisible.apply(8, 4));

        Function <String, Integer> lengthCalculator = s -> s.length();
        System.out.println(lengthCalculator.apply("java"));


        RadioBroadcast digiFM = message -> System.out.println("esi la digiFM " + message);
        RadioBroadcast kissFM = message -> System.out.println("esti la kissFM " + message);

        digiFM.play("emisiune digi");
        kissFM.play("emisiune kiss");

        Calculator sum = (a,b) -> a+b;
        System.out.println(sum.doOperation(2,3));

        Calculator calculator = new Calculator() {
            @Override
            public int doOperation(int a, int b) {
                return 0;
            }
        };
        calculator.doOperation(2,4);

        printResultOfLambda( s -> s.length());

        printResultOfLambda(s ->{
            int count = 0;
            for(Character c : s.toCharArray()){
                if(Character.isDigit(c)){
                    count++;
                }
            }
            return count;
        });

        //functions
        //vrem sa convertim un string in numar

        Function<String, Integer> converter = s -> Integer.parseInt(s);
        System.out.println(converter.apply("2000"));

        //operatorts

        UnaryOperator<Integer> multiplier = x -> x*100;
        System.out.println(multiplier.apply(2));

        IntUnaryOperator multiplier2 = x -> x*100;
        System.out.println(multiplier2.applyAsInt(3));

        BinaryOperator<String> concatenari = (s1, s2) -> s1+s2;
        System.out.println(concatenari.apply("abc", "def"));

        //predicates (intra ceva iese boolean)

        Predicate<Character> isDigit = c -> Character.isDigit(c);
        isDigit.test('h');

        IntPredicate isEven = x -> x % 2 ==0;
        System.out.println(isEven.test(8));

        //suppliers (intra ceva nu iese nimic)

        Supplier<String> stringSupplier = () -> "hello";
        System.out.println(stringSupplier.get());

        //consumers
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello");

        BiConsumer<String, String> greeter = (s1, s2) -> System.out.println(s1+s2);
        greeter.accept("hello ", "world");


    }

    private static void printResultOfLambda(Function<String, Integer> function){
        System.out.println(function.apply("happy new year 2024"));
    }
}
