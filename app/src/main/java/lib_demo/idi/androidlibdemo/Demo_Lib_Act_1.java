package lib_demo.idi.androidlibdemo;

import android.app.Activity;
import android.os.Bundle;

import lib_demo.idi.my_demo_library.AwecomeLibrary;

/**
 * Created by manmohan on 3/7/16.
 */
public class Demo_Lib_Act_1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AwecomeLibrary.getInstance().makemeawesome(this, "iDroidIndia");
    }
}
