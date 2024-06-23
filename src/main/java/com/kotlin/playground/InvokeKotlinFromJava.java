package com.kotlin.playground;


import com.kotlin.playground.classes.Course;
import com.kotlin.playground.classes.CourseUtils;
import com.kotlin.playground.classes.objectkeyword.Authenticate;
import com.kotlin.playground.dataset.CourseCategory;

public class InvokeKotlinFromJava {

    /**
     * JVM related Kotlin Annotations
     *
     * @JvmOverloads    - This is used to instruct the JVM to create the overloaded version of methods when dealing with default values
     * @JvmFields       - This is used to instruct the JVM to create the variable as a field
     * @JvmName         - This is used to instruct the JVM to create a custom name for a class or function
     * @JvmStatic       - This is used to expose the function that's part of the companion object or object as a static function
     *
     * */

    public static void main(String[] args) {
        Course course = new Course(1, "Reative Programming with Java", "Tutku", CourseCategory.DEVELOPMENT);

        // we can use default value with @JvmOverloads constructor
        Course course2 = new Course(1, "Reative Programming with Java", "Tutku");
        // int result = course.getNoOfCourses();
        // We dont need setters and getters with @JvmField annotation
        int result = course.noOfCourses;
        System.out.println("Course: " + course);

        /*
            CourseKt.printName();
            CourseKt.printName("Tutku");
        @JvmName(name = "printNameFromAnnotation") -> we change the method name with this annotation
        */
        /*
        CourseKt.printNameFromAnnotation();
        CourseKt.printNameFromAnnotation("Tutku");
        @file:JvmName("CourseUtils") -> we can change the Class name with this annotation
        */
        CourseUtils.printNameFromAnnotation();
        CourseUtils.printNameFromAnnotation("Tutku");


        // We can access companion object in Java
        Course.Companion.printNameFromCompanionObject("Hello Non-Static");
        // We can access method directly with @JvmStatic
        Course.printNameFromCompanionObject("Hello Static");

        Authenticate.INSTANCE.authenticate("tutku", "123");
    }
}
