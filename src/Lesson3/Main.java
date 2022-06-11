package Lesson3;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    static Integer[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        // First part homework
        ArrReplaceClass<Object> ArrReplaceClass = new ArrReplaceClass<>();
        try {
            System.out.println(Arrays.toString(ArrReplaceClass.ArrReplacePos(arr, 4, 9)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

        // Second part homework
        Apple apple1 = new Apple(0.100);
        Apple apple2 = new Apple(0.120);
        Apple apple3 = new Apple(0.115);
        Apple apple4 = new Apple(0.230);
        Apple apple5 = new Apple(0.160);

        ArrayList<Apple> applesList = new ArrayList<>(10);
        applesList.add(apple1);
        applesList.add(apple2);
        applesList.add(apple3);
        applesList.add(apple4);
        applesList.add(apple5);
        Box<Apple> box1 = new Box<>(applesList);

        Apple apple6 = new Apple(0.300);
        Apple apple7 = new Apple(0.330);
        ArrayList<Apple> applesList2 = new ArrayList<>(10);
        applesList2.add(apple6);
        applesList2.add(apple7);
        Box<Apple> box2 = new Box<>(applesList2);

        Orange orange1 = new Orange(0.300);
        Orange orange2 = new Orange(0.330);
        Orange orange3 = new Orange(0.300);
        Orange orange4 = new Orange(0.330);
        Orange orange5 = new Orange(0.300);
        Orange orange6 = new Orange(0.330);

        ArrayList<Orange> orangeList = new ArrayList<>(10);
        orangeList.add(orange1);
        orangeList.add(orange2);
        orangeList.add(orange3);
        orangeList.add(orange4);
        orangeList.add(orange5);
        orangeList.add(orange6);
        Box<Orange> box3 = new Box<>(orangeList);

        Orange orange7 = new Orange(0.330);
        ArrayList<Orange> orangeList2 = new ArrayList<>(10);
        orangeList2.add(orange7);
        Box<Orange> box4 = new Box<>(orangeList2);

        System.out.println("Вес коробки: " + apple1.getName() + " " + box1.getWeightList());
        System.out.println("Вес коробки: " + apple6.getName() + " " + box1.getWeightList());
        System.out.println("Вес коробки: " + orange1.getName() + " " + box3.getWeightList());
        System.out.println("Вес коробки: " + orange7.getName() + " " + box3.getWeightList());


        System.out.println(box1.compareList(box2));
        System.out.println(box1.compareList(box3));

        box1.toShiftList(box2);

        box4.toShiftList(box3);

    }

}
