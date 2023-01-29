/*
 * +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
 * Пример 1: а = 3, b = 2, ответ: 9 
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 * Пример 4: а = 0, b = 0, ответ: не определено
 * Пример 5
 *        входные данные находятся в файле input.txt в виде
 *          b 3
 *          a 10
 * Результат нужно сохранить в файле output.txt
 *          1000 
 */

package sem_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.Math;
import java.nio.charset.Charset;


public class dz {       
    // public static Selper rrr = new Selper();
    public static HashMap<String, Integer> tr = new HashMap<>();


    public static void main(String[] args) {
        String[] textFromFile = new String[0];


        textFromFile = DataFromFile();
        // Вычленим переменные
        for(String i: textFromFile){
            // System.out.println(i);
            SelectData(i);
        }
        // Теперь вычисляем значение
        int a = tr.get("a");
        int b = tr.get("b");
        String forZap = "";
        if(a != 0){
            double resStep = Stepen(a, b);
            forZap = String.valueOf(resStep);
        }
        else {
            forZap = "не определено";
        }

        // Выводим результат          
        DataInFile(forZap);

    }
    // Вычленяем значения переменных
    static void SelectData(String inText){
        String [] resTxt = new String[]{};
        resTxt = inText.split(" ");
        tr.put(resTxt[0].toString(), Integer.parseInt(resTxt[1]));
    }

    // Чтение данных из файла
    static String[] DataFromFile(){
        String[] resData = new String[0];
        String lineStr = "";
        int lenMass = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(".//sem_2//input.txt", Charset.forName("UTF-8")))) {            
            while((lineStr = br.readLine()) != null){
                resData = Arrays.copyOf(resData, lenMass + 1);
                resData[lenMass] = lineStr;
                lenMass++;
            }            
        }
        catch(IOException ex){
            System.out.println("Файл не найден!");
        }
        return resData;
    }

    //
    static void DataInFile(String txtZap){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(".//sem_2//output.txt", Charset.forName("UTF-8")))) {
		        bw.write(txtZap);
		    }
		    catch(IOException ex){		
		        System.out.println(ex.getMessage());
		    }
    }

    // Вычисляем степень числа
    static double Stepen(int inA, int inB){
        return Math.pow((double) inA, (double) inB);
    }

}
