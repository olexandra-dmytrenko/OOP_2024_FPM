package lecture10.familydyties;

public class KidsCare implements Duty {
    @Override
    public boolean doIt(FamilyMember familyMember) {
        System.out.println(familyMember.name + " did the kids care.");
        return false;
    }
}
