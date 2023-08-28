

import java.util.*;
class Map {

 public static void checkUnique(String a){
Map<Character, Integer> map = new HashMap<>();
int i=0;
int size= a.length();
while(i!=size){
char c = a.charAt(i);
int count= map.getOrDefault(c,0);
map.put(c,count+1);

i++;
}

Set<Map.Entry<Character, Integer>> hmap= map.entrySet();

for(Map.Entry<Character, Integer> data: hmap){
 if(data.getValue()>1){
System.out.print("not unique");
System.exit(0);
}

}

System.out.print("unique");
}




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
        String a = "spiderman";
       // mapIt(a);
        checkUnique(a);
    }
}
