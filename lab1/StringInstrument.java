public class StringInstrument extends MusicalInstrument {
    private int stringCount;
    private String stringMaterial;
    private boolean tuned;

    public StringInstrument(String name, String brand, int year, int stringCount, String stringMaterial){
        super(name, brand, year);
        setStringCount(stringCount);
        setStringMaterial(stringMaterial);
        this.tuned = false;
    }

    public int getStringCount(){
        return this.stringCount;
    }

    public String getStringMaterial(){
        return this.stringMaterial;
    }

    public boolean isTuned(){
        return this.tuned;
    }

    public void setStringCount(int stringCount){
        if (stringCount <= 0) throw new IllegalArgumentException("number of strings should be > 0");
        this.stringCount = stringCount;
    }

    public void setStringMaterial(String stringMaterial){
        if (stringMaterial == null || stringMaterial.isEmpty())
            throw new IllegalArgumentException("name of the material shouldn't be empty");
        this.stringMaterial = stringMaterial;
    }

    public void setTuned(boolean tuned){
        this.tuned = tuned;
    }

    public void tune(){
        setTuned(true);
        System.out.println(getName() + " is now tuned");
    }

    public void changeMaterial(String newMaterial){
        this.stringMaterial = newMaterial;
        setTuned(false);
        System.out.println("strings replaced with " + newMaterial + ", tuning needed");
    }

    public boolean hasSameStrings(StringInstrument other){
        if (other == null) throw new IllegalArgumentException("other instrument is null");
        return this.stringCount == other.getStringCount()
                && this.stringMaterial.equals(other.getStringMaterial());
    }
}