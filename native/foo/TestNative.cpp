#include "TestNative.h"
#include "stdio.h"


JNIEXPORT void JNICALL Java_TestNative_foo
  (JNIEnv *, jobject) {
	printf("test native! foo.\n");
}
