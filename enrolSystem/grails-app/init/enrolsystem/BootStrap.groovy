package com.enrol

class BootStrap {

    def init = { servletContext ->

def bdafenn= new Leader(
fullName:'Dr.Bath Daffen',
department: 'Computing',
subject: 'GameDevelopmet',
leaderEmail: 'bath.daffen@shu.ac.uk',
username:'CBDGAMED',
password:'BLUE321',
office:'office-9432',
bio: 'All about Bath Daffen').save()



def Mlove= new Leader(
fullName:'Dr.Mathew Love',
department: 'Computing',
subject: 'Reader',
leaderEmail: 'M.love@shu.ac.uk',
username:'CMLNET',
password:'red321',
office:'office-9430',
bio: 'All about Mathew Love').save()


def sBlue= new Leader(
fullName:'Dr.Sarah Blue',
department: 'Computing',
subject: 'Web Design',
leaderEmail: 'S.BLUE@shu.ac.uk',
username:'CSBCC',
password:'red321',
office:'office-9414',
bio: 'All about Sarah Blue').save()




def computing=new Course(
department:'Computing', 
code: 'CS123',
title: 'BSs Hon Computing',
leader: Mlove,
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
leader: sBlue,
startDate:new Date('09/09/2018'),
endDate:new Date('07/07/2018'),
numberOfStudents:55,
studyMode:'FullTime',
tutionFees:9000.00,
description:'lOREM IPSUM.').save()


def GameDevelopment=new Course(
department:'Computing', 
code: 'CS34',
title: 'BSs Hon Game Development',
leader: bdafenn,
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
course: GameDevelopment).save()

def Pdowson=new Student(
name:'Peter Dawson',
studentID:'26021233',
dob:new Date('24/08/1989'),
isFundingAvailable: true,
email:'Pdawson@student.com',
username:'b6021233',
password:'Bru324',
course: Network).save()



def Aayshe=new Student(
name:'Anne Ayshe',
studentID:'26021444',
dob:new Date('24/08/1991'),
isFundingAvailable: true,
email:'Anne.ayshe@student.com',
username:'b6021444',
password:'Brain321',
course: computing).save()



def poneil= new Lecturer(
fullName: 'Peter Oneil',
post :'Lecturer',
subject:'Programming',
lecturerEmail:'poniel@shu.ac.uk',
office:'9223',
bio: 'all about peter oniel').save()


def ldawson= new Lecturer(
fullName: 'Lynne Dawson',
post :'Lecturer',
subject:'Mobile Application',
lecturerEmail:'ldawson@shu.ac.uk',
office:'9232',
bio: 'all about lyne Dawson').save()


def Jright= new Lecturer(
fullName: 'Jacky Right',
post :'Lecturer',
subject:'GameDevelopmet',
lecturerEmail:'jright@shu.ac.uk',
office:'9223',
bio: 'all about Jacky Right').save()



def WADI = new Module(
title: 'Web Application Development Implementation',
code: '55-23-54',
credits: 20,
lecturer: Jright,
course: 'BSc Computing',
description: 'All about web development').save()

def INFSYS = new Module(
title: 'Information System',
code: '55-23-65',
credits: 20,
lecturer: ldawson,
course: 'BSc Computing',
description: 'All about information system').save()


def Program= new Module(
title: 'Programming Language C++',
code: '55-67-65',
credits: 20,
lecturer: poneil,
course: 'GameDevelopment',
description: 'All about C++ Programming Language').save()








    def destroy = {
    }
}
}
