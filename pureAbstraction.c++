#include<iostream>
using namespace std;
class Shape{
    public:
    virtual void area()=0;
};
class circle : public Shape{
    public:
    float a;
    circle(float n){
        a=n;
    }
    void area(){
        cout<<"ARea of circle : "<<1.34*a*a<<endl;
    }
};
int main(){
    double n;
    cout<<"enter radius of circle:";
    cin>>n;
    circle y(n);
    y.area();
}



