echo "Enter two intergers"

read a b

echo " To find GCD and LCM"

echo "please given two numbers are"

echo "a= $a and b=$b"

temp=`expr $a \* $b`

while [ $a != $b ]

do

if [ $a -gt $b ]

then

a=`expr $a - $b`

else

b=`expr $b - $a`

fi

done

echo GCD=$b

lcm=`expr $temp / $b`

echo LCM=$lcm
