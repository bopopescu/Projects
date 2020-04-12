//============================================================================
// Name        : Recetttec.cpp
// Author      : maryem
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "Receipt.h"
#include <vector>
#include<fstream>
#include <tinyxml2.h>
#include <string>;
#include <sstream> ;


using namespace tinyxml2;
int main() {

	XMLDocument xmlDoc;
	vector<Receipt*>tab;
	Time* period ;
	string a,b ,c,d;
	int number=0;
	XMLError e= xmlDoc.LoadFile("C:/Users/DELL/eclipse-workspacec/Recetttec/src/dbpackage.xml");
	XMLElement *Eleme = xmlDoc.FirstChildElement()->FirstChildElement("recette");
	int j = 0 ;

	while(Eleme!=0)

	{
		XMLElement *elem1 = Eleme;
	a  =  elem1->Attribute("name");
	b  =  elem1->Attribute("ingredients");
	c  =  elem1->Attribute("preparation");
	d=elem1->Attribute("type");
	tab.push_back(new Receipt(d,a,b,c));

	Eleme=elem1->NextSiblingElement();

	}

    int entry,entry_1,entry_3,entry_4,entry_5,entry_6,entry_7;
    string entry_2;
	cout << "!!!Hello to my receipt World!!!" << endl; // prints !!!Hello World!!!
	while(number==0)
	{
	cout << " 1-Traditional food  "<<endl;
	cout << " 2-Fast food " <<endl;
	cout << " 3- Dessert" <<endl;
	cout << " 4- Healthy food"<<endl;
	cin >> entry;

	if (entry==1){int j =1;
		for (int i = 0;i<tab.size();i++){
		if (tab[i]->getType()=="traditionnel"){
			cout<<j<<"-"<<tab[i]->getName()<<endl;
			j=j+1;

		}}
	cout << " choose ur receipt "<<endl;
	cin >> entry_1;
	cout<< tab[entry_1]->getIngredient()<<endl;
	cout << tab[entry_1]->getPreparation()<<endl;
	cout<< tab[entry_1]->getPeriod()<<endl;

	cout << "u need another receipt ? y/o"<<endl;
cin >> entry_2;
}
	else if (entry==2){int j =1;
		for (int i = 0;i<tab.size();i++){
			if (tab[i]->getType()=="Fast Food"){
					cout<<j<<"-"<<tab[i]->getName()<<endl;
					j=j+1;
			}}
			cout << " choose ur receipt "<<endl;
			cin >> entry_1;
			cout<< tab[entry_1]->getIngredient()<<endl;
			cout << tab[entry_1]->getPreparation()<<endl;
			cout<< tab[entry_1]->getPeriod()<<endl;

			cout << "u need another receipt ? y/o"<<endl;
		cin >> entry_2;
	}
	else if (entry==3)
	{ int j =1;
		for (int i = 0;i<tab.size();i++)
				{if (tab[i]->getType()=="Dessert")
				{
					cout<<j<<"-"<<tab[i]->getName()<<endl;
					j=j+1;

				}}
			cout << " choose ur receipt "<<endl;
			cin >> entry_1;
			cout<< tab[entry_1]->getIngredient()<<endl;
			cout << tab[entry_1]->getPreparation()<<endl;
			cout<< tab[entry_1]->getPeriod()<<endl;

			cout << "u need another receipt ? y/o"<<endl;
		cin >> entry_2;
	}
	else {int j =1;
		for (int i = 0;i<tab.size();i++)
				{if (tab[i]->getType()=="Healthy Food")
				{
					cout<<j<<"-"<<tab[i]->getName()<<endl;
					j=j+1;

				}}
			cout << " choose ur receipt "<<endl;
			cin >> entry_1;
			cout<< tab[entry_1]->getIngredient()<<endl;
			cout << tab[entry_1]->getPreparation()<<endl;
			cout<< tab[entry_1]->getPeriod()<<endl;


			cout << "u need another receipt ? y/o"<<endl;
		cin >> entry_2;
	}

	if(entry_2=="y")
	{
		number=0;
	}
	else
	{number=1;
	cout << "good bye to next time ;) " <<endl;

	}

}

	return 0;
}
