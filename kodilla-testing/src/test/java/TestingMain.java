package com.kodilla.testing;
import com.kodilla.testing.user.Calculatore;
import com.kodilla.testing.user.SimpleUser;


    public class TestingMain {
        public static void main(String[] args){
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if (result.equals("theForumUser")){
                System.out.println("First Test OK!");
            } else {
                System.out.println("Error in First Test!");
            }
            Calculatore calculator = new Calculatore(11,6);
            int result2 = calculator.add();
            if (result2==17){
                System.out.println("Second Test OK!");
            } else {
                System.out.println("Error in Second Test!");
            }
            int result3 = calculator.subtract();
            if (result3==5){
                System.out.println("Third Test OK!");
            } else {
                System.out.println("Error in Thrid Test!");
            }
        }
    }

