package org.itstep.test;

import org.itstep.ExceptionThrower;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;

public class ExceptionThrowerTest {
    private static final String message = "Message personnel : Francoise Hardy";

    private ExceptionThrower thrower;

    @Rule
    public ExpectedException thrownTester = ExpectedException.none();

    @Before
    public void initThrower() {
        thrower = new ExceptionThrower(message);
    }

    @Test
    public void nothrowTest() {
        assertFalse(thrower.doThrow(false));
    }

    @Test(expected = RuntimeException.class)
    public void throwTest() {
        thrower.doThrow(true);
    }

    @Test
    public void throwMessageTest() {
        thrownTester.expect(RuntimeException.class);
        thrownTester.expectMessage(message);

        thrower.doThrow(true);
    }
}
