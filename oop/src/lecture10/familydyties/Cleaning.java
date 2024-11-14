package lecture10.familydyties;

public class Cleaning implements Duty {
    @Override
    public boolean doIt(FamilyMember familyMember) {
        System.out.println(familyMember.name + " did the cleaning.");
        return true;
    }
}
