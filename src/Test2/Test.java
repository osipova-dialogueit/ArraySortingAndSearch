package Test2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.lang.Object;

/**
 * @project Test
 * @user: tosipova
 **/
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//("Enter array size: ");

        System.out.println("Enter array size: ");

        if (scanner.hasNextInt()) {
            int arrSize = scanner.nextInt();

            if (arrSize >= 10) {

                List<Integer> arrList = new ArrayList<>(); //List
                for (int i = 0; i < arrSize; i++) {
                    arrList.add(i+1);
                }
                System.out.println(arrList);
                Random random = new Random();
                int randValue = random.nextInt(arrSize);
                System.out.println(randValue);
                arrList.remove(randValue);
                System.out.println(arrList);
                //Collections.shuffle(arrList);
                arrSize = arrList.size();
                for (int j = 0; j < 100; j++) {
                    int randShuffle = random.nextInt(arrSize);
                    int elemValue = arrList.get(randShuffle);
                    arrList.remove(randShuffle);
                    arrList.add(elemValue);
                }

                System.out.println(arrList);

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
