package Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ForSampleOneController {

    @RequestMapping(value="/arindam")
    public String MethodTestOne()
    {
        return "Hello World hello World";
    }
}
