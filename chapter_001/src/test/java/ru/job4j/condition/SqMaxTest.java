package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenThirdMax() {

        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstMax() {

        int result = SqMax.max(6, 3, 2, 5);
        assertThat(result, is(6));
    }

    @Test
    public void whenSecondMax() {

        int result = SqMax.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthMax() {

        int result = SqMax.max(5, 3, 6, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllEqualMax() {

        int result = SqMax.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }
}
