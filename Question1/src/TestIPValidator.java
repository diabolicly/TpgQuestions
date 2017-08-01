import java.util.ArrayList;

import com.tpg.question1.IPValidationRegex;

public class TestIPValidator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> ans;
        if (args.length != 0) {
            ans = IPValidationRegex.validate(args[0]);
        } else {
            ans = IPValidationRegex.validate("sampleIPs.txt");
        }
            
        //Print out the invalid IPs
        System.out.println("The invalid IPs are:");
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
