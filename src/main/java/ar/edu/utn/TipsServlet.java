package ar.edu.utn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TipsServlet {

    static final List<String> TIPS = new ArrayList<String>();

    static {
        TIPS.add("tip 1");
        TIPS.add("tip 2");
        TIPS.add("tip 3");
    }

    @RequestMapping(path = "/randomTip", method = RequestMethod.GET)
    public String getRandomTip() {
        int index = (int) (Math.random() * 10) % TIPS.size();
        return TIPS.get(index);
    }
}
