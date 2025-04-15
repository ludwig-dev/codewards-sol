public class FindOutlier {
    static int find(int[] integers) {
        int isEvenC = 0;
        int isOddC = 0;
        boolean isEven = false;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                isEvenC++;
            } else {
                isOddC++;
            }
        }

        if (isEvenC > isOddC)
            isEven = true;

        for (int i = 0; i < integers.length; i++) {
            if (isEven && integers[i] % 2 != 0) {
                return integers[i];
            } else if (!isEven && integers[i] % 2 == 0) {
                return integers[i];
            }
        }

        return 0;
    }
}