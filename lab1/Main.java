public class Main {
    public static void main(String[] args) {
        Violin violin = new Violin("Violin", "Stentor", 1670, "silver", "3/4", true);

        System.out.println(violin.description());
        System.out.println("age: " + violin.getAge());
        System.out.println("reccommended for: " + violin.getRecommendedAge() + " years");

        try {
            violin.playWithBow();
        } catch (IllegalStateException e) {
            System.out.println("error: " + e.getMessage());
        }

        violin.rosinBow();
        violin.tune();
        violin.playWithBow();

        try {
            new Violin("violin", "yamaha", 2019, "steel", "5/4", true);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}