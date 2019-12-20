import sys
import time
import os
import serial

terminal=serial.Serial( port='COM4',baudrate=115200,parity="N",stopbits=1,bytesize=8,timeout=8)
tr=terminal.isOpen()
if not terminal.isOpen():
    sys.exit()

cmd= 'STM32_Programmer_CLI.exe'
path=os.chdir(os.path.join("C:/Users\mjaballah/Desktop/STM32Cube/STM32CubeProgrammer/bin"))
os.system(cmd + ' ' + '-c port=swd -d "C:/Users/mjaballah/Desktop/stm32_uc/Debug/Robot_EniCar.hex" -v -s -log "C:/Users/mjaballah/Desktop/robot_enicar/test/log_debug/download.log" ')
input_data = terminal.readlines()
print(input_data)
terminal.close()
report=open(os.path.join("C:/Users/mjaballah/Desktop/robot_enicar/test/report/report.csv"),"w")
report.write(str(input_data))
report.close()




