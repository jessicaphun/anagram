import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void anagramCheckerTrue() {
        String text1 = "spot";
        String text2 = "pots";
        assertEquals(Main.anagramChecker(text1,text2),true);
    }

    @org.junit.jupiter.api.Test
    void anagramCheckerFalse() {
        String text1 = "spot";
        String text2 = "spill";
        assertEquals(Main.anagramChecker(text1,text2),false);
    }

    @org.junit.jupiter.api.Test
    void anagramCheckerSpaceCharacterChecker() {
        String text1 = "spot";
        String text2 = "po s";
        assertEquals(Main.anagramChecker(text1,text2),false);
    }

    @org.junit.jupiter.api.Test
    void anagramCheckerSpecialCharacterChecker() {
        String text1 = "spot";
        String text2 = "pot!";
        assertEquals(Main.anagramChecker(text1,text2),false);
    }
}