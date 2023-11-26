#include <iostream>
using namespace std;
int main()
{
    int a = 0;    // 简单题数 5分一个
    int b = 0;    // 困难题数  错-20
    int c = 0;    // 对的简单题数
    int d = 0;    // 对的困难题数
    int M = 0;    // 简单题分数限制
    int sumE = 0; // 简单题得分
    int sumH = 0; // 困难题目得分
    int sum = 0;  // 总分
    cin >> a >> b >> c >> d >> M;

    // 计算简单题得分
    // 判断是否超过分数限制
    if (c * 5 < M)
    {
        sumE = c * 5;
        sumH = -((b - d) * (20));
        sum = sumE + sumH;
    }
    // c
    else
    {
         sumE = c * 5;
        sumH = d * 20 - ((b - d) * (20));
        sum = sumE + sumH;
    }
    // 困难题目分数
    if (sum < 0)
    {
        cout << 0;
    }
    else
    {
        cout << sum;
    }

    return 0;
}
