package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list

       LinkedList <Integer> integers = new LinkedList<>();

        //  - add 4 as the first element of the list

        integers.addFirst(4);

        //  - then add 5, 6, 8, 2, 9 to the list

        Collections.addAll(integers, 5, 6, 8, 2, 9);

        //  - add another 2 as the last element of the list

        integers.addLast(2);

        //  - add 4 as the 3rd element of the list

        integers.add(2, 4);

        //  - invoke the method element() on the list and print the result on the screen

        System.out.print(integers.element());
       

        //  - return the list

        return integers;

    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack

        Stack <Integer> integers = new Stack<>();

        //  - add 5, 6, 8, 9 to the stack

        Collections.addAll(integers, 5, 6, 8, 9 );

        //  - print the first element of the stack on the screen

        System.out.print(integers.firstElement());

        //  - print the last element of the stack on the screen

         System.out.print(integers.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen

        int poppedStack = integers.pop();

         System.out.print(poppedStack);

        //  - invoke the push(4) method on the stack

        integers.push(4);

        //  - return the stack
        
        return integers;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque

        ArrayDeque <Integer> integers = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the queue

        Collections.addAll(integers, 5, 6, 8, 9);

        //  - print the first element of the queue on the screen

        System.out.print(integers.getFirst());

        //  - print the last element of the queue on the screen

        System.out.print(integers.getLast());

        //  - invoke the method poll() on the queue and print the result on the screen

        integers.poll();

        System.out.print(integers);

        //  - invoke the element() method on the queue and print the result on the screen

        System.out.print(integers.element());

        //  - return the queue
       
        return integers;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map

        Map<Integer, String> programs = new HashMap<>();

        //  - add {1, TypeScript} entry to the map

        programs.put(1, "TypeScript");

        //  - add {2, Kotlin} entry to the map

        programs.put(2, "Kotlin");

        //  - add {3, Python} entry to the map

         programs.put(3, "Python");

        //  - add {4, Java} entry to the map

         programs.put(4, "Java");

        //  - add {5, JavaScript} entry to the map

         programs.put(5, "JavaScript");

        //  - add {6, Rust} entry to the map

         programs.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen

        Set<Integer> keys = programs.keySet();
        System.out.print(keys);


        //  - determine the set of values from the map and print it on the screen

        Collection<String> value = programs.values();


        System.out.print(value);


        for (Map.Entry<Integer, String> entry : programs.entrySet()) {

            System.out.print( entry.getValue());
        };
        

        //  - determine whether the map contains "English" as a language and print the result on the screen

        Boolean hasLanguage = programs.containsValue("English");

        System.out.print(hasLanguage);


        //  - return the map
       
        return (HashMap<Integer, String>) programs;
        
    }

    public String getName() {
        return "Collections Exercises";
    }
}
