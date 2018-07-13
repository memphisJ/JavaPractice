import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateAndRemove {
    public static void main(String...args){
        List<String> jedis = new ArrayList<>(Arrays.asList("Luke","yoda"));
        System.out.println(jedis);

        /*for(String jedi:jedis){
            if(Character.isLowerCase(jedi.charAt(0))){
                jedis.remove(jedi);
            }
        }*/

        jedis.removeIf(jedi -> Character.isLowerCase(jedi.charAt(0)));

        System.out.println(jedis);
    }
}
