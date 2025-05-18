import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({"Самец,  true",
               "Самка, false"})
    void doesHaveManeReturnsCorrectValueBasedOnSex(String sex, boolean excepted) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(excepted, actual,"Грива определяется неверно для пола: " + sex);
    }
}
