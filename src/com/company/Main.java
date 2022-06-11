package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int a=20;
        Random random=new Random();
        int[] array=new int[a];
        System.out.print("Unsorted array: ");
        for (int j=0;j<array.length;j++){
            array[j]= random.nextInt(0,2);
            System.out.print(array[j]+" ");
        }
        System.out.println();
        sorted(array);

        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.print("Unsorted array list: ");
        for (int i=0;i<a;i++){
            arrayList.add(random.nextInt(0,2));
        }
        System.out.println(arrayList);
        sorted(arrayList);

        LinkedList<Integer> linkedList=new LinkedList<>();
        System.out.print("Unsorted linked list: ");
        for (int i=0;i<a;i++){
            linkedList.add(random.nextInt(0,2));
        }
        System.out.println(linkedList);
        sorted(linkedList);

    }
    public static void sorted(int[] array){
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println();

    }
    public static void sorted(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.print("Sorted array list: ");
        for (Integer a:arrayList) {
            System.out.print(a+" ");
        }
        System.out.println();

    }
    public static void sorted(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        System.out.print("Sorted linked list: ");
        for (int a:linkedList) {
            System.out.print(a+" ");
        }
        System.out.println();

    }

}
