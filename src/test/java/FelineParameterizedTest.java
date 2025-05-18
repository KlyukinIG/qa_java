import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1,4,6})
    void getKittensWithDifferentNumbersReturnsThatNumber(int kittensCount) {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(kittensCount,actual,"Колличество не совподает");
    }
}
