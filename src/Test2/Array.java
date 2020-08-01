package Test2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.lang.Object;

/**
 * @project Test
 * @user: tosipova
 **/
public class Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//("Enter array size: ");

        System.out.println("Enter array size: ");

        if (scanner.hasNextInt()) {
            int arrSize = scanner.nextInt();

            if (arrSize >= 10) {

                int[] array = new int[arrSize];          //заполнение
                for (int i = 0; i < arrSize; i++) {
                    array[i] = i + 1;
                }
                System.out.println("Массив: " + Arrays.toString(array));
                Random random = new Random();
                int randValue = random.nextInt(arrSize);
                System.out.println("Удалено: " + array[randValue]);

                int[] newArray = new int[arrSize - 1];   //удаление
                int k = 0;
                for (int i = 0; i < arrSize; i++) {
                    if (i != randValue) {
                        newArray[k] = array[i];
                        k++;
                    }
                }
                array = newArray;
                arrSize = arrSize - 1;
                System.out.println("После удаления : " + Arrays.toString(newArray));
                for (int i = 0; i < 100; i++) {            //перемешивание
                    int rand1 = random.nextInt(arrSize);
                    for (int j = 0; j < arrSize; j++) {
                        if (j == rand1) {
                            int temp = array[j];
                            int shuffle = (arrSize - 1) - j;
                            array[j] = array[shuffle];
                            array[shuffle] = temp;
                        }
                    }
                }
                System.out.println("Перемешано: " + Arrays.toString(array));

                for (int i = 0; i < arrSize; i++) {         //сортировка
                    int min = array[i];
                    for (int j = i + 1; j < arrSize; j++) {
                        if (array[j] < min) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                        min = array[i];
                    }
                }
                System.out.println("Отсортировано: " + Arrays.toString(array));

                int min = 0;
                int max = arrSize - 1;
                int check = max/2;
                while (true) {
                    if ((array[check] == check + 1) && (array[check+1] != check + 2)) {
                        System.out.println("Найден недостающий элемент:" + (check + 2));
                        break;
                    }
                    else {
                        if (array[check] == check + 1) {
                            min = check + 1;
                        } else
                            max = check - 1;
                        }
                        check = (max-min) / 2 + min;
            }

            }else try {
                throw new InputException("Integer value must be >= 10.");
            } catch (InputException e) {
                e.printStackTrace();
            }
        } else try {
            throw new InputException("Enter integer value.");
        } catch (InputException e) {
            e.printStackTrace();
        }

    }

}
