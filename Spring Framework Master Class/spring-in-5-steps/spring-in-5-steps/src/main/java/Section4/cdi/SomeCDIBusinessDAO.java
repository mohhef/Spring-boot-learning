package Section4.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCDIBusinessDAO {

    public int[] getData(){
        return new int[]{5,89,100};
    }


}
