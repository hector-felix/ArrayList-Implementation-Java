/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class Driver {

    public static void main(String[] args) {

        int searchNum = 60;
        int indexNum = 4;
        //here, we create object of AL, and test methods
        DHArrayList<Integer> myList = new DHArrayList<>();
        System.out.println(myList);
        

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        myList.add(3,200);
        System.out.println("Number in Index " + indexNum +" is "+myList.get(indexNum));
        System.out.println(myList);
        myList.set(3,300);
        System.out.println(myList);
        System.out.println("Index of " + searchNum + " is " + myList.indexOf(searchNum));
        System.out.println(myList.getSize());
    }
}
