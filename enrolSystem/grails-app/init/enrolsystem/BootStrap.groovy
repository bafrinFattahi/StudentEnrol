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
code: 'CS34',
title: 'BSs Hon NGame Development',
leader:'Dr john Smith',
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2018'),
numberOfStudents:55,
studyMode:'FullTime',
tutionFees:9000.00,
description:'lOREM IPSUM.').save()



def JSmith=new Student(
name:'John Smith',
studentID:'26021244',
dob:new Date('24/09/1988'),
isFundingAvailable: true,
email:'Jsmith@student.com',
username:'b6021244',
password:'Bru123',
course: 'BSc Computing').save()

def Pdowson=new Student(
name:'Peter Dawson',
studentID:'26021233',
dob:new Date('24/08/1989'),
isFundingAvailable: true,
email:'Pdawson@student.com',
username:'b6021233',
password:'Bru324',
course: 'BSc Computing').save()
    }
    def destroy = {
    }
}
