public class ValidateEmail {
    public boolean[] validate(String email) {
        String[] domains = {"com","edu","org"};
        boolean valids[] = {false, false, false};
        if(email.contains("@")){
            valids[0]=true;
            String [] x = email.split("@");
            if(x[1].toString().contains(".")){
                valids[1]=true;
                String [] a = x[1].split("\\.");
                for (String domain : domains) {
                    if(a[1].length() == 3 && a[1].contains(domain)){
                        valids[2] = true;
                        break;
                    }
                }
            }
        }
        return valids;
    }
}
