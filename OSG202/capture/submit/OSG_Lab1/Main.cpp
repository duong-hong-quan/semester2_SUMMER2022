/*
 * Main.cpp
 *
 *  Created on: Jun 11, 2022
 *      Author: hongquan
 */
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
	pid_t	pChild;
	printf("The main processID is %d\n", getpid());
	pChild = fork();
	if(pChild != 0 ){
		printf("The parent ID of new is %d\n",getpid());
		printf("The new Child is %d\n",pChild);

	}else {
		printf("The Child id is %d\n",getpid());
	}
}


