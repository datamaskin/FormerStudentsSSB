package edu.tamu.eis.domain

import grails.rest.Resource;

@Resource()
class Book {
	
	String title
	String author
	Double price

    static constraints = {
		title blank:false 
		author blank:false   
    }
}
