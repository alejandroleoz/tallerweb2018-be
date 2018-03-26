package ar.edu.utn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TipsServlet {

    static final List<String> TIPS = new ArrayList<String>();

    static {
        TIPS.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed id odio at dui sagittis imperdiet quis at diam. Nunc vitae odio at purus consectetur tempor nec sit amet purus. Donec lectus risus, consectetur sit amet lectus at, blandit hendrerit turpis. Vestibulum massa nibh, ultrices volutpat dolor nec, ultrices auctor arcu. Morbi sed tincidunt augue. Aliquam erat volutpat. Sed congue cursus sodales. Aliquam id diam at nisl blandit iaculis. Morbi vitae nisl vel dui tristique feugiat ut id ante. Quisque fermentum, ligula id tempus ornare, augue sem gravida eros, eu iaculis ex lectus condimentum felis. Mauris mattis ex tortor, ut volutpat arcu vehicula laoreet. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas fringilla pulvinar tellus, ut euismod purus tristique id. Vivamus aliquam aliquet tempor.");
        TIPS.add("Suspendisse dapibus massa eu quam rhoncus fringilla. Proin eu tellus nulla. Sed blandit neque vehicula tincidunt mattis. Duis lacinia commodo turpis, eget blandit velit maximus suscipit. In hac habitasse platea dictumst. Maecenas sit amet ligula eget erat scelerisque pulvinar. Aliquam posuere augue enim, in tincidunt mauris sollicitudin in. Proin tincidunt, ex nec interdum interdum, tellus augue hendrerit risus, a sodales turpis leo sit amet sem. Etiam ut porta ipsum. Fusce quis felis magna. Sed eu rutrum sem. Sed sed libero a quam finibus tempor. Curabitur sed est magna.");
        TIPS.add("Vivamus sollicitudin nisi tincidunt turpis volutpat interdum. Aliquam maximus, urna quis mollis laoreet, ligula tellus luctus dolor, tincidunt finibus augue purus ut lorem. Phasellus in augue id odio sodales suscipit. Sed nisi dolor, volutpat at eros sit amet, fringilla malesuada enim. Quisque imperdiet eget ipsum in cursus. Nam justo lorem, tincidunt eget dui et, sollicitudin suscipit libero. Suspendisse fringilla, odio a scelerisque convallis, eros arcu rutrum risus, sit amet vulputate ipsum nulla at orci. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam ac metus metus. Integer aliquam vulputate rutrum. Cras ut urna libero. Nulla rutrum aliquet porta. Nulla facilisi. Proin bibendum, leo id tristique tincidunt, tellus metus eleifend magna, sit amet ullamcorper dui nisi quis augue.");
        TIPS.add("Suspendisse congue tristique lacinia. Maecenas consectetur tempus nisl, eget faucibus massa dictum vitae. Aliquam ut rutrum nibh. Suspendisse suscipit risus enim, vel tempor nibh hendrerit id. Proin vel posuere quam. Aenean quis mauris molestie, sagittis enim non, congue ipsum. Suspendisse et odio sapien. Donec sollicitudin bibendum libero, nec vestibulum leo congue sit amet. Nam elementum erat massa, id sodales felis tincidunt et. Sed tempus lacinia sem nec mollis. Maecenas scelerisque in ipsum non tempor. Donec ac tempor odio, at porttitor nunc. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam lobortis hendrerit sem quis vehicula.");
        TIPS.add("Fusce lobortis rhoncus porttitor. Etiam risus diam, feugiat sed dolor quis, elementum vulputate odio. Praesent non libero placerat dolor feugiat pretium. Duis sit amet faucibus metus, a egestas nunc. Sed et tortor non nisi consequat pellentesque in eu enim. Aenean commodo mi eu risus malesuada, eget mollis est pharetra. Morbi sit amet convallis justo, ac finibus tortor. Nunc non odio ac magna scelerisque tincidunt eu id justo. Cras in sem leo. Mauris pulvinar orci in massa vulputate, quis suscipit massa ultrices. Sed tincidunt non augue quis mattis. Nam quis urna a nulla bibendum dictum sed vitae nulla. Etiam quis massa nec turpis ultricies suscipit. Mauris pretium tellus at urna faucibus, ac rhoncus nisi eleifend.");
        TIPS.add("Cras cursus massa ligula, ut egestas leo dapibus in. Vivamus vulputate felis non lectus elementum mollis. Proin eu lacinia ex. Nullam non ipsum at felis aliquam rhoncus. Proin maximus semper dolor, accumsan tempor quam lacinia et. Nulla odio augue, aliquam laoreet feugiat non, luctus quis enim. Suspendisse posuere augue sit amet lacus interdum, sit amet fermentum ex rhoncus. Nullam rutrum magna a vehicula porta. Sed tempor faucibus tellus sed aliquam. Pellentesque quis rutrum dui. Donec auctor sodales justo in feugiat. Fusce ac velit vestibulum, vulputate metus et, dictum nunc. Morbi posuere semper mattis. Nullam enim quam, lacinia ut convallis id, volutpat pretium sem. Proin suscipit est eu malesuada vulputate. Proin faucibus libero nisi, at faucibus tortor condimentum at.");
    }

    @RequestMapping(path = "/randomTip", method = RequestMethod.GET)
    public String getRandomTip(HttpServletResponse response) {

        // CORS headers
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET");

        // get the tip
        int index = (int) (Math.random() * 10) % TIPS.size();
        return TIPS.get(index);
    }
}
