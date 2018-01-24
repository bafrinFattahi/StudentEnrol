package com.enrol

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
/** see the API for {@link grails.test.mixin.domain.DoaminClassUnitTestMixin} for usage instructions
*/


class CourseSpec extends Specification implements DomainUnitTest<Course> {

    def setup() {
    }

    def cleanup() {
    }

    void totalFees() {
when:"A Course has title and fees"

     def computing=new Course(title:'BSc Hon Computing',
      tuitionFees:9500)

then:"The calculateFees method will total fees"

computing.calculateFees()==38000
  
    }
}
