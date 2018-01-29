package com.qiyi.xhook;

/**
 * Created by caikelun on 18/01/2018.
 */

public class NativeHandler {
    private static final NativeHandler ourInstance = new NativeHandler();

    public static NativeHandler getInstance() {
        return ourInstance;
    }

    private NativeHandler() {
    }

    public native int refresh();

    public native void enableDebug(boolean flag);
}
