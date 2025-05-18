import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.function.Executable;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    void getKittens() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1,actual);
    }

    @Test
    void doesHaveManeMaleTrue() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }

    @Test
    void doesHaveManeFemaleFalse() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        assertFalse(actual);
    }

    @Test
    void doesHaveManeOtherThrowException() {
        Executable executable = ()-> new Lion(feline, "Гигачат");
        assertThrows(Exception.class, executable);
    }

    @Test
    void getFood() throws Exception{
        Lion lion = new Lion(feline,"Самец");
        List<String> expectedList  = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);
        List<String> actualList = lion.getFood();
        assertEquals(expectedList, actualList);
    }
}