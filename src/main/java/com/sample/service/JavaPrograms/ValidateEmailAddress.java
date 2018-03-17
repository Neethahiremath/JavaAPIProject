package com.sample.service.JavaPrograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmailAddress {

    private boolean validateEmailAddress(String stringToMatch) {
       /* Pattern pattern = Pattern.compile("^[(a-zA-Z-0-9_\\.\\-)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        Matcher match = pattern.matcher(stringToMatch);
        return match.find();*/

        return Pattern.compile("^[(a-zA-Z-0-9_\\.\\-)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
                .matcher(stringToMatch)
                .find();
    }

    private boolean validateMobileNumber(String mobileNumber) {

        return  Pattern.compile("^(\\+[0-9]{2}-[0-9]+$)")
                .matcher(mobileNumber)
                .find();
    }

    public static void main(String[] args) {

        ValidateEmailAddress validate = new ValidateEmailAddress();
        try {
            System.out.println("Enter your Email Address\n");
            Scanner scanner = new Scanner(System.in);
            if (validate.validateEmailAddress(scanner.next())) {
                System.out.println("Email is valid");
            } else {
                System.out.println("Please Enter valid Email");
            }
            System.out.println("Enter Mobile Number");
            if (validate.validateMobileNumber(scanner.next())) {
                System.out.println("Valid Mobile Number");
            } else {
                System.out.println("Invalid Mobile Number");
            }
        } catch (Exception e) {
            System.out.println("Exception While processing the request");
        }
    }
}
