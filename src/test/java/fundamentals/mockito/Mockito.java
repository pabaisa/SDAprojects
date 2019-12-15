package fundamentals.mockito;

import lt.sdacademy.fundamentalstesting.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Mockito {
    @Mock
    Calculator calculator = new Calculator();

    @Test
    public void verifyThatDivisionWasCalled() {
        // given
        when(calculator.add(anyInt(), anyInt()))
                .thenReturn(2);

        //when
        calculator.add(2, 5);

        //then
        verify(calculator)
                .add(anyInt(), anyInt());
    }
}
