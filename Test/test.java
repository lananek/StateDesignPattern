import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Post post = new Post();
        post.doAction();
        Assertions.assertEquals("Пост придумывается" + System.lineSeparator(), output.toString());
    }

    
    @Test
    public void test2() {
        Post post = new Post();
        post.MakePost();
        post.ReadyToPublic();
        post.doAction();
        Assertions.assertEquals("Пост придумывается" + System.lineSeparator()
                + "Пост готов к публикации" + System.lineSeparator() +
                "Пост опубликован" + System.lineSeparator(), output.toString());
    }

    @Test
    public void test3() {
        Plane plane = new Plane();
        plane.MakePost();
        plane.ReadyToPublic();
        plane.MakePost();
        Assertions.assertEquals("Пост придумывается" + System.lineSeparator()
                + "Пост готов к публикации" + System.lineSeparator() +
                "Ошибка. Пост опубликован" + System.lineSeparator(), output.toString());
    }

    
    @AfterEach
    public void cleanUpStreams() {
        System.setOut(standardOut);
    }
}
