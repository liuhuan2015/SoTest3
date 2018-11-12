package com.liuh.sotest3;

/**
 * Date: 2018/11/12 11:07
 * Description:
 */
public class Hello {

    static {
        System.loadLibrary("myjni");
    }

    public native int add(int i, int j);

}
