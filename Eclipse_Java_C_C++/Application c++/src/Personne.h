/*
 * Personne.h
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#ifndef PERSONNE_H_
#define PERSONNE_H_
#include <iostream>
using namespace std;

class Personne {
private :
string firstname;
string secondname;
int password;


public:
	Personne();
	Personne(string firstname,string secondname, int password);
	string getfirstname();
	string getsecondname();
	int getpassword();
	void setfirstname(string firstnamee);
	void setsecondname(string secondnamee);
	void setpassword(int passworde);
	void saisiraccount();
    void  display() ;
	virtual ~Personne();


};

#endif /* PERSONNE_H_ */
