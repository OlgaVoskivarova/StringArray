import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        //Создайте массив из 5 строк. Используя метод length() строк,
        // найдите строку с наибольшей длиной и строк с наименьшей длиной.
        //Выведите массив и полученный строки в консоль.

        String [] strings = new String[5];
        strings [0] = "Monday";
        strings [1] = "Tuesday";
        strings [2] = "Wednesday";
        strings [3] = "Thursday";
        strings [4] = "Friday";

        String min = strings[0];
        String max = strings [0];

        for (int i = 0; i < strings.length; i++){
            if (min.length() > strings[i].length()){
                min = strings[i];
            }if (max.length() < strings [i].length()){
                max = strings[i];
        }

        }
        System.out.println(Arrays.toString(strings));
        System.out.println("Элемент массива с минимальной длиной строки " +  min);
        System.out.println("Элемент массива с максимальной длиной строки " + max);


    }
}

//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args){
//    //Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        //Выведите массив на консоль в строку.
//        //Замените каждый элемент с нечетным индексом на ноль.
//        //Снова выведете массив на консоль в отдельной строке.
//        //Отсортируйте массив по возрастанию.
//        //Снова выведете массив на консоль в отдельной строке.
//
//        int [] numbers = new int [8];
//        for ( int i = 1; i < numbers.length; i++ ){
//            Random random = new Random();
//             numbers [i] = random.nextInt(1, 50);
//            System.out.println(numbers[i]);
//        }
//        String asString = Arrays.toString(numbers);
//        System.out.println(asString);
//
//        for (int i = 0; i< numbers.length; i++ ){
//            if (i%2 ==1){
//                numbers[i] =0;
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        Arrays.sort(numbers);
//        for ( int i:numbers ){
//            System.out.println(i + ", ");
//
//        }
//
//    }
//
//}