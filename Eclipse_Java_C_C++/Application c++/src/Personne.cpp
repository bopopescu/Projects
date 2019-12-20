/*
 * Personne.cpp
 *
 *  Created on: 27 nov. 2019
 *      Author: DELL
 */

#include "Personne.h"

Personne::Personne(): firstname("firstname"),secondname("secondname"), password(400) {
	// TODO Auto-generated constructor stub

}
Personne::Personne(string firstname, string secondname, int password): firstname(firstname),secondname(secondname), password(password) {
	// TODO Auto-generated constructor stub

}
string Personne:: getfirstname()
{
	return firstname;

}
string Personne:: getsecondname()
{
	return secondname;

}
void Personne :: setfirstname(string firstnamee)
{
	firstname=firstnamee;
}
void Personne :: setsecondname(string secondnamee)
{
	secondname=secondnamee;
}

int Personne :: getpassword()
{
	return password ;
}
void Personne :: setpassword(int passworde)
{
	password=passworde;
}
void Personne  ::  saisiraccount()
{
	cout<< "register a new account "<< endl;
	cout << "enter your first name"<< endl;
	string champ;
	cin >> champ;
	setfirstname(champ);
	cout << "enter your second name" << endl;
	string champ2;
	cin >>champ2;
	setsecondname(champ2);
	cout << "enter your password"<< endl;
	int champ3;
	cin >> champ3;
	setpassword(champ3);
    cout << "welcome , account created" << endl;

}

Personne::~Personne() {
	// TODO Auto-generated destructor stub
}

