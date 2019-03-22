package sample;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class SampleEJB {

    public String getWelcomeMessage() {
        return "Hello Demo JSF App!";
    }

    public List<SampleEntity> getEntityList() {
        return Arrays.asList(
                new SampleEntity(1L, "One"),
                new SampleEntity(2L, "Two"),
                new SampleEntity(3L, "Three"),
                new SampleEntity(4L, "Four")
        );
    }
}
