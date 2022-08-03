public class Cat extends Pet {
    protected Cat() {
        super("Мяу");
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public String getGiveVoice() {
        return voice;
    }

}