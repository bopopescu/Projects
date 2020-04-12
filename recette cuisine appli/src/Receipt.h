/*
 * Receipt.h
 *
 *  Created on: 1 avr. 2020
 *      Author: DELL
 */
#include <string>
#ifndef RECEIPT_H_
#define RECEIPT_H_
#include <iostream>
#include "Time.h"





class Receipt {
private:
	std::string type;
	std::string name;
	std::string ingredient;
	std::string preparation ;
	Time *period;

public:
	Receipt();
	Receipt (std::string t_type,std::string t_name,std::string t_ingredient,std::string t_preparation);
	virtual ~Receipt();

	 std::string& getIngredient()  {
		return ingredient;
	}

	void setIngredient( std::string &ingredient) {
		this->ingredient = ingredient;
	}

	 std::string& getPreparation()  {
		return preparation;
	}

	void setPreparation(std::string &preparation) {
		this->preparation = preparation;
	}

	 Time*& getPeriod()  {
		return period;
	}

	void setPeriod( Time *&period) {
		this->period = period;
	}

	const std::string& getName() const {
		return name;
	}

	void setName(const std::string &name) {
		this->name = name;
	}

	const std::string& getType() const {
		return type;
	}

	void setType(const std::string &type) {
		this->type = type;
	}
};

#endif /* RECEIPT_H_ */
