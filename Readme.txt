Description

This program uses third party API hosted at api.openweathermap.org website which is a restful webservice returns Json format
data. This code uses Restful Jersy client Java API to get data.


Configuration
dev.service.properties file contain host API url, citi ids which will be read by the program and generate a url which will be used by
application code to connect with api.openweathermap.org and citi ids in comma separated values as input parameters


Limitations
This freeware API allows 60 hits per day 

Installation

You need following software installed and configured on your machine

JDK - 1.7
installation guide - http://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html
configure environment variables for java set up


Verification

open command prompt and execute follwoing command
java -version

Run the program

open command prompt and go to <home directory> of this project
Run 'run.bat' file from command prompt

Result verification
Output file - weather_result_<day>_<month>_<year>