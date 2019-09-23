public class Hello {
    public static String getHellonavn(String navn) {
        if (navn.trim().equals("")) {
            return "hello";
        }
        else {
            return "Hello "  +       navn + "!";
        }
    }



}
