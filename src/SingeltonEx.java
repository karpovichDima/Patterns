public class SingeltonEx {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
    }
}

class Singelton {
    private static Singelton singelton = new Singelton();
    private Singelton(){

    }

    static Singelton getInstance(){
        return singelton;
    }
}
