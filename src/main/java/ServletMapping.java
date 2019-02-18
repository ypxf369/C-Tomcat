/**
 * Created by yepeng on 2019/02/18.
 * servlet 配置
 */
public class ServletMapping {
    private String servleetName;
    private String url;
    private String clazz;

    public ServletMapping(String servleetName, String url, String clazz) {
        this.servleetName = servleetName;
        this.url = url;
        this.clazz = clazz;
    }

    public String getServleetName() {
        return servleetName;
    }

    public String getUrl() {
        return url;
    }

    public String getClazz() {
        return clazz;
    }

    public void setServleetName(String servleetName) {
        this.servleetName = servleetName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
