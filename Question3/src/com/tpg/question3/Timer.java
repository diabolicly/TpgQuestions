package com.tpg.question3;

public class Timer {
    private static long start = 0;
    private static long end;
    
    /*    
     * Method: start
        Function: Record the start time, when call a method. Should be called before calling stop
    */
    public static void start(){
        start = System.nanoTime();
    }
    
    /*    
     * Method: stop
        Function: Return the time duration after running something. Should be called after calling start
        Return: -1 (if forget to call start), actually elapsed time in nano seconds
    */
    public static long stop(){
        end = System.nanoTime();
        long ans = -1;
        if (start != 0) {
            //Get time duration
            ans = end - start;
            //Reset start time
            start = 0;
        }
        return ans;
    }
}
