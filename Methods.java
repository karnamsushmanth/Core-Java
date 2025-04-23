class Computer {
    public void playMusic() {
        System.out.println("music playing");
    }

    public String getMeAPen(int cost) {
        return "pen";
    }

}

public class Methods {
    public static void main(String[] args) {

        Computer c = new Computer();
        c.playMusic();
        String str = c.getMeAPen(5);
        System.out.println(str);

    }

}
