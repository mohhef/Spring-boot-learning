package telusko;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Getter @Setter
    private int aid;
    private String aname;
    private String tech;
    @Autowired
    private laptop laptop;

    public void show()
    {
        System.out.println("show");
        laptop.compile();
    }
}
