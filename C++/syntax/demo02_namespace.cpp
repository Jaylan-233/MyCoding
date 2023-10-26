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
// 指定使用某个命名空间 这样就不用在前面加上命名空间的名字了
using namespace second_space;
// 指定使用第二个命名空间
int main()
{
    // 使用第一个命名空间的函数func()
    first_space::func();
    // 使用第二个命名空间中的函数func()
    func();
    // 因为已经指定了所以不需要详细的说明使用哪个命名空间
    return 0;
}