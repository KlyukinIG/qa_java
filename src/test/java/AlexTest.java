import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AlexTest {

    @Mock
    Feline feline;

    @Test
    void getFriendsNoPramsReturnListOfFriends() throws Exception{
        Alex alex = new Alex(feline);
        List<String> expected  = List.of("Марти","Глория","Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected ,actual,"Список друзей не совподает!");
    }

    @Test
    void getPlaceOfLivingNoPramsReturnPlaceOfLiving() throws Exception {
        Alex alex =new Alex(feline);
        String expected  = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected,actual,"Место проживания не совподает!");
    }

    @Test
    void getKittensNoParamsReturnZero() throws Exception{
        Alex alex = new Alex(feline);
        int actual = alex.getKittens();
        assertEquals(0,actual,"У Алекса нет котят!");
    }
}