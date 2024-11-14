package lecture10.familydyties;

import lecture10.loosecouplinghighcohesion.Cooking;

import java.util.List;

public class RunFamily {
    public static void main(String[] args) {
        FamilyMember mother = new FamilyMember("Mother");
        FamilyMember father = new FamilyMember("Father");
        FamilyMember child = new FamilyMember("Child");
        Duties duties = new Duties(new Cleaning(), new KidsCare());

        FamilyController familyController = new FamilyController(List.of(mother, father, child), duties);

        familyController.doDuties();
    }
}
