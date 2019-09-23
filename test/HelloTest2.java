import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest2 extends TestCase {

    public void testGetHellonavn() {
        String resultat;

        resultat = Hello.getHellonavn("sune");
        assertEquals("Hello sune!" , resultat);

        resultat = Hello.getHellonavn("你好，世界");
        assertEquals("Hello 你好，世界!" , resultat);

        resultat = Hello.getHellonavn("");
        assertEquals("hello" , resultat);

        resultat = Hello.getHellonavn("SELCT ? FROM ?");
        assertEquals("Hello SELCT ? FROM ?!" , resultat);

        resultat = Hello.getHellonavn("tu es un grandé cull et un imbercilé");
        assertEquals("Hello tu es un grandé cull et un imbercilé!" , resultat);
    }
}