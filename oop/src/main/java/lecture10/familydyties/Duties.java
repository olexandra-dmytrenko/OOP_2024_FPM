package lecture10.familydyties;

import java.util.List;

public class Duties {
    protected List<Duty> duties;

    public Duties(Duty... duty) {
        this.duties = List.of(duty);
    }

    public void doDuty(FamilyMember familyMember) {
        for (Duty duty : duties) {
            if (duty.doIt(familyMember)) {
                return;
            }
        }
    }
}
