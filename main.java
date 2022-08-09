
public class main {
    public static void main(String[] args) {
        calculator calc = calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);//Ошибка из-за того, что делитель(b) равен нулю.
        // Выражение переменной divide изменено, добавлено условие на проверку делителя
        calc.println.accept(c);
    }
}
