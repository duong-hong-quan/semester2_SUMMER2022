/*
 * Main.cpp
 *
 *  Created on: Jun 7, 2022
 *      Author: hongquan
 */
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	int	ret;
	char cmd[10] = "man ls";
	ret= system(cmd);
	return ret;
}


