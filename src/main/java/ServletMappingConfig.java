import java.util.ArrayList;
import java.util.List;

/**
 * Created by yepeng on 2019/02/18.
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappings = new ArrayList<>();

    static {
        servletMappings.add(new ServletMapping("findPerson", "/person", "FindPersonServlet"));
        servletMappings.add(new ServletMapping("helloWorld", "/helloWorld", "HelloWorldServlet"));
    }
}
