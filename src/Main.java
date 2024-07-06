public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int kolichestvoBonusov = service.calculate(84785);


        System.out.println(kolichestvoBonusov);
    }
}