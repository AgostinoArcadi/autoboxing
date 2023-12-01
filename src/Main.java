public class Main {
    public static void main(String[] args) {
        Integer num = 5;
        Double decimal = 10.5;
        Character letter = 'l';
        int num2 = num;
        double decimal2 = decimal;
        char letter2 = letter;

        sumInt(num, num2);
        sumInteger(num, num2);
        printChar(letter);
        printCharacter(letter2);
    }

    public static void sumInt(int x, int y) {
        System.out.println(x + y);
    }

    public static void printChar(char c) {
        System.out.println(c);
    }

    public static void sumInteger(Integer x, Integer y) {
        System.out.println(x + y);
    }

    public static void printCharacter(Character c) {
        System.out.println(c);
    }
}