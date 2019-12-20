/*
 * Client.cpp
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#include "Client.h"

Client::Client() : Personne(), phonenumber (40){
	// TODO Auto-generated constructor stub

}
Client::Client(string firstname,string secondname, int password,int phonenumbere) :Personne( firstname, secondname, password), phonenumber (phonenumbere){
	// TODO Auto-generated constructor stub

}

Client::~Client() {
	// TODO Auto-generated destructor stub
}
void Client :: buy(){
	cout << "menu"<<endl;
	cout <<" 1-medecament ";


}

