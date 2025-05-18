import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class FelineTest {

    @Spy
    Feline feline;

    @Test
    void eatMeatNoParamReturnsExpectedFoodListForPredators() throws Exception{
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.doReturn(expectedList).when(feline).getFood("Хищник");
        List<String> actual = feline.eatMeat();
        assertEquals(expectedList,actual,"Неверный список!");
    }

    @Test
    void getFamilyNoParamReturnsFelineFamilyName() {
        String expected = feline.getFamily();
        assertEquals(expected, "Кошачьи", "Неверное значение!");
    }

    @Test
    void getKittensNoParamInvokeSetColourWith1() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    void getKittensWhenCalledWithSpecificNumberReturnsThatNumber() {
        int actual = feline.getKittens(3);
        assertEquals(3, actual, "Неверное значение!");
    }
}