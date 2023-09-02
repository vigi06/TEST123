#! /bin/bash

df -h | awk -F " " '{print $5 " " $1}' | while read output;

do
	echo "this is the thing which we want in our project"

	echo "this is the story of my life it is very interesting"

	echo "This is very crazy statement that we are going to discuss here"

	echo " this is pee"

	echo "this is the space $output"

	echo "this is lol which is very much fun"

        echo "this is see pee"
done

