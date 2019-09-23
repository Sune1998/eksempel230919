import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    public void TestHelloedge() {
        String resultat;

        resultat = Hello.getHellonavn("Sune");
        assertEquals("Hello sune" , resultat);

        resultat = Hello.getHellonavn("你好，世界");
        assertEquals("Hello 你好，世界" , resultat);

        resultat = Hello.getHellonavn("");
        assertEquals("" , resultat);

        resultat = Hello.getHellonavn("SELCT ? FROM ?");
        assertEquals("SELCT ? FROM ?" , resultat);

        resultat = Hello.getHellonavn("tu es un grandé cull et un imbercilé");
        assertEquals("tu es un grandé cull et un imbercilé" , resultat);


    }

}