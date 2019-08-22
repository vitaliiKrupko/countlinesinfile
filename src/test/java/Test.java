import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test() {
        String [] args = new String[]{"File2"};
        Main.main(args);
        fail("Введіть дві назви файлів");
    }
}
