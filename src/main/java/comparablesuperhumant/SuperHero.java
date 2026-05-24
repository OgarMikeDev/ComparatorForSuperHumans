package comparablesuperhumant;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SuperHero extends SuperHuman<String> {
    private String nameCompany;
    private static Set<SuperHero> superHeroSet = new TreeSet<>();

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public static void addSuperHero(List<SuperHero> superHeroList) {
        superHeroSet.addAll(superHeroList);
    }

    public static Set<SuperHero> getSuperHeroSet() {
        return superHeroSet;
    }

    @Override
    public String getVarForSorted() {
        return nameCompany;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        SuperHero superHero = (SuperHero) object;
        return Objects.equals(nameCompany, superHero.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameCompany);
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
