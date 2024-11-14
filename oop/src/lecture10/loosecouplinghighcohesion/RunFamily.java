package lecture10.loosecouplinghighcohesion;

import java.util.List;

public class RunFamily {

    public static void main(String[] args) {
       CreateFamily myFamily = new CreateFamily("Jane", "John", List.of(new Cooking(), new Cleaning(), new Cooking()));
       myFamily.doFamilyDuties();
    }
}
