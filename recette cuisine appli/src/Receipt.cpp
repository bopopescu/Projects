/*
 * Receipt.cpp
 *
 *  Created on: 1 avr. 2020
 *      Author: DELL
 */

#include "Receipt.h"
using namespace std;





Receipt::Receipt()
{

}

Receipt::Receipt(std::string t_type,std::string t_name, std::string t_ingredient, std::string t_preparation ) {
	type=t_type;
	name =t_name;
ingredient=t_ingredient ;
preparation=t_preparation;



}

Receipt::~Receipt() {
	// TODO Auto-generated destructor stub
}

