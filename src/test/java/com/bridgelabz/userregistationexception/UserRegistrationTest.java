package com.bridgelabz.userregistationexception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    /**
     * create method testUserFirstName_whenValid_ShouldReturnSuccess() here
     * exceptions is handled by try and catch block if first name is valid should
     * return as success
     */
    public void testUserFirstName_whenValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            isFNameValid = userRegistration.checkFName("Archana");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("Success", isFNameValid);
        }

    }

    @Test
    /**
     * create method testFirstName_WhenValueIsInvalid_shouldReturnException() here
     * exceptions is handled by try and catch block if first name is invalid it will
     * return exception
     */
    public void testFirstName_WhenValueIsInvalid_shouldReturnException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName("archana");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    /**
     * create method testFirstName_WhenPassNullValue_shouldNullValueException() here
     * exceptions is handled by try and catch block if first name is null it should
     * be a null value exception
     */
    public void testFirstName_WhenPassNullValue_shouldNullValueException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName(null);
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    /**
     * create method testLastName_WhenValueIsValid_ShouldReturnSuccess() here
     * exceptions is handled by try and catch block if last name is valid should
     * return as success
     */
    public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String islNameValid = null;
        try {
            islNameValid = userRegistration.checkLName("Archana");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("Success", islNameValid);
        }
    }

    @Test
    /**
     * create method testLastName_WhenValueIsInvalid_ShouldThrowInvalidException()
     * here exceptions is handled by try and catch block if last name is invalid it
     * will return exception
     */
    public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName("archana");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    /**
     * create method testLastName_WhenValueIsNull_ShouldThrowNullPointerException()
     * here exceptions is handled by try and catch block if last name is null it
     * should be a null value exception
     */
    public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName(null);
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    /**
     * create method testEmailId_WhenValueIsValid_ShouldReturnSuccess() here
     * exceptions is handled by try and catch block if email id is valid should
     * return as success
     */
    public void testEmailId_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isEmailValid = null;
        try {
            isEmailValid = userRegistration.checkEmail("archana007@gmail.com");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("Success", isEmailValid);
        }
    }

    @Test
    /**
     * create method testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException()
     * here exceptions is handled by try and catch block if email id is invalid it will
     * return exception
     */
    public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail("archana.@.com");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    /**
     * create method testEmailId_WhenValueIsNull_ShouldThrowNullPointerException()
     * here exceptions is handled by try and catch block if last name is null it
     * should be a null value exception
     */
    public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail(null);
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    /**
     * create method testMobileNum_WhenValueIsValid_ShouldReturnSuccess() here
     * exceptions is handled by try and catch block if email id is valid should
     * return as success
     */
    public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isPhoneValid = null;
        try {
            isPhoneValid = userRegistration.checkPhoneNumber("91 7760973591");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("Success", isPhoneValid);
        }
    }

    @Test
    /**
     * create method testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException()
     * here exceptions is handled by try and catch block if email id is invalid it
     * will return exception
     */
    public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber("7760973591");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    /**
     * create method testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException()
     * here exceptions is handled by try and catch block if MobileNum is null it should
     * be a null value exception
     */
    public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber(null);
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    /**
     * create method testPassword_WhenSatisfyRule2_ShouldReturnSuccess() here
     * exceptions is handled by try and catch block if password is valid should
     * return as success
     */
    public void testPassword_WhenSatisfyRule2_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isValidPassword = null;
        try {
            isValidPassword = userRegistration.checkPassword("Qwer@0321");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("Success", isValidPassword);
        }
    }

    @Test
    /**
     * create method testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException()
     * here exceptions is handled by try and catch block if password is invalid it will
     * return exception
     */
    public void testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword("qwer");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    /**
     * create method testPassword_WhenPassedNullValue_ShouldThrowNullPointerException()
     * here exceptions is handled by try and catch block if password is null it should
     * be a null value exception
     */
    public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword(null);
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    /**
     * create method mood_Analyser_Test_Happy() for Happy Mood
     */
    public void mood_Analyser_Test_Happy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = null;
        try {
            isMoodHappy = userRegistration.moodAnalyse("Archana", "gowda", "91 7760973591", "archana@gmail.com",
                    "Qwer@0321");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("HAPPY", isMoodHappy);
        }
    }

    @Test
    /**
     * create method mood_Analyser_Test_Sad() for Sad Mood
     */
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = null;
        try {
            isMoodSad = userRegistration.moodAnalyse("archana", "gowda", "7760973591", "007almas.@.com", "almas*123");
        } catch (InvalidDetailExceptions e) {
            Assertions.assertEquals("SAD", isMoodSad);
        }
    }
}