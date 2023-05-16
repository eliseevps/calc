import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) throws Exception {
        String[] array = input.split(" ");
        int num1;
        int num2;
        int result;

        if (array.length < 3) {
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        } else if (array.length > 3) {
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        try {
            num1 = Integer.parseInt(array[0]);
            num2 = Integer.parseInt(array[2]);
        } catch (Exception e) {
            throw new Exception("throws Exception //т.к. один из операндов не является числом");
        }
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("throws Exception //т.к. калькулятор должен принимать на вход числа от 1 до 10 включительно");
        }
        switch (array[1]) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "/" -> result = num1 / num2;
            case "*" -> result = num1 * num2;
            default -> throw new Exception("throws Exception //т.к. выражение не содержит оператор (+, -, /, *)");
        }
        return result + "";
    }
}