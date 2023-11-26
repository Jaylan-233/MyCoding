#include <iostream>
using namespace std;
int main()
{
    int a;
    int b;
    int R;
    int V;
    int M;
    int sumR=0;
    int sumV=0;
    int sumM=0;
    cin>>a>>b>>R>>V>>M;
    sumR = 1 * b * R + 2 * a * 2 * R;
    sumV = 1 * b * V + 2 * a * 3 * V;
    sumM = 1 * b * M + 2 * a * 3 * M;

    cout << sumR << sumV << sumM;

    return 0;
}
