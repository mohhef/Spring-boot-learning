package Section4.xml;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {

    @Getter @Setter
    XMLJdbcConnection xmljdbcConnection;
}
