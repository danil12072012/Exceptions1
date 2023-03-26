public class Main {
    public static void main(String[] args) {
        boolean resalt = Validator.validate("bhjfg", "hjgsdty", "hjgsdty");
        if (resalt) {
            System.out.println("Логин и пароль корректные.");
        } else {
            System.out.println("Логин и/или пароль некорректный.");
        }

    }
}