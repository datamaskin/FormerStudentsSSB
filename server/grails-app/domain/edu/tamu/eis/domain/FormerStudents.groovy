package edu.tamu.eis.domain

class FormerStudents {

    BigInteger UIN

    static constraints = {
        UIN(minSize: 9, maxSize: 9, blank: false, unique: true)
    }
}
