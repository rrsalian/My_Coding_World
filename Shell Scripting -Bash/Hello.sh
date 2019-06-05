#! /usr/bin/bash

# # this is a comment


echo "hello world" #This is hello world

#System/Default Variable
echo Our shell name is $BASH
echo Our shell version $BASH_VERSION
echo Our Home Directory $HOME
echo Our current Working directory $PWD


# UserDefined Variable
Aal=10
echo value $Aa;

name=Rakshith
echo My name is $name


#Reading Input
echo "Enteer the name :"
read name
echo "Enter the age :"
read age
echo "Name is $name and age is $age"

# Reading Multiple Input
echo "Enter the names :"
read name1 name2 name3
echo "Name are $name1 , $name2 , $name3 "

# Same line input:
read -p "FirstName :" fName 
echo "First Name is $fName "

# Password Input
read -sp "Password :" pass
echo 
echo "Password is " $pass

# Array Input
echo "Enter 3 array elements"
read -a ar
echo "Array Elements are : ${ar[0]} , ${ar[1]} ,${ar[2]} "

# read without variable
echo "Enter :"
read
echo "Entered value : $REPLY"





