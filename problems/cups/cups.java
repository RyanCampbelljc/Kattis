import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedSet;
public class cups{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<String, Double>();
        int cycle = scan.nextInt();
        for(int i = 0; i < cycle; ++i){
            if(scan.hasNextInt()){//num comes first
                double val = scan.nextDouble()/2.0;
                String key = scan.next();
                map.put(key, val);
            }
            else{//num comes second
                String key = scan.next();
                double val = scan.nextDouble();
                map.put(key, val);
            }
        }
        LinkedHashMap<String,Double> result = map.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(x,y) -> x, LinkedHashMap::new));
        Set set = result.keySet();
        for (String s : set) {
            System.out.println(s);
        }
        scan.close();
    }

} 
