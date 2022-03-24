package com.bl;

public interface CsvToBeanBuilder<T> {

	void withType(Class<IndiaCensusCSV> class1);

	void withIgnoreLeadingWhiteSpace(boolean b);

	CsvToBean<IndiaCensusCSV> build();

}
