package Section4.cdi;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class SomeCDIBusiness {

    @Inject
    @Setter @Getter
    SomeCDIBusinessDAO someCDIBusinessDAO;


    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = someCDIBusinessDAO.getData();
        for(int i: data){
            if(i>greatest){
                greatest=i;
            }
        }
        return greatest;
    }
}
