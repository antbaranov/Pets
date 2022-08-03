public abstract class Pet {
    private int pawsCount;

    public Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public abstract void giveVoice();

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }


}