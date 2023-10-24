#include<iostream>
#include<cstring>
using namespace std;
int getSubStringNum(string mainStr,string subStr);
int main()
{
    string mainStr;
    int lN=0;
    int oN=0;
    int vN=0;
    int eN=0;
    int account;
    int len;
    cin >> mainStr;
    len=mainStr.length();
    char str[mainStr.length()];
    strcpy(str,mainStr.data());// 字符串转数组
    for(int index=0;index<len;index++)
    {
        switch (str[index])
        {
        case 'l': lN++;
            break;
        case 'o': oN++;
            break;
        case 'v': vN++;
            break;
        case 'e': eN++;
            break;
        }
    };
    while(lN*oN*vN*eN) // 如果由一个为0则不能组成一个完整的love
    {
        lN--;
        oN--;
        vN--;
        eN--;
        account++;
    };
    cout<<account;

    return 0;
}
