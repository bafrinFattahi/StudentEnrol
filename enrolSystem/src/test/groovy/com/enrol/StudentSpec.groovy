package com.enrol

/** imported libraries */
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

/** class being tested */


class StudentSpec extends Specification implements DomainUnitTest<Student> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
       when: "A Student has name, ID and course"

 def Student=new Student(name:'Janet Taylor',studentID:'45907812',course:'BSc Hon Engineering')

then:"the toString method will merge them."
Student.toString()=='Janet Taylor,45907812,BSc Hon Engineering'

    }
}
