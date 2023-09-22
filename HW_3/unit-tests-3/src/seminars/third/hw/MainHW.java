package seminars.third.hw;

public class MainHW {
    // public static void main(String[] args) {
    // }
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    static boolean evenOddNumber(int n) {
        return (n%2==0);
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    static boolean numberInInterval(int m) {
        return ((m >= 25) & (m <= 100));
    }
	// public static void main(String[] args){
	// 	System.out.println( border(780) );
	// }
}
