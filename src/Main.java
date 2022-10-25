import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.print("Задание 4");
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i2 = reverseFullName.length - 1; i2 >= 0; i2--)
            System.out.print(reverseFullName[i2]);
        System.out.println();
        System.out.println("Задание 1");
        System.out.println();
        int [] sum = new int[30];
        sum[0] = 102_000;
        sum[1] = 100_000;
        sum[2] = 103_000;
        sum[3] = 104_000;
        sum[4] = 105_000;
        sum[5] = 110_000;
        sum[6] = 117_000;
        sum[7] = 118_000;
        sum[8] = 133_000;
        sum[9] = 144_000;
        sum[10] = 155_000;
        sum[11] = 166_000;
        sum[12] = 111_000;
        sum[13] = 122_000;
        sum[14] = 143_000;
        sum[15] = 134_000;
        sum[16] = 165_000;
        sum[17] = 126_000;
        sum[18] = 142_000;
        sum[19] = 200_000;
        sum[20] = 177_000;
        sum[21] = 134_000;
        sum[22] = 165_000;
        sum[23] = 160_000;
        sum[24] = 180_000;
        sum[25] = 190_000;
        sum[26] = 187_000;
        sum[27] = 157_000;
        sum[28] = 198_000;
        sum[29] = 130_000;
        int summ = 0;
        int day = 30;
        int month = 1;
        for (int i = 0; i < sum.length; i++) {
            summ+=sum[i];
        }
        System.out.println(" Сумма за  день равна " + summ);
        System.out.println();
        System.out.println("Задание 3 ");

        int avaregeCoastAmount = summ/day;
        System.out.println( "Средняя сумма трат  за месяц"+avaregeCoastAmount+"рублей");
        System.out.println();

        System.out.println("Задание 2");
        int minDay = sum[0];
        for (int i = 0; i < sum.length; i++){
            if (sum[i]<=minDay){
                minDay=sum[i];
            }
        }

        System.out.println("Минимальное значение"+ minDay+ "рублей");
        int maxDay = sum[0];

        for (int i = 0; i < sum.length; i++){
            if (sum[i]>=maxDay){
                maxDay=sum[i];
            }
        }

        System.out.println("Максимальное значение"+ maxDay+ "рублей");
    }
}




