import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw i was tony";
        int len = palindrome.length();
        System.out.println("len = " + len);

        palindrome = palindrome.concat("zara");

        System.out.println(palindrome);
        
//        char result = palindrome.charAt(8);
//        System.out.println("result = " + result);

        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        String Str = new String("Welcome to Tutorialspoint.com");
        String Str1 = "Welcome to Tutorialspoint.com";
        System.out.println("Hashcode for Str :" + Str.hashCode() );
        System.out.println("Hashcode for Str :" + Str1.hashCode() );
        System.out.println(Str.toCharArray());
//        Locale locale = Locale.CHINESE;
//        System.out.println(Str.toLowerCase(locale));
        System.out.println(Str.toString());

    }
}
