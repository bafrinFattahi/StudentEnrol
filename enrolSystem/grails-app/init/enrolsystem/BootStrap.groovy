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


def WADI = new Module(
title: 'Web Application Development Implementation',
code: '55-23-54',
credits: 20,
lecturer: 'Jacky Smith',
course: 'BSc Computing',
description: 'All about web development').save()

def INFSYS = new Module(
title: 'Information System',
code: '55-23-65',
credits: 20,
lecturer: 'Lyne Dawson',
course: 'BSc Computing',
description: 'All about information system').save()


def poneil= new Lecturer(
fullName: 'Peter Oneil',
post :'Tutor',
subject:'Programming',
lecturerEmail:'poniel@shu.ac.uk',
office:'9223',
bio: 'all about peter oniel'

def ldawson= new Lecturer(
fullName: 'Leyn Dawson',
post :'Tutor',
subject:'Mobile Application',
lecturerEmail:'ldawson@shu.ac.uk',
office:'9232',
bio: 'all about lyne Dawson'
    def destroy = {
    }
}
