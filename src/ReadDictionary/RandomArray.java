package ReadDictionary;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    private int sizeArray; // размер массива

    private int[] arrayNumber; // объявление массива
    private boolean count = true; // статус второго цикла (цикл постоннояй генерации числа, пока не выпадет не повторное)
    private boolean checkZero = true; // статус ячейки с нулем, если занесли ноль меняется на false
    private Random rnd = new Random(); // создание новой переменной случайного числа


    //          конструктор принимающий размер массива
    public RandomArray(int sizeArray) {
        this.sizeArray = sizeArray;

        arrayNumber = new int [sizeArray];

        for (int i = 0; i < sizeArray; i++) {                   // первый цмкл зависит от размера массива
            count = true;

            while (count) {                                     // второй цикл генерации числа до не повторного
                int rndNumber = rnd.nextInt(0, sizeArray);
//               System.out.println(Arrays.toString(massNumber)); проверка на всяк случай


                if (rndNumber == 0 & checkZero) {               // проверка на ноль и если первый ноль запись его
                    arrayNumber[i] = 0;
                    checkZero = false;
                    break;

                }

                for (int n = 0; n <= i; n++) {                  // третий цикл пробегает по всем ячейкам и сверяет
                    if (arrayNumber[n] == rndNumber) {          // со сгенерированным числом, если новое, то запись
                        break;
                    } else if (arrayNumber[n] != rndNumber & n == i) {
                        arrayNumber[i] = rndNumber;
                        count = false;
                    }
                }

            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arrayNumber));
    }

    public int[] getArrayNumber() {
        return arrayNumber;
    }
}
