public class Fish  extends Pet  {
    protected Fish() {
        super(0);
    }

    @Override
    public void giveVoice() {
        System.out.println("Бульк");
    }
}