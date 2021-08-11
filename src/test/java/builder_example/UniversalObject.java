package builder_example;

public class UniversalObject {
    private String url;
    private String webSite;
    private String webUI;
    private String js;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void setWebUI(String webUI) {
        this.webUI = webUI;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public UniversalObject build() {
        return this;
    }
}
