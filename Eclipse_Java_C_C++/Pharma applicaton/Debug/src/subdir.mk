################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/Pharma\ applicaton.cpp 

OBJS += \
./src/Pharma\ applicaton.o 

CPP_DEPS += \
./src/Pharma\ applicaton.d 


# Each subdirectory must supply rules for building sources it contributes
src/Pharma\ applicaton.o: ../src/Pharma\ applicaton.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"src/Pharma applicaton.d" -MT"src/Pharma\ applicaton.d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


