/*
 * Time.h
 *
 *  Created on: 1 avr. 2020
 *      Author: DELL
 */

#ifndef TIME_H_
#define TIME_H_

class Time {
private:
	int t_second;
	int t_minutes;
	int t_heures ;
public:
    Time();
	Time(int second, int minutes, int heures);
	virtual ~Time();

	int getHeures() const {
		return t_heures;
	}

	void setHeures(int heures) {
		this->t_heures= heures;
	}

	int getMinutes() const {
		return t_minutes;
	}

	void setMinutes(int minutes) {
		this->t_minutes = minutes;
	}

	int getSecond() const {
		return t_second;
	}

	void setSecond(int second) {
		this->t_second = second;
	}
};

#endif /* TIME_H_ */
