import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentSortTest {
    @Test
    void testSort() {
        String[] testArray = {"“K1\\SK1”",
                "“K1\\SK2”",
                "“K1\\SK1\\SSK1”",
                "“K1\\SK1\\SSK2”",
                "“K2”",
                "“K2\\SK1\\SSK1”",
                "“K2\\SK1\\SSK2”"};
        String[] result = {"“K2”",
                "“K2\\SK1”",
                "“K2\\SK1\\SSK2”",
                "“K2\\SK1\\SSK1”",
                "“K1”",
                "“K1\\SK2”",
                "“K1\\SK1”",
                "“K1\\SK1\\SSK2”",
                "“K1\\SK1\\SSK1”"};
        assertArrayEquals(result, DepartmentSort.sort(testArray));
    }
}