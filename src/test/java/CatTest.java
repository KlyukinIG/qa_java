import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CatTest {

   @Spy
   Feline feline;

    @Test
    void getSoundNoParamsReturnsMeow() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        assertEquals("Мяу", actual,  "Котик говорит Мяу!");
    }

    @Test
    void getFoodNoParamsReturnsListOfFoodForPredator() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.doReturn(expectedList).when(feline).eatMeat();
        List<String> actual = cat.getFood();
        assertEquals(expectedList, actual,"Кошачьи едят: Животных, Птиц, Рыбу");
    }
}