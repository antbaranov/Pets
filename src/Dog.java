public class Dog extends Pet {
    protected Dog() {
        super("Гав");
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
    @Override
    public String getGiveVoice() {
        return voice;
    }

}