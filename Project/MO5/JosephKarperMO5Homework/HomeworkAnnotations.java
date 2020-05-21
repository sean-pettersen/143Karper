package com.olympic.cis143.m05.student.homework.annotations1;

public class HomeworkAnnotations implements IHomeworkAnnotation {
	//sayHello comes from the IHomeworkAnnotation interface so we override it in this class
   @Override
   @Deprecated
    public String sayHello() {
        return "Hello";
    }
    @Deprecated
    public String sayGoodBye() {
        return "Goodbye";
    }
}
