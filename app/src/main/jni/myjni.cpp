//
// Created by Administrator on 2018/11/12.
//

#include "com_liuh_sotest3_Hello.h"

JNIEXPORT jint JNICALL Java_com_liuh_sotest3_Hello_add
        (JNIEnv *env, jobject obj, jint i, jint j) {
    return i + j;
};