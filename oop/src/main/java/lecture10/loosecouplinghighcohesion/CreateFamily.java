package lecture10.loosecouplinghighcohesion;

import java.util.List;

public class CreateFamily {
    Parent mother;
    Parent father;
    List<FamilyDuty> familyDuty;

    public CreateFamily(String motherName, String fatherName, List<FamilyDuty> familyDuty) {
        mother = new Parent(motherName);
        father = new Parent(fatherName);
        this.familyDuty = familyDuty;
    }

    public void doFamilyDuties() {
        for (FamilyDuty duty : familyDuty) {
            // як покращити - зробити рендом вибір одного з батьків (та одного з дітей?)
            // розпаралелити процес, додати затримки у роботу, щоб створити ефект зайнятості та умову звільнитись для наступної таски
            if (mother.isAvailableForFamilyDuty()){
                duty.doIt(mother);
                mother.availableForFamilyDuty = true;
                continue;
            }
            //дублювання коду
            if (father.availableForFamilyDuty){
                father.isAvailableForFamilyDuty();
                duty.doIt(father);
                father.availableForFamilyDuty = true;
                continue;
            }
        }
    }
}
