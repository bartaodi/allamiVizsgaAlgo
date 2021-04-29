package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        if (input == null || input.equals("")) return -1;

        input = input.replaceAll("\\D+","");
        String[] inputNumbers = input.split("");

        int size = input.length();
        int[] intString = new int[size];

        for (int i = 0; i < size; i++) {
            intString[i] = Integer.parseInt(inputNumbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < intString.length; i++) {
            sum += intString[i];
        }
        return sum;
    }
}
