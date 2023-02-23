/**
 * Seminar3_DZ
 */
import java.util.ArrayList;
import java.util.Random;
public class Seminar3_DZ {
public static void main(String[] args) {
    Integer [] arr = {56,2,3,4,7,8,3,1};
    negative(arr);
    minMaxAdv();
}
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа 
// (в языке уже есть что-то готовое для этого)
private static void negative (Integer [] array) {
    ArrayList <Integer> arrNegative = new ArrayList<>();  
    for (int i = 0; i < array.length; i++) {
        if (array [i] % 2 == 0){
            arrNegative.add(array [i]);
        }
    }
    arrNegative.toString();
    System.out.println("Задача 1");
    System.out.println(arrNegative);
    System.out.println();
   
}

// 2. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка.

private static void minMaxAdv() {


    Random rnd = new Random();
    ArrayList <Integer> arrMinMaxAdv = new ArrayList<>(20);

    for (int i = 0; i < 20; i++) {
        arrMinMaxAdv.add(rnd.nextInt(100));
    }
    int max = arrMinMaxAdv.get(0);
    int min = arrMinMaxAdv.get(0);
    double adv = 0;
    int count = 0;

    for (int j = 0; j < arrMinMaxAdv.size(); j++) {
        if (arrMinMaxAdv.get(j) < min){
            min = arrMinMaxAdv.get(j);
        }
        if (arrMinMaxAdv.get(j) > max){
            max = arrMinMaxAdv.get(j);
        }
        count = count + arrMinMaxAdv.get(j);
    }
    adv = (double) count / arrMinMaxAdv.size();
    arrMinMaxAdv.toString();
    System.out.println("Задача 2");
    System.out.println(arrMinMaxAdv);
    System.out.println("min = " + min);
    System.out.println("max = " + max);
    System.out.println("Среднее арифметическое = " + adv);
}
}