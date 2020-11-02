/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemovDupe {

    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer item : list) {
            if (!temp.contains(item)) {
                temp.add(item);
            }
        }
        String op = Arrays.toString
        (temp.toArray()).replace("[", "").replace("]", "").replace(",", "");

        System.out.println("The distinct integers are " + op);
    }

    public static void main(String[] args) {
        String[] numbers;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        System.out.print("Enter 10 integers: ");
        numbers = (scanner.nextLine().split(" "));
        for (int i = 0; i < numbers.length; i++) {
            numberList.add(Integer.parseInt(numbers[i]));
        }

        scanner.close();

        removeDuplicate(numberList);
    }

}
