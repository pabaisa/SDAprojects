package fundamentals.assertj;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Example1 {
    @Test
    public void testAssertJMachers() {
        //given
        String text = "abc";
        String[] stringArray = {"abc", "cde", "efg"};

        //then
        assertThat(text)
                .isEqualTo("abc");

        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}