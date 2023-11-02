package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.sentencies.Sentence;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceTest {

    practice.sentencies.Sentence sentence;

    @BeforeEach
    void setUp() {
        sentence = new Sentence();
    }

    @Test
    void countWords() {
        String str = "One - two - three , four.";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str ="One? Two. Three%";
        assertEquals(16,sentence.countSymbols(str));
    }
    @Test
    void countSymbols1(){
    assertEquals(12, sentence.countSymbols("Hello World!"));
    }
    @Test
    void countSymbols2(){
        assertEquals(14, sentence.countSymbols("Hello @ World!"));
    }
    @Test
    void countSymbols3(){
        assertEquals(16, sentence.countSymbols("==#$Hello@World!"));
    }
    @Test
    void countSymbols4(){
        assertEquals(1, sentence.countSymbols(""));
    }
    @Test
    void countSymbols5(){
        assertEquals(11, sentence.countSymbols("####@$$$==="));
    }
}