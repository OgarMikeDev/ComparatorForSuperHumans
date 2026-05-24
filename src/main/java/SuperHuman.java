import java.util.Objects;

public abstract class SuperHuman implements Comparable<SuperHuman> {
    private String name;
    private String superPower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public abstract int getVarForSorted();

    @Override
    public int compareTo(SuperHuman superHuman) {
        return -Integer.compare(this.getVarForSorted(), superHuman.getVarForSorted());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        SuperHuman that = (SuperHuman) object;
        return Objects.equals(name, that.name) && Objects.equals(superPower, that.superPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, superPower);
    }

    @Override
    public String toString() {
        return "SuperHuman{" +
                "name='" + name + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }
}
