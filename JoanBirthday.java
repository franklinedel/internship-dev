public class JoanBirthday {
    public static void main(String[] args) {
        int currentAge = 8;
        int currentYear = 2024;

        for (int year = currentYear; year < currentYear + 10; year++) {
            if (currentAge == 10) {
                System.out.println("Joan's 10th birthday will be in the year " + year);
                break;
            }
            currentAge++;
        }
    }
}
