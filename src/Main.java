import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList <String> listA=new ArrayList<>();
       ArrayList <String> listB=new ArrayList<>();
       ArrayList <String> listC=new ArrayList<>();

        System.out.println("Введите 5 мужских имен!");//список А
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Список А:" + listA);
        //--------------------------------------------
        System.out.println("Введите 5 женских имен!");//список Б
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список Б:" + listB);
        //--------------------------------------------
        for (int i = 0; i < 5; i++) {
            //обьединяющий список С
            listC.add(listA.get(i));
            listC.add(listB.get(4-i));//Б5 Б4 Б3 Б2 Б1
        }
        System.out.println("Список С" + listC);
         Collections.sort(listC,
                 Comparator.comparing(String::length));

        System.out.println("Отсортированный список С" + listC);

    }
}