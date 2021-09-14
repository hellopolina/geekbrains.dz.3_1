public class Main {

    public static void main(String[] args){

        int len = 5;
        int initialValue = 2;
        five(len, initialValue);

        System.out.println("Задание 1:");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++){
            if(arr[i] == 1){
                System.out.print(0 + " ");}
            else System.out.print(1 + " ");
        }

        System.out.println(" ");
        System.out.println("Задание 2:");
        int[] secondArr = new int[100];
        for (int j = 0; j <= secondArr.length; j++){
            secondArr[j] = j+1;
            System.out.print(secondArr[j] + " ");
        }

        System.out.println(" ");
        System.out.println("Задание 3:");
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int k = 0; k <= thirdArr.length; k++){
            if(thirdArr[k] < 6){
                System.out.print(thirdArr[k] * 2 + " ");}
            else System.out.print(thirdArr[k] + " ");
        }


        System.out.println(" ");
        System.out.println("Задание 4:");
        int[][] table = new int[5][5];
        for(int a = 0; a <= table.length; a++){
            table[a][a] = 1;
            System.out.println(table[a][a]);
        }
    }

    public static int five(int len, int initialValue){
        System.out.println(" ");
        System.out.println("Задание 5:");
        int[] fiveArr = new int[len];
        for(int c = 0; c <= len; c++){
            fiveArr[c] = initialValue;
            System.out.print(fiveArr[c] + " ");
        }
        return fiveArr[len];
    }
}

