#!/bin/bash

mvn clean install

cd jpms.main
mvn exec:exec
cd ..

exit
