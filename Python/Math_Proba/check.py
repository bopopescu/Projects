import numpy as np
import math

vecteurtxt=open("vecteurtxt.txt","r")
vecteurlist = vecteurtxt.read().splitlines()
print(vecteurlist)
D=np.array([],float)
for item in vecteurlist:
    S=np.array([item],float)
    D= np.append(D,S)
    print(D)
rotxt=open("rotxt.txt","r")
ro = rotxt.read().splitlines()
Dpplist = np.array([], float)
for item in D:
    Dp = np.delete(D, np.where(D == item))
    print(Dp)
    dpp = np.min(int(ro[0]) * Dp)
    print(dpp)
    Dpplist = np.append(Dpplist, dpp)
print(Dpplist)

def proba(x):
    fi=(1/(math.sqrt(2*math.pi))*(math.exp((-1/2)*math.pow(x,2))))

    return(fi)
Dpplistmin=np.min(Dpplist)
print(Dpplistmin)
size=Dpplist.size
propabilite=0
for i in range(size):
    propabilite=propabilite+(proba(np.subtract(Dpplist[i],Dpplistmin)))
propabilite=1/size*propabilite
print(propabilite)
vecteurtxt.close
rotxt.close



