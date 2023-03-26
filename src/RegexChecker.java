public class RegexChecker implements Checker{
    @Override
    public boolean check(String s) {
        return s.matches("^\\w+$");
    }
}
