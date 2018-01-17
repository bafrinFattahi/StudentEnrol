package com.enrol

class BootStrap {

    def init = { servletContext ->
def computing=new Course(
department:'Computing', 
code: 'CS123',
title: 'BSs Hon Computing',
leader:'Dr Michelle Murphy',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2018'),
numberOfStudents:55,
studyMode:'FullTime',
tutionFees:9000.00,
description:'lOREM IPSUM.').save()


def Network=new Course(
department:'Computing', 
code: 'CS1234',
title: 'BSs Hon Networking',
leader:'Dr Michelle Murphy',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2018'),
numberOfStudents:55,
studyMode:'FullTime',
tutionFees:9000.00,
description:'lOREM IPSUM.').save()


def GameDevelopment=new Course(
department:'Computing', 
code: 'CS12444',
title: 'BSs Hon Game Development',
leader:'Dr john smith',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2018'),
numberOfStudents:60,
studyMode:'FullTime',
tutionFees:9000.00,
description:'lOREM IPSUM.').save()
    }
    def destroy = {
    }
}
