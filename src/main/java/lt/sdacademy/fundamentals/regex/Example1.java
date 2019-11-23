package lt.sdacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));// .s - patikrinimas ar primas betkoks simbolis, bet antras privalo buti "s"
        System.out.println(Pattern.matches(".t","dt"));
        System.out.println(Pattern.matches(".d","odt"));
        System.out.println(Pattern.matches(".d","oodt"));
        System.out.println(Pattern.matches("..t","odt")); // "..t" - trys simboliai, 2 betokie 3-cias "t".

        Pattern emailPattern = Pattern.compile("^(.+)@(.+)\\.(.+)$");
        Matcher emailMatcher = emailPattern.matcher("m*odissx@gmail.com");
        System.out.println(emailMatcher.matches());
// ("^(.+)@(.+)$") - ^ - pradzia, $ - galas, "".+" - simboliu seka iki @ ir nuo etos
// "\\" - tikrina ar yra taskas
    }
}
