package comparablesuperhuman;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SuperVillain extends SuperHuman {
    private static Set<SuperVillain> villianSet = new TreeSet<>();
    private int countCrime;

    public int getCountCrime() {
        return countCrime;
    }

    public void setCountCrime(int countCrime) {
        this.countCrime = countCrime;
    }

    public static void addSuperVillain(List<SuperVillain> superVillainList) {
        villianSet.addAll(superVillainList);
    }

    public static Set<SuperVillain> getVillianSet() {
        return villianSet;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        SuperVillain that = (SuperVillain) object;
        return countCrime == that.countCrime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countCrime);
    }

    @Override
    public int getVarForSorted() {
        return countCrime;
    }

    @Override
    public String toString() {
        return "SuperVillian{" +
                "countCrime=" + countCrime +
                '}';
    }
}
