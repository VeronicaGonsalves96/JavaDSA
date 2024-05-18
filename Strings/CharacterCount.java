package JavaDSA.Strings;

import java.util.HashMap;
import java.util.Map;

//input absabse output a=2,b=2,s=2,e=1
public class CharacterCount {
    public static void main(String args[])
    {
        String str= "veronicagonsalves";

        Map<Character, Integer>  ans= charcaterCount(str);
        System.out.println(ans);
    }
    public static Map<Character, Integer> charcaterCount(String str)

    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++)
        {
            if(!(map.containsKey(str.charAt(i))))
            {
                map.put(str.charAt(i),1);
            }
            else
            {
                int countOfCharacter=map.get(str.charAt(i));
                map.put(str.charAt(i), countOfCharacter+1);
            }
        }
        return map;
    }
}

