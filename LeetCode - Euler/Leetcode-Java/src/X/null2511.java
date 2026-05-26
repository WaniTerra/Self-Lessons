package X;

public class null2511 {

    public static void main(String[] args) {
        int[] forts = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        int result = 0;

        int fortsL = forts.length;

        for (int i = 0; i < fortsL; i++) {
            if (forts[i] == 1) {

                int countRight = 0;
                for (int right = i + 1; right < fortsL; right++) {
                    if (forts[right] == 0) {
                        countRight++;
                    } else if (forts[right] == -1) {

                        result = Math.max(result, countRight);
                        break;
                    } else {

                        break;
                    }
                }

                int countLeft = 0;
                for (int left = i - 1; left >= 0; left--) {
                    if (forts[left] == 0) {
                        countLeft++;
                    } else if (forts[left] == -1) {

                        result = Math.max(result, countLeft);
                        break;
                    } else {

                        break;
                    }
                }
            }
        }

        System.out.println(result);
        // return result;
    }
}
