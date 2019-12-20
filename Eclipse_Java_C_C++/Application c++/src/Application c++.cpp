// Name        : Application.cpp
// Author      : maryem jaballah
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Personne.h"
#include "Client.h"
#include "Pharmacie.h"
#include<stdio.h>
#include<string.h>
using namespace std;

int main() {
	Pharmacie P;
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	cout << "Are you a customer ?" << endl;
	cout << "y?n"<<endl;
	char * response;
	response=new char ();
     cin >>response;
	if( (strcmp(response,"y")==0)|(strcmp(response,"Y")==0))
	{
    Client client1;
    cout <<"subscribe to receive news"<<endl;
    client1.saisiraccount();
    cout << "menu:\n";
    cout<< "1-buy\n";
    cout<<"2-dailycalender\n";
    cout <<"3-weekedgarde\n";
    cout << "4-exit\n";
    cout << " enter your choice please\n";

    int menu ;
    cin >>  menu;
    switch(menu){
    case 1:
    	client1.buy();
    	break;
    case 2 :
    	P.dailycalender();
    	break;
    case 3 :
    	P.gardecaldender();
    	break;
    case 4 :
    	cout << "thanks for your visit";
    	break;
    }


	}


	return 0;
}
