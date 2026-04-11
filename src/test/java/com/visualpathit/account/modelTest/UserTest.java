package com.visualpathit.account.modelTest;

import com.visualpathit.account.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private static final String TEST_USERNAME = "testUser";
    private static final String TEST_PASSWORD = "dummyPass";

    @Test
    public void testUserCreation() {
        User user = new User(TEST_USERNAME, TEST_PASSWORD);

        assertNotNull(user);
        assertEquals(TEST_USERNAME, user.getUsername());
        assertEquals(TEST_PASSWORD, user.getPassword());
    }

    @Test
    public void testUserSetters() {
        User user = new User();

        user.setUsername(TEST_USERNAME);
        user.setPassword(TEST_PASSWORD);

        assertEquals(TEST_USERNAME, user.getUsername());
        assertEquals(TEST_PASSWORD, user.getPassword());
    }
}
