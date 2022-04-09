import java.util.*;

public class TransformDate {
    
    /**
     * Transform List of Dates from "1st May 2020" to "2020-05-01"
     * @param dates
     * @return
     */
    public static List<String> preprocess(List<String> dates) {
        List<String> result = new ArrayList<String>();
        HashMap<String, Integer> monthsMap = new HashMap<>();
        monthsMap.put("Jan", 1);
        monthsMap.put("Feb", 2);
        monthsMap.put("Mar", 3);
        monthsMap.put("Apr", 4);
        monthsMap.put("May", 5);
        monthsMap.put("Jun", 6);
        monthsMap.put("Jul", 7);
        monthsMap.put("Aug", 8);
        monthsMap.put("Sep", 9);
        monthsMap.put("Oct", 10);
        monthsMap.put("Nov", 11);
        monthsMap.put("Dec", 12);
        for (String date : dates) {
            result.add(transformDate(date, monthsMap));
        }
        return result;
    }

    private static String transformDate(String date, HashMap<String, Integer> monthsMap) {

        String[] dateSplit = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(dateSplit[2]).append("-");
        if (monthsMap.get(dateSplit[1]) < 10) {
            sb.append("0" + monthsMap.get(dateSplit[1])).append("-");
        } else {
            sb.append(monthsMap.get(dateSplit[1])).append("-");
        }
        String year;
        if (Character.isDigit(dateSplit[0].charAt(1))) {
            year = dateSplit[0].substring(0, 2);
        } else {
            year = "0" + dateSplit[0].substring(0, 1);
        }
        sb.append(year);

        return sb.toString();
    }

}
