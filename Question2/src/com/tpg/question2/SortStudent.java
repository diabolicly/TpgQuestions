package com.tpg.question2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortStudent {
    /*
     * Method:   sort
     * Input:       a String file name
     * Output:    an List contains sorted student names in descending order
    */
    public static ArrayList<String> sort(String filename){
        ArrayList<String> ans = new ArrayList<String>();
        ArrayList<Student> sts = new ArrayList<Student>();
        
        //Parse the students information into sts list from the input file.
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filename.trim())))){
            while(br.ready()){
                String line = br.readLine().trim();
                String[] p = line.split(",");
                sts.add(new Student(Integer.parseInt(p[0].trim()), p[1].trim(), Double.parseDouble(p[2].trim())));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        //Sort the students
        sts.sort((a, b) -> {
            if(a.getGPA() != b.getGPA()) {
                return a.getGPA() > b.getGPA() ? -1: 1;
            } else {
                if(!a.getName().equals(b.getName())) {
                    return a.getName().compareTo(b.getName());
                } else {
                    return a.getID() - b.getID();
                }
            }
        });
        
        //Pass the sorted student names to return list
        for(int i = 0; i < sts.size(); i++){
            ans.add(sts.get(i).getName());
        }
        return ans;
    }
}
