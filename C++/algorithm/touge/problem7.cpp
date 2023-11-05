#include<iostream>
using namespace std;
int eatPeach(int days,int peaches);
int main()
{
    int days;
    int lastDayPeaches=1;
    int count=0;
    cin >>days;
    count=eatPeach(days,lastDayPeaches);
    cout <<count;
    return 0;

}
int eatPeach(int days,int peaches)
{
    // 递归的结束条件 一直推到days=1即第一天
    if(days==1)
    {
        return peaches;
    }
    // 反推回到前一天
    days=days-1;
    // 前一天的桃子=(今天的桃子+1)*2个
    peaches=(peaches+1)*2;
    return eatPeach(days,peaches);
}