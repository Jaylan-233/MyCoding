#include<iostream>
using namespace std;
int main()
{
    int N;
    int baseHeight;
    int needHeight;
    int account=0;
    cin >>N;
    cin >>baseHeight;
    while (N--)
    {
        cin >>needHeight;
        //如果基础高度+30>需要高度则 计数器++
        if((baseHeight+30)>=needHeight)
        {
            account++;
        }
    
    }
    cout << account;
    return 0;
}