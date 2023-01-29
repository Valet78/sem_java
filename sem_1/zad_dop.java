package sem_1;
/*
 * Имеются натуральные числа A и B, где A < B
 * Робот (исполнтель) имеет две кнопки К1 и К2. Кнопки К1 увеличивает значение А в С раз, К2 прибавляет D к Аб
 * C, D - натуральные числа. 
 * Вопрос: сколько существует способов А "превратить" в В с помощью К1 и К2 ?
 * 
 * Например: А=2, В=9, С=2 и D=1 последовательность  нажатий кнопок
 *          1. А=2 + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) -> В=9
 *          2. А=2 * 2(нажали К1) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) -> В=9
 *          3. А=2 * 2 (нажали К1)* 2(нажали К1) + 1(нажали К2) -> В=9
 *          
 *          4. А=2 + 1(нажали К2) * 2(нажали К1) + 1(нажали К2) + 1(нажали К2) + 1(нажали К2) -> В=9
 *          5. А=2 + 1(нажали К2) + 1(нажали К2) * 2(нажали К1) + 1(нажали К2) -> В=9          
 * 
 */
import java.util.Scanner;
// import java.util.Arrays;                                     // НЕ ДОДЕЛАЛ ЕЩЁ !!!!

public class zad_dop {
    public static Scanner numer = new Scanner(System.in, "Cp1251");
    

    public static void main(String[] args) {
        
        int[][] res_mass = new int[][]{};
        int[] rt = new int[]{};
        int a = in_num("A");
        int b = in_num("B");
        int c = in_num("C");
        int d = in_num("D");

        
        // rt = new_size(rt, 5);
        

        // int c_raz = (b - a) / c;
        // int temp = 0;
        // for (int i = 0; i < c_raz; i++){
        //     for (int k = 0; k <= b - a; k += d){
        //         temp = i * a * c + k * d;   // Имитируем нажатие кнопки К1 i раз и добор k нажийем кнопки К2        
        //         // temp = (a + k * d) * i * c;    // не доработал ещё !!!
        //         if (temp > b) continue;
        //         else {
        //             System.out.printf("temp = %d \ti = %d \tk = %d\n", temp, i, k);
        //         // res[i][k]
        //         }
        //     }
        //     System.out.println();
        // }


        // System.out.printf("%d раз\n", c_raz);

        // var_1(a, b, c, d);


        numer.close();
    }
    
    
    // Запрсос числа
    static int in_num(String txt){        
        System.out.print("Введите значение " + txt + ": ");
        int num = numer.nextInt();
        // System.out.print("\n");        
        return num;
    }
    
    // изменение размера массива in_rt на n единиц с сохранением данных
    static int[] new_size(int[] in_rt, int n){
        int len = in_rt.length + n; 
        int[] res = new int[len];
        for(int i = 0; i < in_rt.length; i++){
            res[i] = in_rt[i];
        }
        return res;
    }




    // Вариант 1
    static void var_1(int in_a, int in_b, int in_c, int in_d){
        int[] res = new int[]{2, 3, 4, 5, 6};
        
        // return res;
    }
    
}
