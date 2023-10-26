#include<iostream>
using namespace std;
int main()
{
    int luckyNum;
    int encNum;
    cin >>luckyNum>>encNum;  // cin会自动过滤 回车和空格  还有tab 所以能处理输入之间有空格的输入
    if(luckyNum>=10||encNum>=20)
    {
        cout <<"1";
    }
    else 
    {
        cout <<"0";
    }
    return 0;
}