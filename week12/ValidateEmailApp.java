import javax.swing.JOptionPane;

public class ValidateEmailApp{
    public static void main(String[] args) {
        ValidateEmail valEmail = new ValidateEmail();
        String email = JOptionPane.showInputDialog(null,"Please enter an email address: must contain @ . and com, edu, org eg. test@test.com");
        boolean[] checks = valEmail.validate(email);

        JOptionPane.showMessageDialog(null,"@ Symbol check: "+checks[0]+"\n"+
                                           "Dot check: "+checks[1]+"\n"+
                                           "Domain check: "+checks[2]);
        if(checks[0]&&checks[1]&&checks[2]){
            JOptionPane.showMessageDialog(null,"Great! This is a valid email, let proceed.");
        }
		else{
            JOptionPane.showMessageDialog(null,"Unfortunately this is not valid email.");
        }
    }
}