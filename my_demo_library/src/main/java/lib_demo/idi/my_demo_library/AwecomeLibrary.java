package lib_demo.idi.my_demo_library;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by manmohan on 3/7/16.
 */
public class AwecomeLibrary {
    private static AwecomeLibrary ourInstance = new AwecomeLibrary();

    public static AwecomeLibrary getInstance() {
        return ourInstance;
    }

    private AwecomeLibrary() {
    }

    public void makemeawesome(Context con, String data)
    {
        Toast.makeText(con, "Hello Awesome", Toast.LENGTH_LONG).show();

    }
}
