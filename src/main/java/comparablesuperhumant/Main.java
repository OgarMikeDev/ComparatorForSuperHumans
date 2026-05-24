package comparablesuperhumant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        comparablesuperhumant.SuperVillain superVillain = new comparablesuperhumant.SuperVillain();
        superVillain.setName("Бандит из Готема");
        superVillain.setSuperPower("Превращаться в крысу");
        superVillain.setCountCrime(100);

        comparablesuperhumant.SuperVillain superVillain2 = new comparablesuperhumant.SuperVillain();
        superVillain2.setName("Адам");
        superVillain2.setSuperPower("Способность летать и суперсила");
        superVillain2.setCountCrime(100000);

        comparablesuperhumant.SuperVillain superVillain3 = new comparablesuperhumant.SuperVillain();
        superVillain3.setName("Герона");
        superVillain3.setSuperPower("Заколдовывать людей");
        superVillain3.setCountCrime(1000);

        comparablesuperhumant.SuperVillain.addSuperVillain(new ArrayList<>(List.of(superVillain, superVillain2, superVillain3)));
        System.out.println(SuperVillain.getVillianSet());
    }
}
