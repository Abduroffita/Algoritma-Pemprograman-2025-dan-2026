#include <iostream>
#include <conio.h>
using namespace std;

main()
{
    char nm1[50];
    char nm2[50];

    puts("Masukkan nama pertama ="); gets(nm1);
    puts("Masukkan nama kedua ="); scanf("%s",&nm2);

    puts("Selamat Datang"); puts(nm1);
    printf("Selamat Datang %s\n",nm2);
    return 0;
}