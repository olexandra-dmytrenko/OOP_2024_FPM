package lecture10.familydyties;

import java.util.List;

public class FamilyController {
    List<FamilyMember> family;
    Duties duties;

    public FamilyController(List<FamilyMember> family, Duties duties) {
        this.family = family;
        this.duties = duties;
    }
//TODO bad practice, cycle in cycle. Should use availability to determine who should do the thing and think of nonrepeating.
    public void doDuties() {
        for (FamilyMember familyMember : family) {
            for (Duty duty : duties.duties) {
                duty.doIt(familyMember);
            }
        }
    }
}
