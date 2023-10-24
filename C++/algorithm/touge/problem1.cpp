//TOOD: 不知道是哪里出现到了问题 提交上去结果不匹配

#include<iostream>
#include<string>
using namespace std;
int main()
{
    // 读入字符串
    string mainStr;
    string subStr="love";    //设置字串
    int len;
    int account=0; // 字串计数器
    int index=0; // 
    cin >> mainStr; 
    len=mainStr.length();
    while (index<len)
    {
        if(mainStr.find(subStr,index)!=-1)
        {
            index+=subStr.length(); //找到了就跳过一个字串的长度
            account++;
        }
        else
        {
            index++;//没找到就移动一位
        }
    }
    if(account==0)
    {
        cout<< "表白失败";
    }
    else{
    cout << account;
    }

    return 0;

}