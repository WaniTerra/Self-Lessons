package O;

    import java.util.ArrayList;
import java.util.HashMap;

public class null1742 {

    public static void main(String[] args) {
        int lowLimit = 5;
        int highLimit = 15;

        ArrayList<Integer> boxes = new ArrayList<>();

        for (int i = lowLimit; i <= highLimit; i++) {
            String iString = Integer.toString(i);
            int sum = 0;

            
            for (int j = 0; j < iString.length(); j++) {
                sum += Character.getNumericValue(iString.charAt(j));
            }

            boxes.add(sum);
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : boxes) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = boxes.get(0);
        int maxCount = 0;

       
        for (int count : frequencyMap.values()) {
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = count; 
            }
        }

        
        System.out.println(maxCount);
        //return maxCount;
    }
}
