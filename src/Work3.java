import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Work3 {
    public String text1 = "00876543";

    public void SameElement(){
        System.out.println(text1);

        Pattern pat = Pattern.compile("(\\d)\\1");
        Matcher mat1 = pat.matcher(text1);

        while(mat1.find()){ System.out.println("Строка состоит из 2-х одинаковых цифр: " + mat1.group()); }
    }

   public void Replacement(){
       System.out.println(text1);

       String newString1 = text1.replaceAll("(\\d)\\1","*");

       System.out.println(newString1);
    }
}
