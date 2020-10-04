package telusko;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString(includeFieldNames=true)
@Component
public class laptop {
    @Getter @Setter
    private int lid;
    private String brand;


    public void compile(){
        System.out.println("Compiling");
    }
}
