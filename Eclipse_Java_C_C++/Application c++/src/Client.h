/*
 * Client.h
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#ifndef CLIENT_H_
#define CLIENT_H_

#include "Personne.h"

class Client: public Personne {

private :
	int phonenumber;


public:
	Client();
	virtual ~Client();
	Client(string firstname,string secondname, int password,int phonenumber);
	void display() ;
	void buy();


};

#endif /* CLIENT_H_ */
