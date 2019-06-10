import java.util.*;

class DepartmentSort {
    private static Set<String> uniqueDepartments = new TreeSet<>();
    static String[] sort(String[] departmentArray) {
        for (String line : departmentArray) {
            line = line.replaceAll("”", "");
            String[] lineStructure = line.split("\\\\");
            String department = "";
            for(String element : lineStructure) {
                department = department + element + "\\";
                uniqueDepartments.add(department.replaceAll("\\\\$", "”"));
            }
        }
        List<String> listForReverse = new ArrayList<>(uniqueDepartments);
        Collections.reverse(listForReverse);
        String[] result = new String[listForReverse.size()];
        for (int i = 0; i < result.length; i++) { result[i] = listForReverse.get(i); }
        return result;
    }
}
