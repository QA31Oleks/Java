package org.generalPractice.Lists;

import java.util.*;
public class CreateEditRemove {
    public static void main(String[] args) {
        // Create Integer type
        List<Integer> l1 = new ArrayList<>();
        // Create String type
        List<String> s1 = new ArrayList<>();

        // Adding elements to object of List interface
        // Custom inputs
        l1.add(0, 1);
        l1.add(1, 2);
        // Element index 0 wasn't deleted
        // output [3, 1, 2]
        l1.add(0, 3);

        // Now remove the current object from the updated
        // List
        l1.remove(0);

        // Print the elements inside the object
        System.out.println(l1);

        // Creating another object of the List
        List<Integer> l2 = new ArrayList<>();

        // Again adding elements to object of List interface
        // Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        // output [1, 1, 2, 3, 2]
        l1.addAll(1, l2);

        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);

        // Printing the updated List 1
        System.out.println(l1);

        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        // in List 1
        l1.set(0, 5);

        // Again printing the updated List 1
        System.out.println(l1);

        // Returns the index of the first
        // occurrence of the specified
        // element in the list, or -1 if
        // the element is not found
        // output -1
        System.out.println(l1.indexOf(10));

        // Accessing elements using get() method
        String first = s1.get(0);

        // Checking if element is present
        // using contains() method
        // output False
        boolean isPresent = s1.contains("Geeks");
    }
}
