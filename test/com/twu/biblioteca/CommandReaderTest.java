package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class CommandReaderTest {

    CommandReader commandReader = mock(CommandReader.class);

    @Test
    public void testReadInput() throws Exception {
        when(commandReader.readInput()).thenReturn(2);
        assertEquals(commandReader.readInput(), 2);
    }

    @Test
    public void shouldValidateUserInput() throws Exception {
        CommandReader commandReader1 = new CommandReader();
        assertEquals(4,commandReader1.validate( "-2"));
        assertEquals(1,commandReader1.validate( "1"));
        assertEquals(4,commandReader1.validate( "x"));
    }
}