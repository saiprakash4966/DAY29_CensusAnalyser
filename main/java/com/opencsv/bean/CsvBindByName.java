package com.opencsv.bean;

public @interface CsvBindByName {

	String column();

	boolean required();

}
