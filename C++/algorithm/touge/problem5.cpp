#include<iostream>
using namespace std;
int main()
{
    int n50=0;
    int n30=0;
    int n10=0;
    int account;
    int totalAmount;
    cin >>totalAmount;
    // 能买多少个50的 -7杯
    n50=totalAmount/50;
    totalAmount-=(n50*50);
    // 能买多少个30的 -4杯
    n30=totalAmount/30;
    totalAmount-=(n30*30);
    // 能买多少个10的 -1杯
    n10=totalAmount/10;
    cout<<n10+(n30*4)+(n50*7);
    //模除是去取余数 这里要进行/不是模除
    return 0;
}