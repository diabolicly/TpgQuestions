package com.tpg.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class IPValidationRegex {
    
    private static final Pattern PAT = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
    
    /*
     * Method:   validate
     * Input:       a String file name
     * Output:    an ArrayList<Sring> contains all invalid IPs in the input file
    */
    public static ArrayList<String> validate(String filename) {
        ArrayList<String> ips = new ArrayList<String>();
        ArrayList<String> res = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filename.trim())))){
            //Read the input file and 
            while(br.ready()){
                String aIP = br.readLine().trim();
                if(!"".equals(aIP)){
                    ips.add(aIP);
                }
            }
            
            //Filter out invalid IPs
            for(int i = 0; i < ips.size(); i++){
                String ip = ips.get(i);
                if(!PAT.matcher(ip).matches()){
                    res.add(ip);
                }
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;
    }

}
