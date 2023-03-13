package task2.SnilsValidator;

public class SnilsValidatorImpl implements SnilsValidator{

    @Override
    public boolean validate(String snils) {
        if(snils.length() != 11) return false;

        String pattern = "^\\d+$";
        if(!snils.matches(pattern)) return false;

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.digit(snils.charAt(i), 10) * (9-i);
        }
        int calculatedControlNumber;
        if(sum == 100) calculatedControlNumber = 0;
        else if(sum > 100) {
            int mod =  sum % 101;
            calculatedControlNumber = mod == 100 ? 0 : mod;
        } else calculatedControlNumber = sum;

        int controlNumber = Integer.parseInt(snils.substring(9, 11));

        return calculatedControlNumber == controlNumber;
    }
}
