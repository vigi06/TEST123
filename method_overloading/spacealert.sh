#! /bin/bash

df -h | awk -F " " '{print $5 " " $1}' | while read output;

do
	echo "this is the space $output"

done

