package org.itstep.test;

import org.itstep.StringConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StringConsumerTest {

    @InjectMocks
    private StringConsumer consumer;

    @Mock
    private Writer w;

    @Test
    public void acceptTest() throws IOException {
        //SETUP
        String input = "Micky";
        doAnswer(invocation -> {assertEquals(input,(String)invocation.getArgument(0)); return null;} ).when(w).write(input);

        //RUN
        StringConsumer strConsumer = new StringConsumer(w);
        strConsumer.accept(input);

        //VERIFY FOR .write TO BE CALLED
        verify(w).write(input);
    }
}
