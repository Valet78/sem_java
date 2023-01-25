/*
 * Напиасать программу вычисления n-го треугольного числа 
 */

package sem_1;

import java.util.ArrayList;
import java.util.Scanner;
 
  public class zad_1 {
    
    public static void main(String[] args) {
        Scanner in_scan = new Scanner (System.in, "Cp1251");
        System.out.print("Введите натуральное целое число n для вычесления n-го треугольного числа: n=");        
        int in_num = in_scan.nextInt();
        
        // Выведем последовательность треугольных чисел Tn
        tringle_list(in_num);
        
        // Вычисление и вывод n-го треугольного числа
        tringle_num(in_num);
        
        in_scan.close();

    }

    public static void tringle_list(int num){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for( int i = 1; i <= num; i++){
            res.add((i * (i + 1)) / 2);
        }
        System.out.print("Последовательность треугольных чисел Tn: ");
        System.out.println(res);
    }
    
    public static void tringle_num(int num){
        int res = (num * ++num) / 2;
        System.out.printf("n-ое треугольное число для n=%d: %d", num - 1, res);        
    }
    
 }