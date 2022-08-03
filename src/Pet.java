public abstract class Pet {
    private int pawsCount;
    private String voice;

    protected Pet(String voice) {
        this.voice = voice;
        //this.pawsCount = pawsCount;
    }

    public String giveVoice() {
        return voice;
    }

    public int getPawsCount() {
        return pawsCount;
    }
    /*
    public int setPawsCount(int pawsCount) {
        return pawsCount;
    }
           */
    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }


}