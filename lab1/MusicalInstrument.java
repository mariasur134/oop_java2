public class MusicalInstrument {
    private String name;
    private String brand;
    private int year;

    public MusicalInstrument(String name, String brand, int year){
        setName(name);
        setBrand(brand);
        setYear(year);
    }

    public String getName(){
        return this.name;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }

    public void setName(String name){
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("invalid name, should be > 0");
        this.name = name;
    }

    public void setBrand(String brand){
        if (brand == null || brand.isEmpty()) throw new IllegalArgumentException("invalid brand, should be > 0");
        this.brand = brand;
    }

    public void setYear(int year){
        if (year < 0) throw new IllegalArgumentException("invalid year, should be > 0");
        this.year = year;
    }

    public int getAge(){
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.year;
    }

    public String description(){
        return "instrument: " + this.name + ";\nbrand: " + this.brand + ";\nyear: " + this.year + "\n";
    }

    public void sound(){
        System.out.println(this.name + " is playing...\n\"lalala or smt\"");
    }
}