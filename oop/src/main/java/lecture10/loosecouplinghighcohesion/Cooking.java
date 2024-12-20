package lecture10.loosecouplinghighcohesion;

public class Cooking implements FamilyDuty{
    @Override
    public void doIt(Parent parent) {
        System.out.println(parent.name + " is cooking.");
    }
}
