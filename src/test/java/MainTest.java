import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    void hypothenuse() {
        Assertions.assertEquals(
                Main.hypothenuse(10, 20), 22.360679774997898
        );
    }
}