package comparablesuperhuman;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperVillain superVillain = new SuperVillain();
        superVillain.setName("Бандит из Готема");
        superVillain.setSuperPower("Превращаться в крысу");
        superVillain.setCountCrime(100);

        SuperVillain superVillain2 = new SuperVillain();
        superVillain2.setName("Адам");
        superVillain2.setSuperPower("Способность летать и суперсила");
        superVillain2.setCountCrime(100000);

        SuperVillain superVillain3 = new SuperVillain();
        superVillain3.setName("Герона");
        superVillain3.setSuperPower("Заколдовывать людей");
        superVillain3.setCountCrime(1000);

        SuperVillain.addSuperVillain(new ArrayList<>(List.of(superVillain, superVillain2, superVillain3)));
        System.out.println(SuperVillain.getVillianSet());
    }
}
