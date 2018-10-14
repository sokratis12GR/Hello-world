import java.util.Arrays;
import java.util.stream.Collectors;

public class Count {

    private static String[] jeff = new String[]{"My", "Name", "Is", "Jeff"};

    public static void main(String[] args){
        String name = Arrays.stream(jeff).map(part -> " " + part).collect(Collectors.joining());
        System.out.println(name);
    }
    
}
