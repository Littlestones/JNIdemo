#include <jni.h>

jint  Java_com_example_uu_jnidemo_MainActivity_add
  (JNIEnv* env, jobject obj, jint i, jint j){
  return i+j;
  }