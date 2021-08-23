import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestHttpBinViaOkHttpClient {


    @Test
    public void testHttpBinGetRequest() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://httpbin.org/get")
                .build();

        Call call = client.newCall(request);

        try {
            Response response = call.execute();
            assert response.code() == 200;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHttpBinPostRequest() {
        OkHttpClient client = new OkHttpClient();

        RequestBody body = new FormBody.Builder()
                .add("username", "user")
                .add("passwrd", "passwrd")
                .build();

        Request request = new Request.Builder()
                .url("https://httpbin.org/post")
                .post(body)
                .build();

        Call call = client.newCall(request);

        try {
            Response response = call.execute();
            assert response.code() == 200;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
