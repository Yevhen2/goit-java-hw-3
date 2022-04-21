public class ATM {
    public int countBanknotes(int sum) {
        int[] denomination = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
        int quan = 0;
        int tempSum;
        int count;
        int i = 0, j, k = denomination.length;
        while (k != 0 && denomination[--k] > sum);
            j = k;
            do {
                if ((tempSum = sum % denomination[j]) >= denomination[0] || tempSum == 0) {
                    count = sum / denomination[j];
                    sum = tempSum;
                } else {
                    count = sum / denomination[j] - 1;
                    sum = tempSum + denomination[j];
                }
                quan +=count;
                while (j != 0 && denomination[--j] > sum) {

                }
            } while (i < k && sum > 0);
        return quan;
    }

    public static void main(String[] args) {
        ATM banknotes = new ATM();
        
        System.out.println(banknotes.countBanknotes(547));
    }
}