/*
 * Pharmacie.h
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#ifndef PHARMACIE_H_
#define PHARMACIE_H_

#include "Personne.h"

class Pharmacie: public Personne {

public:
	int phonenumber;
	Pharmacie();
	virtual ~Pharmacie();
	Pharmacie(string firstname,string secondname, int password,int phonenumber);
	void dailycalender();
	void gardecaldender();
	void display() ;

};

#endif /* PHARMACIE_H_ */
