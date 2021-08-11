package contants;

public enum SteamUrls {
    BASE_URL("https://store.steampowered.com/"),
    CATEGORY_RPG_PARTY_BASED("category/rpg_party_based/");

    private String url;

    SteamUrls(String url) {
        this.url = url;
    }

    public String getBaseUrl() {
        return url;
    }

    public String getUrl() {
        return BASE_URL.getBaseUrl() + url;
    }
}
