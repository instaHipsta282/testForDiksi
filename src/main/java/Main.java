public class Main {
    public static void main(String[] args) {
        String[] array = {"“K1\\SK1”",
                "“K1\\SK2”",
                "“K1\\SK1\\SSK1”",
                "“K1\\SK1\\SSK2”",
                "“K2”",
                "“K2\\SK1\\SSK1”",
                "“K2\\SK1\\SSK2”"};
        String[] result = DepartmentSort.sort(array);
        for (String s :
                result) {
            System.out.println(s);
        }
    }
}
