#include <iostream>
using namespace std;

int main()
{
    int sum_over_41 = 0;
    int sum_over_63 = 0;

    int data[301] = {0};
    // 读入数据

    for (int i = 0; i < 8; i++)
    {
        cin >> data[i];
        if (data[i] >= 118)
        {
            cout << 10;
            return 0;
        }
    }
    // 判断是否符合
    for (int i = 0; i < 301; i++)
    {
        if (data[i] >= 41)
        {
            sum_over_41++;
        }
        if (data[i] >= 63)
        {
            sum_over_63++;
        }
    }
    if (sum_over_41 < 4)
    {
        cout << 1;
        return 0;
    }
    // 满足 3号继续判断是否满足8号
    else if (sum_over_41 >= 4)
    {
        if (sum_over_63 >= 4)
        {
            cout << 8;
            return 0;
        }
        else
        {
            cout << 3;
            return 0;
        }
    }

    return 0;
}

//不是连续判断不要乱用else if 出错就打断点分析
