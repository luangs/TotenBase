package br.com.luan.totenbase;

import android.content.Context;
import android.os.Bundle;

import com.github.rrsystems.utilsplus.android.UtilsPlus;

import java.lang.reflect.Method;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDebugDBAddressLogToast(this);
    }

    public static void showDebugDBAddressLogToast(Context context) {
        if (BuildConfig.DEBUG) {
            try {
                Class<?> debugDB = Class.forName("com.amitshekhar.DebugDB");
                Method getAddressLog = debugDB.getMethod("getAddressLog");
                Object value = getAddressLog.invoke(null);
                UtilsPlus.getInstance().toast((String) value,10);
            } catch (Exception ignore) {

            }
        }
    }
}
