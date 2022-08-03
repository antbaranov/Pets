public class Hamster extends Pet {
    protected Hamster() {
        super("Писк");
    }
    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
    @Override
    public String getGiveVoice() {
        return voice;
    }

}