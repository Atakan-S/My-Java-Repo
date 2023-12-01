package day53_Collections2;

import java.util.*;

public class C02_QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priortiyQue = new PriorityQueue<>();
        priortiyQue.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));
        priortiyQue.add(18);
        priortiyQue.add(5);
        System.out.println("priortiyQue = " + priortiyQue);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));
        arrayDeque.add(18);
        arrayDeque.add(5);
        System.out.println("arrayDeque = " + arrayDeque);
        Queue<Integer> linkedlist = new LinkedList<>();
        linkedlist.addAll(Arrays.asList(52,1,13,14,6,753,6,7,900,0));
        System.out.println("linkedlist = " + linkedlist);
        linkedlist.add(18);
        linkedlist.add(5);
        System.out.println("linkedlist = " + linkedlist);
//priortiyQue.get()
// arrayDeque.get()
        System.out.println("((List)linkedlist).get(1) = " + ((List) linkedlist).get(1));
        System.out.println("priortiyQue = " + priortiyQue);
        System.out.println("priortiyQue.peek() = " + priortiyQue.peek());
        System.out.println("priortiyQue.poll() = " + priortiyQue.poll());
        System.out.println("priortiyQue = " + priortiyQue);
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque.peek() = " + arrayDeque.peek());
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println("--------------------------------------");
        Set<Integer> hashset = new HashSet<>();//dup yok sıralamada yok
        hashset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
        hashset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
        hashset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
        hashset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));

        System.out.println("hashset = " + hashset);
//        hashset.get(3)
Set<Integer> linkedHashSet = new LinkedHashSet<>();// dup yok ama sıralama muhafaza edilir
       linkedHashSet.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
       linkedHashSet.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
       linkedHashSet.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
       linkedHashSet.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20,null));
        System.out.println("linkedHashSet = " + linkedHashSet);
        System.out.println("---------------------------------------------");


        Set<Integer> treeset = new TreeSet<>();
        treeset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20));
        treeset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20));
        treeset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20));
        treeset.addAll(Arrays.asList(20,300,40,5,60,75,70,15,100,15,100,20));
        System.out.println("treeset = " + treeset);


    }

}
