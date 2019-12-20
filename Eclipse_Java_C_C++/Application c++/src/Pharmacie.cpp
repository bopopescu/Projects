/*
 * Pharmacie.cpp
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#include "Pharmacie.h"

#include <iostream>

Pharmacie::Pharmacie():phonenumber(40) {
	// TODO Auto-generated constructor stub

}
Pharmacie::Pharmacie(string firstname,string secondname, int password, int phonenumber):Personne (firstname, secondname, password),phonenumber(phonenumber) {
	// TODO Auto-generated constructor stub

}
Pharmacie::~Pharmacie() {
	// TODO Auto-generated destructor stub
}
void Pharmacie :: dailycalender()
{
 cout <<"*************************"<<endl;
 cout <<"Our program :" << endl;
 cout << "From Monday to Friday : 08:15 to 19:00 "<< endl;
 cout << "You are welcome"<<endl;
 cout <<"*************************"<<endl;


}

void Pharmacie :: gardecaldender()
{
 cout <<"*************************"<<endl;
 cout <<"Hello weekend :" << endl;
 cout << "garde Pharmacie for this weekend is "<< endl;
 cout << "garde Pharmacie "<< endl;
 cout << "You are welcome"<<endl;
 cout <<"*************************"<<endl;


}
