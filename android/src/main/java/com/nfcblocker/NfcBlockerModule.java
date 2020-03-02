package com.nfcblocker;

import android.app.Activity;
import android.nfc.NfcAdapter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class NfcBlockerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public NfcBlockerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "NfcBlocker";
    }

    @ReactMethod
    public void disableNfc() {
        final Activity activity = getCurrentActivity();

        NfcAdapter adapter = NfcAdapter.getDefaultAdapter(activity);
        if (adapter != null) {
            adapter.enableReaderMode(activity, null, NfcAdapter.STATE_OFF, null);
        }
    }
    
    @ReactMethod
    public void enableNfc() {
        final Activity activity = getCurrentActivity();

        NfcAdapter adapter = NfcAdapter.getDefaultAdapter(activity);

        if (adapter != null) {
            adapter.disableReaderMode(activity);
        }
    }
}

