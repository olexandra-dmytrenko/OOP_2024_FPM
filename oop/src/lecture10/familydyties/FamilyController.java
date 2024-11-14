package lecture10.familydyties;

import java.util.List;

public class FamilyController {
    List<FamilyMember> family;
    Duties duties;

    public FamilyController(List<FamilyMember> family, Duties duties) {
        this.family = family;
        this.duties = duties;
    }

    public void doDuties() {
        for (FamilyMember familyMember : family) {
            duties.doDuty(familyMember);
        }
    }
}
