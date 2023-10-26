#include<iostream>
using namespace std;
namespace first_space
{
    void func()
    {
        cout <<"这是在第一个命名空间"<<endl;
    }
}
namespace second_space
{
    void func()
    {
        cout<<"这是在第二个命名空间"<<endl;
    }
}
// 使用命名空间
int main()
{
    // 使用第一个命名空间的函数func()
    first_space::func();
    // 使用第二个命名空间中的函数func()
    second_space::func();
    // 不指定命名空间使用func()会怎么样? 会报错 因为编译器在当前的命名空间中找不到func()
    // func();

    return 0;
}