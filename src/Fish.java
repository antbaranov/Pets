public class Fish  extends Pet  {
    protected Fish() {
        super("Буль");
    }
    @Override
    public String getGiveVoice() {
        return voice;
    }
}