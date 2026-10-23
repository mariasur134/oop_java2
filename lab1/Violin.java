public class Violin extends StringInstrument {

    private String size;
    private boolean hasBow;
    private boolean bowRosined;

    public Violin(String name, String brand, int year, String stringMaterial, String size, boolean hasBow){
        super(name, brand, year, 4, stringMaterial);
        setSize(size);
        setHasBow(hasBow);
        this.bowRosined = false;
    }

    public String getSize(){
        return this.size;
    }

    public boolean hasBow(){
        return this.hasBow;
    }

    public boolean isBowRosined(){
        return this.bowRosined;
    }

    public void setSize(String size){
        if (size == null || !(size.equals("4/4") || size.equals("3/4") || size.equals("1/2")
                || size.equals("1/4") || size.equals("1/8")))
            throw new IllegalArgumentException("invalid violin size: " + size);
        this.size = size;
    }

    public void setHasBow(boolean hasBow){
        this.hasBow = hasBow;
        if (!hasBow) this.bowRosined = false;
    }

    public void setBowRosined(boolean bowRosined){
        if (!hasBow) throw new IllegalStateException("no bow to rosin");
        this.bowRosined = bowRosined;
    }

    public void rosinBow(){
        if (!hasBow) throw new IllegalStateException(getName() + " has no bow");
        setBowRosined(true);
        System.out.println("bow is rosined");
    }


    public void playWithBow(){
        if (!hasBow) throw new IllegalStateException(getName() + " has no bow");
        if (!bowRosined) throw new IllegalStateException("bow is not rosined, no sound");
        if (!isTuned()) throw new IllegalStateException(getName() + " is not tuned");
        System.out.println(getName() + " plays: \"screeeeeeeeeeeEEeeEEch\"");
    }

    public String getRecommendedAge(){
        if (size.equals("4/4")) return "12+";
        if (size.equals("3/4")) return "9-11";
        if (size.equals("1/2")) return "7-9";
        if (size.equals("1/4")) return "5-7";
        return "3-5";
    }
}