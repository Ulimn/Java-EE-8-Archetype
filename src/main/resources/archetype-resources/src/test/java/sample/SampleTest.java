package sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    @DisplayName("Demo test should pass.")
    public void sampleTest() {
        assertEquals(1, 1);
    }
}
