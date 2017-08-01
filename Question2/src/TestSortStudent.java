import java.util.ArrayList;

import com.tpg.question2.SortStudent;

public class TestSortStudent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> ans;
        if (args.length != 0) {
            ans = SortStudent.sort(args[0]);
        } else {
            ans = SortStudent.sort("students.csv");
        }
            
        //Print out the student names
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
