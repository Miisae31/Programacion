package romanToInt;

import java.util.HashMap;

public class solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanMap.get(s.charAt(i)) > romanMap.get(s.charAt(i - 1))) {
                result += romanMap.get(s.charAt(i)) - 2 * romanMap.get(s.charAt(i - 1));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;

    }
};