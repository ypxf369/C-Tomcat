/**
 * Created by yepeng on 2019/02/18.
 */
public abstract class CServlet {
    public abstract void doGet(CRequest request, CResponse response);

    public abstract void doPost(CRequest request, CResponse response);

    public void service(CRequest request, CResponse response) {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            doPost(request, response);
        } else if (request.getMethod().equalsIgnoreCase("GET")) {
            doGet(request, response);
        }
    }
}
