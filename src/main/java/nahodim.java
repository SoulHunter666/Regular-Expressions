import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nahodim {
    void time(String kor){
        Pattern p1 = Pattern.compile("\\b([0-1][0-9]|2[0-3]):[0-5][0-9]\\b");
        Matcher matcher = p1.matcher(kor);
        if (matcher.find())
            System.out.println("Время указано корректно, красавчик");
        else
            System.out.println("Ты чё совсем дурак? Время некорректно");
    }
}
