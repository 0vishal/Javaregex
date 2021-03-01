import java.util.regex.*;
public class Javaregex {


        public static boolean Validfirstname(String name)
        {
          //  String regex = ;

            Pattern p = Pattern.compile("^[A-Z][a-z]{3,}$");
            Matcher m = p.matcher(name);
            return m.find();
        }


        public static void main(String[] args)
        {

            String str1 = "Vishal";
            System.out.println(Validfirstname(str1));

        }
    }

