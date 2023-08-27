import java.util.*;

class Map {
    public static void mapIt(String a) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        int size = a.length();

        while (i != size) {
            char c = a.charAt(i);
            int count = hm.getOrDefault(c, 0);
            hm.put(c, count + 1);
            i++;
        }

        for (char c : hm.keySet()) {
            System.out.println(c + " " + hm.get(c));
        }
    }

    public static void main(String args[]) {
        String a = "XYZ";
        mapIt(a);
    }
}
