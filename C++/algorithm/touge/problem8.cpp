#include<iostream>
using namespace std;
void ticketConvertion(int ticket);
int account=0;// 奶茶总数计数器
int main()
{
    int ticket=0;
    int butNum=0;
    cin >>butNum;
    // 记录下买了多少杯
    account+=butNum;
    // 一开始买了多少就有多少张券
    ticket=butNum;
    // 把券拿去兑换奶茶
    ticketConvertion(ticket);
    // 输出最后的奶茶总数
    cout<<account;
    return 0;
}
void ticketConvertion(int ticket)
{
    //记录能兑换多少杯
    int conversionNum=0;
    // 递归终止条件 券<3 不够兑换一杯的了
    if(ticket<3)
    {
        return;
    }
    // 三张券兑换一杯
    conversionNum=ticket/3;
    // 计数器 更新 +这次兑换的
    account+=conversionNum;
    //减去已经使用了的券
    ticket-=conversionNum*3;
    // 加上兑换又能得到的券 (兑换了几杯就加几张)
    ticket+=conversionNum;
    //继续递归调用进行兑换
    ticketConvertion(ticket);
}