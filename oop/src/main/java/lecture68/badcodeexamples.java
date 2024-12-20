package lecture68;

import lecture68.forrefactoring.Item;

import java.time.LocalTime;
import java.util.Date;

public class badcodeexamples {
    public static void main(String[] args) {
        immutableStringAndInteger();
    }
    Item addItem(int year, int month, int day, LocalTime time, String sku, String afterSku, String beforeSku, int quantity){
        return new Item(
                "", //dB.getName(sku),
                1, //new LocalDateTime(year, month, day, time.getHour(), time.getMinute()).toLocalDate().toEpochDay(),
                quantity);
    }
    public static void immutableStringAndInteger(){
        Integer i = 1;
        Integer j = i;
        j++;
        System.out.println("i = " + i + ", j = " + j);
        /*
        Integer i = new Integer(1);
        Integer j = i;
        j = new Integer(i.getInt()+1);
        */
    }
    public static void mutableStringAndInteger(){
        Date birthDate = new Date(2024, 1, 1);
        birthDate.setYear(2024);
        birthDate.setMonth(1);
        birthDate.setDate(1);
        System.out.println("birthDate = " + birthDate);
        //birthDate.after(new Date(2023, 1, 1));
    }


}
