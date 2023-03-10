package projects.learning;

import java.util.Scanner;

public class MinAndMaxCalculator{
    public static void calculateMinAndMax(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = 0;
        int max = 0;
        int count = 0;
        prompt();
        String input = scanner.nextLine();
        while(input.matches("-?\\d+")){
            number = Integer.parseInt(input);
            if(count == 0 || number < min){
                min = number;
            }
            if(count == 0 || number > max){
                max = number;
            }
            count++;
            prompt();
            input = scanner.nextLine();
        }
        showMinAndMax(min, max);
    }
    public static void prompt(){
        System.out.println("Enter a number. To exit, enter any character.");
    }
    public static void showMinAndMax(int min, int max){
        System.out.println("Minimum number: " + min);
        System.out.println("Minimum number: " + max);
    }
}
