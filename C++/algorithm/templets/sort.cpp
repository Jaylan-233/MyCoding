// 对数组进行排序
#include<iostream>
#include<algorithm> // 引入算法类库
#define N 5
using namespace std;
int main()
{
    
    int array[N]={1,7,9,2,3};
    cout<<"排序前";
    for (int i = 0; i < N; i++)
    {
        cout<<array[i]<<"-";
    }
    //调用类库sort函数进行排序
        sort(array,array+N);
    //数组大小可以用 array+sizeof(array)/sizeof(int)    
    // 参数 排序起始地址,结束地址
    cout<<endl;
    cout<<"排序后";
      for (int i = 0; i < N; i++)
    {
        cout<<array[i]<<"-";
    }
    



    return 0;
}

/*
要使用sort函数就要使用algorithm类库
sort(起始地址,结束地址)
*/