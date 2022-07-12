package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();

        list.add("Ana");
        list.add("Bob");
        list.add("Marco");
        list.add("Maria");
        list.add(2,"jose");
        list.remove("maria");

        for(String x:list){
            System.out.println(x);
        }

        System.out.println("__________________________");
        list.removeIf(x -> x.charAt(0)=='M');
        for (String x:list){
            System.out.println(x);
        }

        System.out.println("____________________________");
        System.out.println("Index of Bob"+ list.indexOf("Bob"));
        System.out.println("Index of Marco"+ list.indexOf("Marco"));
        System.out.println("____________________________");

        List<String> result = list.stream().filter(x-> x.charAt(0)=='A')
                .collect(Collectors.toList());
            for(String x:result){
                System.out.println(x);
            }
            System.out.println("________________________");
            String name = list.stream().filter(x->x.charAt(0)=='j').findFirst().orElse(null);
            System.out.println(name);
        }

    }

