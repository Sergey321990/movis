import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FilmsManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        String[] actual = manager.findALL();
        String[] expected = {"Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Last() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
}




