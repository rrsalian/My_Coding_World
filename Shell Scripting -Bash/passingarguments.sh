#! /usr/bin/bash

echo $0 $1 $2 $3 ': echo $1 $2 $3'

args=("$@")  #default array is @

echo ${args[0]} ${args[1]} ${args[2]}

echo $@
echo $#    #array size