package lecture10.loosecouplinghighcohesion;

public class Parent {
    protected boolean availableForFamilyDuty;
    protected String name;

    public Parent(String name) {
        this.name = name;
        availableForFamilyDuty = true;
    }

    public boolean isAvailableForFamilyDuty() {
        if (availableForFamilyDuty) {
            availableForFamilyDuty = false;
            return true;
        }
        return false;
    }
}
