#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int getSubStringNum(string mainStr,string subStr);
int main()
{
    string mainStr;
    int lN=0;
    int oN=0;
    int vN=0;
    int eN=0;
    int letterNum[4]={0,0,0,0}; //注意初始化数组
    int len;
    cin >> mainStr;
    len=mainStr.length();
    char str[mainStr.length()];
    strcpy(str,mainStr.data());// 字符串转数组
    for(int index=0;index<len;index++)
    {
        switch (str[index])
        {
        case 'l': letterNum[0]++;
            break;
        case 'o': letterNum[1]++;
            break;
        case 'v': letterNum[2]++;
            break;
        case 'e': letterNum[3]++;
            break;
        }
    };
    cout<< letterNum[0]<<"?"<<letterNum[1];
    // 获取所有字母中最小的那个 就是所需要的答案
    // cout<<*min_element(letterNum,letterNum+(sizeof(letterNum)/sizeof(letterNum[0])));
    return 0;
}
