#include<iostream>
#include<string.h>
using namespace std;
template <class T>

void add_numbers(T x, T y){
    cout<<"Addition two numbers: "<<x+y<<endl;
}
int main(){
    int a,b,n;
    float a1,b1;
    double a2,b2;
    cout<<"\n1.integer\n2.float\n3.double\nEnter your choice : ";
    cin>>n;
    if(n==1){
        cout<<"Enter two numbers "<<endl;
        cin>>a>>b;
        add_numbers(a,b);
    }
    else if(n==2){
        cout<<"Enter two numbers "<<endl;
        cin>>a1>>b1;
        add_numbers(a1,b1);
    }
    else if(n==3){
        cout<<"Enter two numbers "<<endl;
        cin>>a2>>b2;
        add_numbers(a2,b2);
    }
    else{
        cout<<"invalid input\n";
    }
    return 0;
}

