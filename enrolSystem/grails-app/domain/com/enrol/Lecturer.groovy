package com.enrol
class Lecturer {

String fullName
String post
String subject
String lecturerEmail
String office
String bio

String toString(){
return fullName
}

static constrains={

fullName blank:false, nullable:false
post blank:false, nullable:false
subject blank:false, nullable:false
lecturerEmail blank:false, nullable:false, email:true
office blank:false, nullable:false
bio  blank:false, nullable:false, maxSize:5000, widget:'textarea'
}
}
