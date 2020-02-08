package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }


    @Test
    public void whenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o', 'W' , 'o'};
        char[] post = {'o', 'W', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    public void whenOneLetterIsDifferent() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'e', 'm', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
