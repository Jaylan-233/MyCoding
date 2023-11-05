#include<iostream>
using namespace std;
int getDigitNum(int number);
int main()
{
    int N=0;
    int number=0;   
    int account=0;
    cin >>N;
    for(int i=0;i<N;i++)
    {
         cin >>number;
        //  判断是不是情侣数
         if(getDigitNum(number)%2==0)
         {
            account++;
         }
        
    }
    // 输出统计结果
    cout <<account;

}
// 用来判断数的位数有几个
int getDigitNum(int number){
    
    int digtNum=0;
    while(number)
    {
        number=number/10;
        digtNum++;
        // 计数器的的位置可以放在前面也可以放在后面 不影响      
    }
    return digtNum;
}
