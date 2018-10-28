package org.itstep.test;

import org.itstep.StringConsumer;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

@RunWith(Parameterized.class)
public class StringConsumerMultipleTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

    @InjectMocks
    private StringConsumer consumer;

    @Mock
    private Writer w;

    @Parameter
    public String input;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { {"A"}, {"AAB"} ,{"AAABC"}, {"CCBBAABC"}, {""} });
    }

    @Test
    public void acceptTest() throws IOException {
        doAnswer(invocation -> {assertEquals(input,(String)invocation.getArgument(0)); return null;} ).when(w).write(input);

        StringConsumer strConsumer = new StringConsumer(w);
        strConsumer.accept(input);

        verify(w).write(input);
    }

}
