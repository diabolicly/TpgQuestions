package com.tpg.question3;

public class TestTimer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long try1 = Timer.stop();
        
        Timer.start();
        test();
        long try2 = Timer.stop();
        
        System.out.println("The first run is: " + try1);
        System.out.println("The second run is: " + try2);
    }

    static void test(){
        for(int i = 0; i < 3 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
