public class DigitOnlyCheck {
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigit = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                isDigit = false; break;
            }
        }
        System.out.println("Is Digit Only = " + isDigit);
    }
}
