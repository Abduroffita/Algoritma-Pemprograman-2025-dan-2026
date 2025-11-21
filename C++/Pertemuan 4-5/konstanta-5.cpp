#include <iostream>
using namespace std;

int main()
{
    const float pi = 3.14159;
    float r;
    cout << "Masukkan jari-jari: ";
    cin >> r;
    float luas = pi * r * r;
    cout << "Luas lingkaran: " << luas << endl;
    return 0;
}