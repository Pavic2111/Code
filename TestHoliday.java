package HomeWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestHoliday {
	public static void main(String[] args) {
    Holiday h1 = new Holiday(1002, "thailand", 1);
    Holiday h2 = new Holiday(1603, "Hawai", 2);
    Holiday h3 = new Holiday(2020, "Ibiza", 3);
    Holiday h4 = new Holiday(30340, "egipet", 4);
    
    List<Holiday> HolidayOptions = new ArrayList<>();
    HolidayOptions.add(h1);
    HolidayOptions.add(h2);
    HolidayOptions.add(h3);
    HolidayOptions.add(h4);
    HolidayOptions.add(h1);
   
    
    System.out.println("our holidays are:");
    for (Holiday holiday : HolidayOptions) {
      System.out.println(holiday);
    }
    System.out.println();
    
    Set<Holiday> holidaySet = new HashSet<>();
    for (Holiday holiday : HolidayOptions) {
      holidaySet.add(holiday);
    }
    
    System.out.println("out holidays set");
    for (Holiday holiday : holidaySet) {
      System.out.println(holiday);
    }
    System.out.println();
    
    
    Map<Integer, Holiday> holidayMap = new HashMap<>();
    for (Holiday holiday : holidaySet) {
      holidayMap.put(holiday.clientId, holiday);
    }
    
    System.out.println(holidayMap.get(4));
    System.out.println(holidayMap.get(1));
    System.out.println(holidayMap.get(3));
    System.out.println(holidayMap.get(2));
    
  }
}


